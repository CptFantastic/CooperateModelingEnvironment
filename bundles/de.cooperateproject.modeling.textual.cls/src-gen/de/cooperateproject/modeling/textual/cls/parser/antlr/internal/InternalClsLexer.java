package de.cooperateproject.modeling.textual.cls.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalClsLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_STEREOTYPE_C=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_UNDERSCORE=9;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_STEREOTYPE_O=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalClsLexer() {;} 
    public InternalClsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalClsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCls.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:11:7: ( '@start-clsd' )
            // InternalCls.g:11:9: '@start-clsd'
            {
            match("@start-clsd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:12:7: ( '@end-clsd' )
            // InternalCls.g:12:9: '@end-clsd'
            {
            match("@end-clsd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:13:7: ( 'rootPackage' )
            // InternalCls.g:13:9: 'rootPackage'
            {
            match("rootPackage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:14:7: ( 'package' )
            // InternalCls.g:14:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:15:7: ( '{' )
            // InternalCls.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:16:7: ( '}' )
            // InternalCls.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:17:7: ( 'import' )
            // InternalCls.g:17:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:18:7: ( '.' )
            // InternalCls.g:18:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:19:7: ( 'abstract' )
            // InternalCls.g:19:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:20:7: ( 'class' )
            // InternalCls.g:20:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:21:7: ( 'as' )
            // InternalCls.g:21:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:22:7: ( 'interface' )
            // InternalCls.g:22:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:23:7: ( 'static' )
            // InternalCls.g:23:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:24:7: ( ':' )
            // InternalCls.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:25:7: ( '(' )
            // InternalCls.g:25:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:26:7: ( ',' )
            // InternalCls.g:26:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:27:7: ( ')' )
            // InternalCls.g:27:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:28:7: ( 'isa' )
            // InternalCls.g:28:9: 'isa'
            {
            match("isa"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:29:7: ( 'impl' )
            // InternalCls.g:29:9: 'impl'
            {
            match("impl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:30:7: ( 'bi' )
            // InternalCls.g:30:9: 'bi'
            {
            match("bi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:31:7: ( 'role' )
            // InternalCls.g:31:9: 'role'
            {
            match("role"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:32:7: ( '[' )
            // InternalCls.g:32:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:33:7: ( ']' )
            // InternalCls.g:33:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:34:7: ( 'card' )
            // InternalCls.g:34:9: 'card'
            {
            match("card"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:35:7: ( 'note' )
            // InternalCls.g:35:9: 'note'
            {
            match("note"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:36:7: ( '..' )
            // InternalCls.g:36:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:37:7: ( '*' )
            // InternalCls.g:37:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:38:7: ( '+' )
            // InternalCls.g:38:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:39:7: ( 'public' )
            // InternalCls.g:39:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:40:7: ( '-' )
            // InternalCls.g:40:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:41:7: ( 'private' )
            // InternalCls.g:41:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:42:7: ( '#' )
            // InternalCls.g:42:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:43:7: ( 'protected' )
            // InternalCls.g:43:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:44:7: ( '~' )
            // InternalCls.g:44:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:45:7: ( 'asc' )
            // InternalCls.g:45:9: 'asc'
            {
            match("asc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:46:7: ( 'agg' )
            // InternalCls.g:46:9: 'agg'
            {
            match("agg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:47:7: ( 'com' )
            // InternalCls.g:47:9: 'com'
            {
            match("com"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:2282:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCls.g:2282:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCls.g:2282:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCls.g:2282:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCls.g:2282:36: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCls.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_UNDERSCORE"
    public final void mRULE_UNDERSCORE() throws RecognitionException {
        try {
            int _type = RULE_UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:2284:17: ( '_' )
            // InternalCls.g:2284:19: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNDERSCORE"

    // $ANTLR start "RULE_STEREOTYPE_O"
    public final void mRULE_STEREOTYPE_O() throws RecognitionException {
        try {
            int _type = RULE_STEREOTYPE_O;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:2286:19: ( ( '\\u00AB' | '<<' ) )
            // InternalCls.g:2286:21: ( '\\u00AB' | '<<' )
            {
            // InternalCls.g:2286:21: ( '\\u00AB' | '<<' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\u00AB') ) {
                alt3=1;
            }
            else if ( (LA3_0=='<') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCls.g:2286:22: '\\u00AB'
                    {
                    match('\u00AB'); 

                    }
                    break;
                case 2 :
                    // InternalCls.g:2286:31: '<<'
                    {
                    match("<<"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STEREOTYPE_O"

    // $ANTLR start "RULE_STEREOTYPE_C"
    public final void mRULE_STEREOTYPE_C() throws RecognitionException {
        try {
            int _type = RULE_STEREOTYPE_C;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:2288:19: ( ( '\\u00BB' | '>>' ) )
            // InternalCls.g:2288:21: ( '\\u00BB' | '>>' )
            {
            // InternalCls.g:2288:21: ( '\\u00BB' | '>>' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\u00BB') ) {
                alt4=1;
            }
            else if ( (LA4_0=='>') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCls.g:2288:22: '\\u00BB'
                    {
                    match('\u00BB'); 

                    }
                    break;
                case 2 :
                    // InternalCls.g:2288:31: '>>'
                    {
                    match(">>"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STEREOTYPE_C"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:2290:10: ( ( '0' .. '9' )+ )
            // InternalCls.g:2290:12: ( '0' .. '9' )+
            {
            // InternalCls.g:2290:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCls.g:2290:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:2292:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCls.g:2292:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCls.g:2292:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCls.g:2292:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCls.g:2292:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCls.g:2292:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCls.g:2292:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCls.g:2292:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCls.g:2292:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCls.g:2292:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCls.g:2292:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:2294:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCls.g:2294:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCls.g:2294:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCls.g:2294:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:2296:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCls.g:2296:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCls.g:2296:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCls.g:2296:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalCls.g:2296:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCls.g:2296:41: ( '\\r' )? '\\n'
                    {
                    // InternalCls.g:2296:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalCls.g:2296:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:2298:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCls.g:2298:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCls.g:2298:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCls.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:2300:16: ( . )
            // InternalCls.g:2300:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalCls.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_ID | RULE_UNDERSCORE | RULE_STEREOTYPE_O | RULE_STEREOTYPE_C | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=47;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalCls.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalCls.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalCls.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalCls.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalCls.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalCls.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalCls.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalCls.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalCls.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalCls.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalCls.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalCls.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalCls.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalCls.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalCls.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalCls.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalCls.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalCls.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalCls.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalCls.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalCls.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalCls.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalCls.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalCls.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalCls.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalCls.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalCls.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalCls.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalCls.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalCls.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalCls.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalCls.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalCls.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalCls.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalCls.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalCls.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalCls.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalCls.g:1:232: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // InternalCls.g:1:240: RULE_UNDERSCORE
                {
                mRULE_UNDERSCORE(); 

                }
                break;
            case 40 :
                // InternalCls.g:1:256: RULE_STEREOTYPE_O
                {
                mRULE_STEREOTYPE_O(); 

                }
                break;
            case 41 :
                // InternalCls.g:1:274: RULE_STEREOTYPE_C
                {
                mRULE_STEREOTYPE_C(); 

                }
                break;
            case 42 :
                // InternalCls.g:1:292: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 43 :
                // InternalCls.g:1:301: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 44 :
                // InternalCls.g:1:313: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 45 :
                // InternalCls.g:1:329: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 46 :
                // InternalCls.g:1:345: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 47 :
                // InternalCls.g:1:353: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\44\2\50\2\uffff\1\50\1\62\3\50\4\uffff\1\50\2\uffff\1\50\5\uffff\1\44\3\uffff\1\44\1\uffff\1\44\1\uffff\3\44\4\uffff\1\50\1\uffff\3\50\2\uffff\3\50\2\uffff\1\50\1\132\5\50\4\uffff\1\140\2\uffff\1\50\15\uffff\10\50\1\153\1\50\1\155\1\uffff\1\156\2\50\1\161\1\50\1\uffff\2\50\1\165\5\50\1\173\1\50\1\uffff\1\50\2\uffff\1\50\1\177\1\uffff\1\50\1\u0081\1\50\1\uffff\5\50\1\uffff\2\50\1\u008a\1\uffff\1\50\1\uffff\2\50\1\u008e\2\50\1\u0091\2\50\1\uffff\1\u0094\1\50\1\u0096\1\uffff\1\u0097\1\50\1\uffff\2\50\1\uffff\1\50\2\uffff\2\50\1\u009e\1\50\1\u00a0\1\u00a1\1\uffff\1\50\2\uffff\1\u00a3\1\uffff";
    static final String DFA14_eofS =
        "\u00a4\uffff";
    static final String DFA14_minS =
        "\1\0\1\145\1\157\1\141\2\uffff\1\155\1\56\1\142\1\141\1\164\4\uffff\1\151\2\uffff\1\157\5\uffff\1\101\3\uffff\1\74\1\uffff\1\76\1\uffff\2\0\1\52\4\uffff\1\154\1\uffff\1\143\1\142\1\151\2\uffff\1\160\1\164\1\141\2\uffff\1\163\1\60\1\147\1\141\1\162\1\155\1\141\4\uffff\1\60\2\uffff\1\164\15\uffff\1\164\1\145\1\153\1\154\1\166\1\164\1\154\1\145\1\60\1\164\1\60\1\uffff\1\60\1\163\1\144\1\60\1\164\1\uffff\1\145\1\120\1\60\1\141\1\151\1\141\1\145\1\162\1\60\1\162\1\uffff\1\162\2\uffff\1\163\1\60\1\uffff\1\151\1\60\1\141\1\uffff\1\147\1\143\1\164\1\143\1\164\1\uffff\1\146\1\141\1\60\1\uffff\1\143\1\uffff\1\143\1\145\1\60\1\145\1\164\1\60\1\141\1\143\1\uffff\1\60\1\153\1\60\1\uffff\1\60\1\145\1\uffff\1\143\1\164\1\uffff\1\141\2\uffff\1\144\1\145\1\60\1\147\2\60\1\uffff\1\145\2\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\163\1\157\1\165\2\uffff\1\163\1\56\1\163\1\157\1\164\4\uffff\1\151\2\uffff\1\157\5\uffff\1\172\3\uffff\1\74\1\uffff\1\76\1\uffff\2\uffff\1\57\4\uffff\1\157\1\uffff\1\143\1\142\1\157\2\uffff\1\160\1\164\1\141\2\uffff\1\163\1\172\1\147\1\141\1\162\1\155\1\141\4\uffff\1\172\2\uffff\1\164\15\uffff\1\164\1\145\1\153\1\154\1\166\1\164\1\157\1\145\1\172\1\164\1\172\1\uffff\1\172\1\163\1\144\1\172\1\164\1\uffff\1\145\1\120\1\172\1\141\1\151\1\141\1\145\1\162\1\172\1\162\1\uffff\1\162\2\uffff\1\163\1\172\1\uffff\1\151\1\172\1\141\1\uffff\1\147\1\143\1\164\1\143\1\164\1\uffff\1\146\1\141\1\172\1\uffff\1\143\1\uffff\1\143\1\145\1\172\1\145\1\164\1\172\1\141\1\143\1\uffff\1\172\1\153\1\172\1\uffff\1\172\1\145\1\uffff\1\143\1\164\1\uffff\1\141\2\uffff\1\144\1\145\1\172\1\147\2\172\1\uffff\1\145\2\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\5\1\6\5\uffff\1\16\1\17\1\20\1\21\1\uffff\1\26\1\27\1\uffff\1\33\1\34\1\36\1\40\1\42\1\uffff\1\46\1\47\1\50\1\uffff\1\51\1\uffff\1\52\3\uffff\1\56\1\57\1\1\1\2\1\uffff\1\46\3\uffff\1\5\1\6\3\uffff\1\32\1\10\7\uffff\1\16\1\17\1\20\1\21\1\uffff\1\26\1\27\1\uffff\1\33\1\34\1\36\1\40\1\42\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\13\uffff\1\13\5\uffff\1\24\12\uffff\1\22\1\uffff\1\43\1\44\2\uffff\1\45\3\uffff\1\25\5\uffff\1\23\3\uffff\1\30\1\uffff\1\31\10\uffff\1\12\3\uffff\1\35\2\uffff\1\7\2\uffff\1\15\1\uffff\1\4\1\37\6\uffff\1\11\1\uffff\1\41\1\14\1\uffff\1\3";
    static final String DFA14_specialS =
        "\1\1\37\uffff\1\0\1\2\u0082\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\44\1\40\1\26\3\44\1\41\1\14\1\16\1\23\1\24\1\15\1\25\1\7\1\42\12\37\1\13\1\44\1\34\1\44\1\36\1\44\1\1\32\31\1\20\1\44\1\21\1\30\1\32\1\44\1\10\1\17\1\11\5\31\1\6\4\31\1\22\1\31\1\3\1\31\1\2\1\12\7\31\1\4\1\44\1\5\1\27\54\44\1\33\17\44\1\35\uff44\44",
            "\1\46\15\uffff\1\45",
            "\1\47",
            "\1\51\20\uffff\1\53\2\uffff\1\52",
            "",
            "",
            "\1\56\1\57\4\uffff\1\60",
            "\1\61",
            "\1\63\4\uffff\1\65\13\uffff\1\64",
            "\1\67\12\uffff\1\66\2\uffff\1\70",
            "\1\71",
            "",
            "",
            "",
            "",
            "\1\76",
            "",
            "",
            "\1\101",
            "",
            "",
            "",
            "",
            "",
            "\32\50\6\uffff\32\50",
            "",
            "",
            "",
            "\1\110",
            "",
            "\1\111",
            "",
            "\0\113",
            "\0\113",
            "\1\114\4\uffff\1\115",
            "",
            "",
            "",
            "",
            "\1\120\2\uffff\1\117",
            "",
            "\1\121",
            "\1\122",
            "\1\123\5\uffff\1\124",
            "",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "",
            "\1\130",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\2\50\1\131\27\50",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\141",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\151\2\uffff\1\150",
            "\1\152",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\154",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\157",
            "\1\160",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\162",
            "",
            "\1\163",
            "\1\164",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\174",
            "",
            "\1\175",
            "",
            "",
            "\1\176",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0080",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0082",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "\1\u0089",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u008b",
            "",
            "\1\u008c",
            "\1\u008d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u008f",
            "\1\u0090",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0092",
            "\1\u0093",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0095",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "",
            "",
            "\1\u009c",
            "\1\u009d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00a2",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_ID | RULE_UNDERSCORE | RULE_STEREOTYPE_O | RULE_STEREOTYPE_C | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_32 = input.LA(1);

                        s = -1;
                        if ( ((LA14_32>='\u0000' && LA14_32<='\uFFFF')) ) {s = 75;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='@') ) {s = 1;}

                        else if ( (LA14_0=='r') ) {s = 2;}

                        else if ( (LA14_0=='p') ) {s = 3;}

                        else if ( (LA14_0=='{') ) {s = 4;}

                        else if ( (LA14_0=='}') ) {s = 5;}

                        else if ( (LA14_0=='i') ) {s = 6;}

                        else if ( (LA14_0=='.') ) {s = 7;}

                        else if ( (LA14_0=='a') ) {s = 8;}

                        else if ( (LA14_0=='c') ) {s = 9;}

                        else if ( (LA14_0=='s') ) {s = 10;}

                        else if ( (LA14_0==':') ) {s = 11;}

                        else if ( (LA14_0=='(') ) {s = 12;}

                        else if ( (LA14_0==',') ) {s = 13;}

                        else if ( (LA14_0==')') ) {s = 14;}

                        else if ( (LA14_0=='b') ) {s = 15;}

                        else if ( (LA14_0=='[') ) {s = 16;}

                        else if ( (LA14_0==']') ) {s = 17;}

                        else if ( (LA14_0=='n') ) {s = 18;}

                        else if ( (LA14_0=='*') ) {s = 19;}

                        else if ( (LA14_0=='+') ) {s = 20;}

                        else if ( (LA14_0=='-') ) {s = 21;}

                        else if ( (LA14_0=='#') ) {s = 22;}

                        else if ( (LA14_0=='~') ) {s = 23;}

                        else if ( (LA14_0=='^') ) {s = 24;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||(LA14_0>='d' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='m')||LA14_0=='o'||LA14_0=='q'||(LA14_0>='t' && LA14_0<='z')) ) {s = 25;}

                        else if ( (LA14_0=='_') ) {s = 26;}

                        else if ( (LA14_0=='\u00AB') ) {s = 27;}

                        else if ( (LA14_0=='<') ) {s = 28;}

                        else if ( (LA14_0=='\u00BB') ) {s = 29;}

                        else if ( (LA14_0=='>') ) {s = 30;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 31;}

                        else if ( (LA14_0=='\"') ) {s = 32;}

                        else if ( (LA14_0=='\'') ) {s = 33;}

                        else if ( (LA14_0=='/') ) {s = 34;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 35;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='$' && LA14_0<='&')||LA14_0==';'||LA14_0=='='||LA14_0=='?'||LA14_0=='\\'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='\u007F' && LA14_0<='\u00AA')||(LA14_0>='\u00AC' && LA14_0<='\u00BA')||(LA14_0>='\u00BC' && LA14_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_33 = input.LA(1);

                        s = -1;
                        if ( ((LA14_33>='\u0000' && LA14_33<='\uFFFF')) ) {s = 75;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}