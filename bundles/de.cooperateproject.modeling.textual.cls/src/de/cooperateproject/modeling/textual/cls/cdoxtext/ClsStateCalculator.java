/*
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.cls.cdoxtext;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IDerivedStateComputer;

import com.google.inject.Inject;

import net.winklerweb.cdoxtext.runtime.ICDOResourceStateCalculator;

public class ClsStateCalculator implements ICDOResourceStateCalculator {

    @Inject
    private IDerivedStateComputer derivedStateComputer;
    
    @Override
    public void calculateState(Resource r) {
        if (!r.getContents().isEmpty()) {
            calculateState(r.getContents().get(0));
        }
    }

    @Override
    public void calculateState(EObject object) {
        // TODO Auto-generated method stub
        return;
    }

}
