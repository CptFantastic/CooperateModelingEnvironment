package de.cooperateproject.ui.focus.views;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.*;

import de.cooperateproject.ui.focus.connection.SubscriberManager;
import de.cooperateproject.ui.focus.internal.FocusManager;
import de.cooperateproject.ui.focus.labeling.FocusViewLabelProvider;
import de.cooperateproject.ui.focus.labeling.HistoryElement;
import de.cooperateproject.ui.focus.labeling.UMLelementToStringSwitch;

import java.awt.Toolkit;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;

/**
 * The view of the plugin.
 * 
 * @author Jasmin
 *
 */
public class FocusView extends ViewPart {
	public static final String ID = "de.cooperateproject.ui.focus.views.FocusView";
	private TableViewer historyViewer; // lists all deictic gestures (element
										// focuses) that have been made
	private LinkedList<HistoryElement> historyFocusEntries = new LinkedList<HistoryElement>();
	private Action doubleClickActionHistoryViewer;
	private FocusDialog focusDialog;
	private Text titleText;
	private Button muteButton;
	private Composite parent;

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		setUpView();
		setUpDialogs();
		makeActions();
		hookDoubleClickAction();
	}

	/**
	 * Sets the diagram's title in the view.
	 * 
	 * @param title
	 *            the title of the diagram
	 */
	public void setTitleText(String title) {
		titleText.setText(title);
	}

	/**
	 * Notifies the user that a focus request was received. Asks him, if he'd
	 * like to set the focus or not.
	 * 
	 * @param focusedObject
	 *            the object which was focused in the focus request
	 * @param timeStamp
	 *            the time at which the focus request was sent
	 */
	public void handleFocusRequest(EObject focusedObject, long timeStamp) {
		if (focusedObject == null) {
			return;
		}
		historyFocusEntries.add(new HistoryElement(focusedObject, timeStamp));
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				historyViewer.refresh();

				for (TableColumn c : historyViewer.getTable().getColumns()) {
					c.pack();
				}
				focusDialog.setFocusedElement(focusedObject);
				focusDialog.open();
			}
		});

	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus() {
		historyViewer.getControl().setFocus();
	}

	public void hitMuteButton() {
		muteButton.setSelection(!muteButton.getSelection());
		muteButtonAction();
	}

	/**
	 * Send an own focus request. Extracts the selected element by asking the
	 * FocusManager and delegates the focus request to the subscriberManager in
	 * order to send it.
	 */
	public void sendFocusRequest() {
		EObject focusedElement = FocusManager.getInstance().getFocusedElement();
		if (UMLelementToStringSwitch.isOfSupportedType(focusedElement)) {
			SubscriberManager.getInstance().sendFocusRequest(FocusManager.getInstance().getFocusedElement());
		} else {
			Toolkit.getDefaultToolkit().beep();
			final String message = "Unsupported object type: focus on this object couldn't be sent.";
			MessageDialog focusTypeNotSupportedDialog = new MessageDialog(parent.getShell(), "Focus not sent", null,
					message, MessageDialog.WARNING, new String[] { "Ok" }, 0);
			focusTypeNotSupportedDialog.open();
		}
	}

	private void muteButtonAction() {
		if (muteButton.getSelection()) { // selected means muted
			SubscriberManager.getInstance().unsubscribe();
			muteButton.setText("unmute");
		} else {
			SubscriberManager.getInstance().subscribe();
			muteButton.setText("mute");
		}
	}

	/**
	 * Initializes all needed dialog windows.
	 */
	private void setUpDialogs() {
		focusDialog = new FocusDialog(parent.getShell());
	}

	private void makeActions() {
		doubleClickActionHistoryViewer = new Action() {
			public void run() {
				IStructuredSelection selection = (IStructuredSelection) historyViewer.getSelection();
				if (selection.getFirstElement() instanceof HistoryElement)
					FocusManager.getInstance()
							.setFocusedElement(((HistoryElement) selection.getFirstElement()).getFocusedElement());
			}
		};
	}

	private void hookDoubleClickAction() {
		historyViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickActionHistoryViewer.run();
			}
		});
	}

	/**
	 * Initializes the view of this plugin.
	 * 
	 * @param parent
	 */
	private void setUpView() {

		final Composite focusComposite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		GridLayout layoutForButtons = new GridLayout();
		GridData gridData;
		layout.numColumns = 4;
		layout.makeColumnsEqualWidth = true;
		focusComposite.setLayout(layout);
		titleText = new Text(focusComposite, SWT.HORIZONTAL | SWT.CENTER | SWT.READ_ONLY | SWT.WRAP);
		historyViewer = new TableViewer(focusComposite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		final Composite buttonComposite = new Composite(focusComposite, SWT.NULL);
		buttonComposite.setLayout(layoutForButtons);
		titleText.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_GRAY));

		gridData = new GridData();
		gridData.horizontalSpan = 4;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = false;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.CENTER;
		gridData.heightHint = 15;

		titleText.setLayoutData(gridData);

		gridData = new GridData();
		gridData.horizontalSpan = 3;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessVerticalSpace = true;
		gridData.grabExcessHorizontalSpace = true;

		historyViewer.getTable().setLayoutData(gridData);
		historyViewer.getTable().setHeaderVisible(true);
		historyViewer.getTable().setLinesVisible(false);
		String[] columnNames = new String[] { "Time", "Focused element" };
		for (int i = 0; i < columnNames.length; i++) {
			TableColumn tableColumn = new TableColumn(historyViewer.getTable(), SWT.LEFT);
			tableColumn.setText(columnNames[i]);
			tableColumn.pack();
		}

		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		buttonComposite.setLayoutData(gridData);

		muteButton = new Button(buttonComposite, SWT.TOGGLE);
		muteButton.setText("mute");
		muteButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				muteButtonAction();
			}
		});

		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.heightHint = 50;

		muteButton.setLayoutData(gridData);

		final Button focusButton = new Button(buttonComposite, SWT.PUSH);
		focusButton.setText("send focus");
		focusButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				sendFocusRequest();
			}
		});

		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.heightHint = 50;

		focusButton.setLayoutData(gridData);

		final Button clearButton = new Button(buttonComposite, SWT.PUSH);
		clearButton.setText("clear history");
		clearButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				historyFocusEntries.clear();
				historyViewer.refresh();
			}
		});

		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.heightHint = 50;

		clearButton.setLayoutData(gridData);

		historyViewer.setContentProvider(ArrayContentProvider.getInstance());
		historyViewer.setInput(historyFocusEntries);
		historyViewer.setLabelProvider(new FocusViewLabelProvider());
		getSite().setSelectionProvider(historyViewer);
	}

	private class FocusDialog extends Dialog {

		private EObject focusedElement;
		UMLelementToStringSwitch umlSwitch = new UMLelementToStringSwitch();

		protected FocusDialog(Shell parentShell) {
			super(parentShell);
		}

		@Override
		protected void setShellStyle(int arg0) {
			super.setShellStyle(SWT.TITLE);
		}

		@Override
		protected void okPressed() {
			super.okPressed();
			FocusManager.getInstance().setFocusedElement(focusedElement);
		}

		@Override
		public int open() {
			return super.open();
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite container = (Composite) super.createDialogArea(parent);
			container.getShell().setText("Incoming element focus");
			final Text text = new Text(container, SWT.HORIZONTAL | SWT.LEFT | SWT.WRAP | SWT.READ_ONLY);
			text.setText(umlSwitch.doSwitch(focusedElement) + " has been focused. Would you like to jump to it?");
			return text;
		}

		@Override
		protected void createButtonsForButtonBar(Composite parent) {
			super.createButtonsForButtonBar(parent);
			Button yes = getButton(IDialogConstants.OK_ID);
			yes.setText("Yes");
			setButtonLayoutData(yes);
			Button no = getButton(IDialogConstants.CANCEL_ID);
			no.setText("No");
			setButtonLayoutData(no);
		}

		public void setFocusedElement(EObject focusedElement) {
			Toolkit.getDefaultToolkit().beep();
			this.focusedElement = focusedElement;
		}

	}

}
