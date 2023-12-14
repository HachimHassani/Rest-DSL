package org.example.restdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.example.restdsl.services.RestDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'read'", "'update'", "'delete'", "'customEndpoint'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'entity'", "'{'", "'}'", "':'", "'restApi'", "'path'", "'request'", "'response'", "'logic'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRestDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRestDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRestDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRestDsl.g"; }


    	private RestDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(RestDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRestDsl"
    // InternalRestDsl.g:53:1: entryRuleRestDsl : ruleRestDsl EOF ;
    public final void entryRuleRestDsl() throws RecognitionException {
        try {
            // InternalRestDsl.g:54:1: ( ruleRestDsl EOF )
            // InternalRestDsl.g:55:1: ruleRestDsl EOF
            {
             before(grammarAccess.getRestDslRule()); 
            pushFollow(FOLLOW_1);
            ruleRestDsl();

            state._fsp--;

             after(grammarAccess.getRestDslRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRestDsl"


    // $ANTLR start "ruleRestDsl"
    // InternalRestDsl.g:62:1: ruleRestDsl : ( ( rule__RestDsl__Alternatives )* ) ;
    public final void ruleRestDsl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:66:2: ( ( ( rule__RestDsl__Alternatives )* ) )
            // InternalRestDsl.g:67:2: ( ( rule__RestDsl__Alternatives )* )
            {
            // InternalRestDsl.g:67:2: ( ( rule__RestDsl__Alternatives )* )
            // InternalRestDsl.g:68:3: ( rule__RestDsl__Alternatives )*
            {
             before(grammarAccess.getRestDslAccess().getAlternatives()); 
            // InternalRestDsl.g:69:3: ( rule__RestDsl__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20||LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRestDsl.g:69:4: rule__RestDsl__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__RestDsl__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRestDslAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestDsl"


    // $ANTLR start "entryRuleEntity"
    // InternalRestDsl.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalRestDsl.g:79:1: ( ruleEntity EOF )
            // InternalRestDsl.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalRestDsl.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalRestDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalRestDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalRestDsl.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalRestDsl.g:94:3: ( rule__Entity__Group__0 )
            // InternalRestDsl.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleField"
    // InternalRestDsl.g:103:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalRestDsl.g:104:1: ( ruleField EOF )
            // InternalRestDsl.g:105:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalRestDsl.g:112:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:116:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalRestDsl.g:117:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalRestDsl.g:117:2: ( ( rule__Field__Group__0 ) )
            // InternalRestDsl.g:118:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalRestDsl.g:119:3: ( rule__Field__Group__0 )
            // InternalRestDsl.g:119:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleRestApi"
    // InternalRestDsl.g:128:1: entryRuleRestApi : ruleRestApi EOF ;
    public final void entryRuleRestApi() throws RecognitionException {
        try {
            // InternalRestDsl.g:129:1: ( ruleRestApi EOF )
            // InternalRestDsl.g:130:1: ruleRestApi EOF
            {
             before(grammarAccess.getRestApiRule()); 
            pushFollow(FOLLOW_1);
            ruleRestApi();

            state._fsp--;

             after(grammarAccess.getRestApiRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRestApi"


    // $ANTLR start "ruleRestApi"
    // InternalRestDsl.g:137:1: ruleRestApi : ( ( rule__RestApi__Group__0 ) ) ;
    public final void ruleRestApi() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:141:2: ( ( ( rule__RestApi__Group__0 ) ) )
            // InternalRestDsl.g:142:2: ( ( rule__RestApi__Group__0 ) )
            {
            // InternalRestDsl.g:142:2: ( ( rule__RestApi__Group__0 ) )
            // InternalRestDsl.g:143:3: ( rule__RestApi__Group__0 )
            {
             before(grammarAccess.getRestApiAccess().getGroup()); 
            // InternalRestDsl.g:144:3: ( rule__RestApi__Group__0 )
            // InternalRestDsl.g:144:4: rule__RestApi__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RestApi__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestApiAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestApi"


    // $ANTLR start "entryRuleOperation"
    // InternalRestDsl.g:153:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalRestDsl.g:154:1: ( ruleOperation EOF )
            // InternalRestDsl.g:155:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalRestDsl.g:162:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:166:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalRestDsl.g:167:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalRestDsl.g:167:2: ( ( rule__Operation__Group__0 ) )
            // InternalRestDsl.g:168:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalRestDsl.g:169:3: ( rule__Operation__Group__0 )
            // InternalRestDsl.g:169:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleType"
    // InternalRestDsl.g:178:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalRestDsl.g:179:1: ( ruleType EOF )
            // InternalRestDsl.g:180:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalRestDsl.g:187:1: ruleType : ( ( rule__Type__TypeAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:191:2: ( ( ( rule__Type__TypeAssignment ) ) )
            // InternalRestDsl.g:192:2: ( ( rule__Type__TypeAssignment ) )
            {
            // InternalRestDsl.g:192:2: ( ( rule__Type__TypeAssignment ) )
            // InternalRestDsl.g:193:3: ( rule__Type__TypeAssignment )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment()); 
            // InternalRestDsl.g:194:3: ( rule__Type__TypeAssignment )
            // InternalRestDsl.g:194:4: rule__Type__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLogic"
    // InternalRestDsl.g:203:1: entryRuleLogic : ruleLogic EOF ;
    public final void entryRuleLogic() throws RecognitionException {
        try {
            // InternalRestDsl.g:204:1: ( ruleLogic EOF )
            // InternalRestDsl.g:205:1: ruleLogic EOF
            {
             before(grammarAccess.getLogicRule()); 
            pushFollow(FOLLOW_1);
            ruleLogic();

            state._fsp--;

             after(grammarAccess.getLogicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogic"


    // $ANTLR start "ruleLogic"
    // InternalRestDsl.g:212:1: ruleLogic : ( ( rule__Logic__Group__0 ) ) ;
    public final void ruleLogic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:216:2: ( ( ( rule__Logic__Group__0 ) ) )
            // InternalRestDsl.g:217:2: ( ( rule__Logic__Group__0 ) )
            {
            // InternalRestDsl.g:217:2: ( ( rule__Logic__Group__0 ) )
            // InternalRestDsl.g:218:3: ( rule__Logic__Group__0 )
            {
             before(grammarAccess.getLogicAccess().getGroup()); 
            // InternalRestDsl.g:219:3: ( rule__Logic__Group__0 )
            // InternalRestDsl.g:219:4: rule__Logic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Logic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogic"


    // $ANTLR start "rule__RestDsl__Alternatives"
    // InternalRestDsl.g:227:1: rule__RestDsl__Alternatives : ( ( ( rule__RestDsl__EntitiesAssignment_0 ) ) | ( ( rule__RestDsl__RestApisAssignment_1 ) ) );
    public final void rule__RestDsl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:231:1: ( ( ( rule__RestDsl__EntitiesAssignment_0 ) ) | ( ( rule__RestDsl__RestApisAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRestDsl.g:232:2: ( ( rule__RestDsl__EntitiesAssignment_0 ) )
                    {
                    // InternalRestDsl.g:232:2: ( ( rule__RestDsl__EntitiesAssignment_0 ) )
                    // InternalRestDsl.g:233:3: ( rule__RestDsl__EntitiesAssignment_0 )
                    {
                     before(grammarAccess.getRestDslAccess().getEntitiesAssignment_0()); 
                    // InternalRestDsl.g:234:3: ( rule__RestDsl__EntitiesAssignment_0 )
                    // InternalRestDsl.g:234:4: rule__RestDsl__EntitiesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestDsl__EntitiesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRestDslAccess().getEntitiesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRestDsl.g:238:2: ( ( rule__RestDsl__RestApisAssignment_1 ) )
                    {
                    // InternalRestDsl.g:238:2: ( ( rule__RestDsl__RestApisAssignment_1 ) )
                    // InternalRestDsl.g:239:3: ( rule__RestDsl__RestApisAssignment_1 )
                    {
                     before(grammarAccess.getRestDslAccess().getRestApisAssignment_1()); 
                    // InternalRestDsl.g:240:3: ( rule__RestDsl__RestApisAssignment_1 )
                    // InternalRestDsl.g:240:4: rule__RestDsl__RestApisAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestDsl__RestApisAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRestDslAccess().getRestApisAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestDsl__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives_0"
    // InternalRestDsl.g:248:1: rule__Operation__Alternatives_0 : ( ( 'create' ) | ( 'read' ) | ( 'update' ) | ( 'delete' ) | ( 'customEndpoint' ) );
    public final void rule__Operation__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:252:1: ( ( 'create' ) | ( 'read' ) | ( 'update' ) | ( 'delete' ) | ( 'customEndpoint' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRestDsl.g:253:2: ( 'create' )
                    {
                    // InternalRestDsl.g:253:2: ( 'create' )
                    // InternalRestDsl.g:254:3: 'create'
                    {
                     before(grammarAccess.getOperationAccess().getCreateKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getCreateKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRestDsl.g:259:2: ( 'read' )
                    {
                    // InternalRestDsl.g:259:2: ( 'read' )
                    // InternalRestDsl.g:260:3: 'read'
                    {
                     before(grammarAccess.getOperationAccess().getReadKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getReadKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRestDsl.g:265:2: ( 'update' )
                    {
                    // InternalRestDsl.g:265:2: ( 'update' )
                    // InternalRestDsl.g:266:3: 'update'
                    {
                     before(grammarAccess.getOperationAccess().getUpdateKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getUpdateKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRestDsl.g:271:2: ( 'delete' )
                    {
                    // InternalRestDsl.g:271:2: ( 'delete' )
                    // InternalRestDsl.g:272:3: 'delete'
                    {
                     before(grammarAccess.getOperationAccess().getDeleteKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getDeleteKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRestDsl.g:277:2: ( 'customEndpoint' )
                    {
                    // InternalRestDsl.g:277:2: ( 'customEndpoint' )
                    // InternalRestDsl.g:278:3: 'customEndpoint'
                    {
                     before(grammarAccess.getOperationAccess().getCustomEndpointKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getCustomEndpointKeyword_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives_0"


    // $ANTLR start "rule__Operation__MethodAlternatives_3_0"
    // InternalRestDsl.g:287:1: rule__Operation__MethodAlternatives_3_0 : ( ( 'GET' ) | ( 'POST' ) | ( 'PUT' ) | ( 'DELETE' ) );
    public final void rule__Operation__MethodAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:291:1: ( ( 'GET' ) | ( 'POST' ) | ( 'PUT' ) | ( 'DELETE' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRestDsl.g:292:2: ( 'GET' )
                    {
                    // InternalRestDsl.g:292:2: ( 'GET' )
                    // InternalRestDsl.g:293:3: 'GET'
                    {
                     before(grammarAccess.getOperationAccess().getMethodGETKeyword_3_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getMethodGETKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRestDsl.g:298:2: ( 'POST' )
                    {
                    // InternalRestDsl.g:298:2: ( 'POST' )
                    // InternalRestDsl.g:299:3: 'POST'
                    {
                     before(grammarAccess.getOperationAccess().getMethodPOSTKeyword_3_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getMethodPOSTKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRestDsl.g:304:2: ( 'PUT' )
                    {
                    // InternalRestDsl.g:304:2: ( 'PUT' )
                    // InternalRestDsl.g:305:3: 'PUT'
                    {
                     before(grammarAccess.getOperationAccess().getMethodPUTKeyword_3_0_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getMethodPUTKeyword_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRestDsl.g:310:2: ( 'DELETE' )
                    {
                    // InternalRestDsl.g:310:2: ( 'DELETE' )
                    // InternalRestDsl.g:311:3: 'DELETE'
                    {
                     before(grammarAccess.getOperationAccess().getMethodDELETEKeyword_3_0_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getMethodDELETEKeyword_3_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__MethodAlternatives_3_0"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalRestDsl.g:320:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:324:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalRestDsl.g:325:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalRestDsl.g:332:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:336:1: ( ( 'entity' ) )
            // InternalRestDsl.g:337:1: ( 'entity' )
            {
            // InternalRestDsl.g:337:1: ( 'entity' )
            // InternalRestDsl.g:338:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalRestDsl.g:347:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:351:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalRestDsl.g:352:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalRestDsl.g:359:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:363:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalRestDsl.g:364:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalRestDsl.g:364:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalRestDsl.g:365:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalRestDsl.g:366:2: ( rule__Entity__NameAssignment_1 )
            // InternalRestDsl.g:366:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalRestDsl.g:374:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:378:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalRestDsl.g:379:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalRestDsl.g:386:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:390:1: ( ( '{' ) )
            // InternalRestDsl.g:391:1: ( '{' )
            {
            // InternalRestDsl.g:391:1: ( '{' )
            // InternalRestDsl.g:392:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalRestDsl.g:401:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:405:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalRestDsl.g:406:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalRestDsl.g:413:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__FieldsAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:417:1: ( ( ( rule__Entity__FieldsAssignment_3 )* ) )
            // InternalRestDsl.g:418:1: ( ( rule__Entity__FieldsAssignment_3 )* )
            {
            // InternalRestDsl.g:418:1: ( ( rule__Entity__FieldsAssignment_3 )* )
            // InternalRestDsl.g:419:2: ( rule__Entity__FieldsAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_3()); 
            // InternalRestDsl.g:420:2: ( rule__Entity__FieldsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRestDsl.g:420:3: rule__Entity__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entity__FieldsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFieldsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalRestDsl.g:428:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:432:1: ( rule__Entity__Group__4__Impl )
            // InternalRestDsl.g:433:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalRestDsl.g:439:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:443:1: ( ( '}' ) )
            // InternalRestDsl.g:444:1: ( '}' )
            {
            // InternalRestDsl.g:444:1: ( '}' )
            // InternalRestDsl.g:445:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalRestDsl.g:455:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:459:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalRestDsl.g:460:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalRestDsl.g:467:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:471:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // InternalRestDsl.g:472:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // InternalRestDsl.g:472:1: ( ( rule__Field__NameAssignment_0 ) )
            // InternalRestDsl.g:473:2: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // InternalRestDsl.g:474:2: ( rule__Field__NameAssignment_0 )
            // InternalRestDsl.g:474:3: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalRestDsl.g:482:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:486:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalRestDsl.g:487:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalRestDsl.g:494:1: rule__Field__Group__1__Impl : ( ':' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:498:1: ( ( ':' ) )
            // InternalRestDsl.g:499:1: ( ':' )
            {
            // InternalRestDsl.g:499:1: ( ':' )
            // InternalRestDsl.g:500:2: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalRestDsl.g:509:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:513:1: ( rule__Field__Group__2__Impl )
            // InternalRestDsl.g:514:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalRestDsl.g:520:1: rule__Field__Group__2__Impl : ( ( rule__Field__TypeAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:524:1: ( ( ( rule__Field__TypeAssignment_2 ) ) )
            // InternalRestDsl.g:525:1: ( ( rule__Field__TypeAssignment_2 ) )
            {
            // InternalRestDsl.g:525:1: ( ( rule__Field__TypeAssignment_2 ) )
            // InternalRestDsl.g:526:2: ( rule__Field__TypeAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
            // InternalRestDsl.g:527:2: ( rule__Field__TypeAssignment_2 )
            // InternalRestDsl.g:527:3: rule__Field__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__RestApi__Group__0"
    // InternalRestDsl.g:536:1: rule__RestApi__Group__0 : rule__RestApi__Group__0__Impl rule__RestApi__Group__1 ;
    public final void rule__RestApi__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:540:1: ( rule__RestApi__Group__0__Impl rule__RestApi__Group__1 )
            // InternalRestDsl.g:541:2: rule__RestApi__Group__0__Impl rule__RestApi__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RestApi__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestApi__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__Group__0"


    // $ANTLR start "rule__RestApi__Group__0__Impl"
    // InternalRestDsl.g:548:1: rule__RestApi__Group__0__Impl : ( 'restApi' ) ;
    public final void rule__RestApi__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:552:1: ( ( 'restApi' ) )
            // InternalRestDsl.g:553:1: ( 'restApi' )
            {
            // InternalRestDsl.g:553:1: ( 'restApi' )
            // InternalRestDsl.g:554:2: 'restApi'
            {
             before(grammarAccess.getRestApiAccess().getRestApiKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRestApiAccess().getRestApiKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__Group__0__Impl"


    // $ANTLR start "rule__RestApi__Group__1"
    // InternalRestDsl.g:563:1: rule__RestApi__Group__1 : rule__RestApi__Group__1__Impl rule__RestApi__Group__2 ;
    public final void rule__RestApi__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:567:1: ( rule__RestApi__Group__1__Impl rule__RestApi__Group__2 )
            // InternalRestDsl.g:568:2: rule__RestApi__Group__1__Impl rule__RestApi__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RestApi__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestApi__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__Group__1"


    // $ANTLR start "rule__RestApi__Group__1__Impl"
    // InternalRestDsl.g:575:1: rule__RestApi__Group__1__Impl : ( ( rule__RestApi__NameAssignment_1 ) ) ;
    public final void rule__RestApi__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:579:1: ( ( ( rule__RestApi__NameAssignment_1 ) ) )
            // InternalRestDsl.g:580:1: ( ( rule__RestApi__NameAssignment_1 ) )
            {
            // InternalRestDsl.g:580:1: ( ( rule__RestApi__NameAssignment_1 ) )
            // InternalRestDsl.g:581:2: ( rule__RestApi__NameAssignment_1 )
            {
             before(grammarAccess.getRestApiAccess().getNameAssignment_1()); 
            // InternalRestDsl.g:582:2: ( rule__RestApi__NameAssignment_1 )
            // InternalRestDsl.g:582:3: rule__RestApi__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RestApi__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRestApiAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__Group__1__Impl"


    // $ANTLR start "rule__RestApi__Group__2"
    // InternalRestDsl.g:590:1: rule__RestApi__Group__2 : rule__RestApi__Group__2__Impl rule__RestApi__Group__3 ;
    public final void rule__RestApi__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:594:1: ( rule__RestApi__Group__2__Impl rule__RestApi__Group__3 )
            // InternalRestDsl.g:595:2: rule__RestApi__Group__2__Impl rule__RestApi__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__RestApi__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestApi__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__Group__2"


    // $ANTLR start "rule__RestApi__Group__2__Impl"
    // InternalRestDsl.g:602:1: rule__RestApi__Group__2__Impl : ( '{' ) ;
    public final void rule__RestApi__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:606:1: ( ( '{' ) )
            // InternalRestDsl.g:607:1: ( '{' )
            {
            // InternalRestDsl.g:607:1: ( '{' )
            // InternalRestDsl.g:608:2: '{'
            {
             before(grammarAccess.getRestApiAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRestApiAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__Group__2__Impl"


    // $ANTLR start "rule__RestApi__Group__3"
    // InternalRestDsl.g:617:1: rule__RestApi__Group__3 : rule__RestApi__Group__3__Impl rule__RestApi__Group__4 ;
    public final void rule__RestApi__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:621:1: ( rule__RestApi__Group__3__Impl rule__RestApi__Group__4 )
            // InternalRestDsl.g:622:2: rule__RestApi__Group__3__Impl rule__RestApi__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__RestApi__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestApi__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__Group__3"


    // $ANTLR start "rule__RestApi__Group__3__Impl"
    // InternalRestDsl.g:629:1: rule__RestApi__Group__3__Impl : ( 'path' ) ;
    public final void rule__RestApi__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:633:1: ( ( 'path' ) )
            // InternalRestDsl.g:634:1: ( 'path' )
            {
            // InternalRestDsl.g:634:1: ( 'path' )
            // InternalRestDsl.g:635:2: 'path'
            {
             before(grammarAccess.getRestApiAccess().getPathKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRestApiAccess().getPathKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__Group__3__Impl"


    // $ANTLR start "rule__RestApi__Group__4"
    // InternalRestDsl.g:644:1: rule__RestApi__Group__4 : rule__RestApi__Group__4__Impl rule__RestApi__Group__5 ;
    public final void rule__RestApi__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:648:1: ( rule__RestApi__Group__4__Impl rule__RestApi__Group__5 )
            // InternalRestDsl.g:649:2: rule__RestApi__Group__4__Impl rule__RestApi__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__RestApi__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestApi__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__Group__4"


    // $ANTLR start "rule__RestApi__Group__4__Impl"
    // InternalRestDsl.g:656:1: rule__RestApi__Group__4__Impl : ( ( rule__RestApi__PathAssignment_4 ) ) ;
    public final void rule__RestApi__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:660:1: ( ( ( rule__RestApi__PathAssignment_4 ) ) )
            // InternalRestDsl.g:661:1: ( ( rule__RestApi__PathAssignment_4 ) )
            {
            // InternalRestDsl.g:661:1: ( ( rule__RestApi__PathAssignment_4 ) )
            // InternalRestDsl.g:662:2: ( rule__RestApi__PathAssignment_4 )
            {
             before(grammarAccess.getRestApiAccess().getPathAssignment_4()); 
            // InternalRestDsl.g:663:2: ( rule__RestApi__PathAssignment_4 )
            // InternalRestDsl.g:663:3: rule__RestApi__PathAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RestApi__PathAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRestApiAccess().getPathAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__Group__4__Impl"


    // $ANTLR start "rule__RestApi__Group__5"
    // InternalRestDsl.g:671:1: rule__RestApi__Group__5 : rule__RestApi__Group__5__Impl rule__RestApi__Group__6 ;
    public final void rule__RestApi__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:675:1: ( rule__RestApi__Group__5__Impl rule__RestApi__Group__6 )
            // InternalRestDsl.g:676:2: rule__RestApi__Group__5__Impl rule__RestApi__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__RestApi__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestApi__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__Group__5"


    // $ANTLR start "rule__RestApi__Group__5__Impl"
    // InternalRestDsl.g:683:1: rule__RestApi__Group__5__Impl : ( ( rule__RestApi__OperationsAssignment_5 )* ) ;
    public final void rule__RestApi__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:687:1: ( ( ( rule__RestApi__OperationsAssignment_5 )* ) )
            // InternalRestDsl.g:688:1: ( ( rule__RestApi__OperationsAssignment_5 )* )
            {
            // InternalRestDsl.g:688:1: ( ( rule__RestApi__OperationsAssignment_5 )* )
            // InternalRestDsl.g:689:2: ( rule__RestApi__OperationsAssignment_5 )*
            {
             before(grammarAccess.getRestApiAccess().getOperationsAssignment_5()); 
            // InternalRestDsl.g:690:2: ( rule__RestApi__OperationsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=15)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRestDsl.g:690:3: rule__RestApi__OperationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__RestApi__OperationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRestApiAccess().getOperationsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__Group__5__Impl"


    // $ANTLR start "rule__RestApi__Group__6"
    // InternalRestDsl.g:698:1: rule__RestApi__Group__6 : rule__RestApi__Group__6__Impl ;
    public final void rule__RestApi__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:702:1: ( rule__RestApi__Group__6__Impl )
            // InternalRestDsl.g:703:2: rule__RestApi__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestApi__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__Group__6"


    // $ANTLR start "rule__RestApi__Group__6__Impl"
    // InternalRestDsl.g:709:1: rule__RestApi__Group__6__Impl : ( '}' ) ;
    public final void rule__RestApi__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:713:1: ( ( '}' ) )
            // InternalRestDsl.g:714:1: ( '}' )
            {
            // InternalRestDsl.g:714:1: ( '}' )
            // InternalRestDsl.g:715:2: '}'
            {
             before(grammarAccess.getRestApiAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRestApiAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalRestDsl.g:725:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:729:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalRestDsl.g:730:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalRestDsl.g:737:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__Alternatives_0 ) ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:741:1: ( ( ( rule__Operation__Alternatives_0 ) ) )
            // InternalRestDsl.g:742:1: ( ( rule__Operation__Alternatives_0 ) )
            {
            // InternalRestDsl.g:742:1: ( ( rule__Operation__Alternatives_0 ) )
            // InternalRestDsl.g:743:2: ( rule__Operation__Alternatives_0 )
            {
             before(grammarAccess.getOperationAccess().getAlternatives_0()); 
            // InternalRestDsl.g:744:2: ( rule__Operation__Alternatives_0 )
            // InternalRestDsl.g:744:3: rule__Operation__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalRestDsl.g:752:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:756:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalRestDsl.g:757:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalRestDsl.g:764:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:768:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // InternalRestDsl.g:769:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // InternalRestDsl.g:769:1: ( ( rule__Operation__NameAssignment_1 ) )
            // InternalRestDsl.g:770:2: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // InternalRestDsl.g:771:2: ( rule__Operation__NameAssignment_1 )
            // InternalRestDsl.g:771:3: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // InternalRestDsl.g:779:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:783:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalRestDsl.g:784:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // InternalRestDsl.g:791:1: rule__Operation__Group__2__Impl : ( ':' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:795:1: ( ( ':' ) )
            // InternalRestDsl.g:796:1: ( ':' )
            {
            // InternalRestDsl.g:796:1: ( ':' )
            // InternalRestDsl.g:797:2: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // InternalRestDsl.g:806:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:810:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalRestDsl.g:811:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // InternalRestDsl.g:818:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__MethodAssignment_3 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:822:1: ( ( ( rule__Operation__MethodAssignment_3 )? ) )
            // InternalRestDsl.g:823:1: ( ( rule__Operation__MethodAssignment_3 )? )
            {
            // InternalRestDsl.g:823:1: ( ( rule__Operation__MethodAssignment_3 )? )
            // InternalRestDsl.g:824:2: ( rule__Operation__MethodAssignment_3 )?
            {
             before(grammarAccess.getOperationAccess().getMethodAssignment_3()); 
            // InternalRestDsl.g:825:2: ( rule__Operation__MethodAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=16 && LA7_0<=19)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRestDsl.g:825:3: rule__Operation__MethodAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__MethodAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getMethodAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // InternalRestDsl.g:833:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:837:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalRestDsl.g:838:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // InternalRestDsl.g:845:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:849:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // InternalRestDsl.g:850:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // InternalRestDsl.g:850:1: ( ( rule__Operation__Group_4__0 )? )
            // InternalRestDsl.g:851:2: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // InternalRestDsl.g:852:2: ( rule__Operation__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRestDsl.g:852:3: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // InternalRestDsl.g:860:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:864:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalRestDsl.g:865:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // InternalRestDsl.g:872:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:876:1: ( ( ( rule__Operation__Group_5__0 )? ) )
            // InternalRestDsl.g:877:1: ( ( rule__Operation__Group_5__0 )? )
            {
            // InternalRestDsl.g:877:1: ( ( rule__Operation__Group_5__0 )? )
            // InternalRestDsl.g:878:2: ( rule__Operation__Group_5__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_5()); 
            // InternalRestDsl.g:879:2: ( rule__Operation__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRestDsl.g:879:3: rule__Operation__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // InternalRestDsl.g:887:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl rule__Operation__Group__7 ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:891:1: ( rule__Operation__Group__6__Impl rule__Operation__Group__7 )
            // InternalRestDsl.g:892:2: rule__Operation__Group__6__Impl rule__Operation__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Operation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // InternalRestDsl.g:899:1: rule__Operation__Group__6__Impl : ( ( rule__Operation__Group_6__0 )? ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:903:1: ( ( ( rule__Operation__Group_6__0 )? ) )
            // InternalRestDsl.g:904:1: ( ( rule__Operation__Group_6__0 )? )
            {
            // InternalRestDsl.g:904:1: ( ( rule__Operation__Group_6__0 )? )
            // InternalRestDsl.g:905:2: ( rule__Operation__Group_6__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_6()); 
            // InternalRestDsl.g:906:2: ( rule__Operation__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRestDsl.g:906:3: rule__Operation__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group__7"
    // InternalRestDsl.g:914:1: rule__Operation__Group__7 : rule__Operation__Group__7__Impl ;
    public final void rule__Operation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:918:1: ( rule__Operation__Group__7__Impl )
            // InternalRestDsl.g:919:2: rule__Operation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__7"


    // $ANTLR start "rule__Operation__Group__7__Impl"
    // InternalRestDsl.g:925:1: rule__Operation__Group__7__Impl : ( ( rule__Operation__Group_7__0 )? ) ;
    public final void rule__Operation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:929:1: ( ( ( rule__Operation__Group_7__0 )? ) )
            // InternalRestDsl.g:930:1: ( ( rule__Operation__Group_7__0 )? )
            {
            // InternalRestDsl.g:930:1: ( ( rule__Operation__Group_7__0 )? )
            // InternalRestDsl.g:931:2: ( rule__Operation__Group_7__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_7()); 
            // InternalRestDsl.g:932:2: ( rule__Operation__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRestDsl.g:932:3: rule__Operation__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__7__Impl"


    // $ANTLR start "rule__Operation__Group_4__0"
    // InternalRestDsl.g:941:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:945:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // InternalRestDsl.g:946:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0"


    // $ANTLR start "rule__Operation__Group_4__0__Impl"
    // InternalRestDsl.g:953:1: rule__Operation__Group_4__0__Impl : ( 'path' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:957:1: ( ( 'path' ) )
            // InternalRestDsl.g:958:1: ( 'path' )
            {
            // InternalRestDsl.g:958:1: ( 'path' )
            // InternalRestDsl.g:959:2: 'path'
            {
             before(grammarAccess.getOperationAccess().getPathKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getPathKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0__Impl"


    // $ANTLR start "rule__Operation__Group_4__1"
    // InternalRestDsl.g:968:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:972:1: ( rule__Operation__Group_4__1__Impl )
            // InternalRestDsl.g:973:2: rule__Operation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1"


    // $ANTLR start "rule__Operation__Group_4__1__Impl"
    // InternalRestDsl.g:979:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__PathAssignment_4_1 ) ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:983:1: ( ( ( rule__Operation__PathAssignment_4_1 ) ) )
            // InternalRestDsl.g:984:1: ( ( rule__Operation__PathAssignment_4_1 ) )
            {
            // InternalRestDsl.g:984:1: ( ( rule__Operation__PathAssignment_4_1 ) )
            // InternalRestDsl.g:985:2: ( rule__Operation__PathAssignment_4_1 )
            {
             before(grammarAccess.getOperationAccess().getPathAssignment_4_1()); 
            // InternalRestDsl.g:986:2: ( rule__Operation__PathAssignment_4_1 )
            // InternalRestDsl.g:986:3: rule__Operation__PathAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__PathAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getPathAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group_5__0"
    // InternalRestDsl.g:995:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:999:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // InternalRestDsl.g:1000:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__0"


    // $ANTLR start "rule__Operation__Group_5__0__Impl"
    // InternalRestDsl.g:1007:1: rule__Operation__Group_5__0__Impl : ( 'request' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1011:1: ( ( 'request' ) )
            // InternalRestDsl.g:1012:1: ( 'request' )
            {
            // InternalRestDsl.g:1012:1: ( 'request' )
            // InternalRestDsl.g:1013:2: 'request'
            {
             before(grammarAccess.getOperationAccess().getRequestKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRequestKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__0__Impl"


    // $ANTLR start "rule__Operation__Group_5__1"
    // InternalRestDsl.g:1022:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1026:1: ( rule__Operation__Group_5__1__Impl )
            // InternalRestDsl.g:1027:2: rule__Operation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__1"


    // $ANTLR start "rule__Operation__Group_5__1__Impl"
    // InternalRestDsl.g:1033:1: rule__Operation__Group_5__1__Impl : ( ( rule__Operation__RequestAssignment_5_1 ) ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1037:1: ( ( ( rule__Operation__RequestAssignment_5_1 ) ) )
            // InternalRestDsl.g:1038:1: ( ( rule__Operation__RequestAssignment_5_1 ) )
            {
            // InternalRestDsl.g:1038:1: ( ( rule__Operation__RequestAssignment_5_1 ) )
            // InternalRestDsl.g:1039:2: ( rule__Operation__RequestAssignment_5_1 )
            {
             before(grammarAccess.getOperationAccess().getRequestAssignment_5_1()); 
            // InternalRestDsl.g:1040:2: ( rule__Operation__RequestAssignment_5_1 )
            // InternalRestDsl.g:1040:3: rule__Operation__RequestAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__RequestAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getRequestAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__1__Impl"


    // $ANTLR start "rule__Operation__Group_6__0"
    // InternalRestDsl.g:1049:1: rule__Operation__Group_6__0 : rule__Operation__Group_6__0__Impl rule__Operation__Group_6__1 ;
    public final void rule__Operation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1053:1: ( rule__Operation__Group_6__0__Impl rule__Operation__Group_6__1 )
            // InternalRestDsl.g:1054:2: rule__Operation__Group_6__0__Impl rule__Operation__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_6__0"


    // $ANTLR start "rule__Operation__Group_6__0__Impl"
    // InternalRestDsl.g:1061:1: rule__Operation__Group_6__0__Impl : ( 'response' ) ;
    public final void rule__Operation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1065:1: ( ( 'response' ) )
            // InternalRestDsl.g:1066:1: ( 'response' )
            {
            // InternalRestDsl.g:1066:1: ( 'response' )
            // InternalRestDsl.g:1067:2: 'response'
            {
             before(grammarAccess.getOperationAccess().getResponseKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getResponseKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_6__0__Impl"


    // $ANTLR start "rule__Operation__Group_6__1"
    // InternalRestDsl.g:1076:1: rule__Operation__Group_6__1 : rule__Operation__Group_6__1__Impl ;
    public final void rule__Operation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1080:1: ( rule__Operation__Group_6__1__Impl )
            // InternalRestDsl.g:1081:2: rule__Operation__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_6__1"


    // $ANTLR start "rule__Operation__Group_6__1__Impl"
    // InternalRestDsl.g:1087:1: rule__Operation__Group_6__1__Impl : ( ( rule__Operation__ResponseAssignment_6_1 ) ) ;
    public final void rule__Operation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1091:1: ( ( ( rule__Operation__ResponseAssignment_6_1 ) ) )
            // InternalRestDsl.g:1092:1: ( ( rule__Operation__ResponseAssignment_6_1 ) )
            {
            // InternalRestDsl.g:1092:1: ( ( rule__Operation__ResponseAssignment_6_1 ) )
            // InternalRestDsl.g:1093:2: ( rule__Operation__ResponseAssignment_6_1 )
            {
             before(grammarAccess.getOperationAccess().getResponseAssignment_6_1()); 
            // InternalRestDsl.g:1094:2: ( rule__Operation__ResponseAssignment_6_1 )
            // InternalRestDsl.g:1094:3: rule__Operation__ResponseAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ResponseAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getResponseAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_6__1__Impl"


    // $ANTLR start "rule__Operation__Group_7__0"
    // InternalRestDsl.g:1103:1: rule__Operation__Group_7__0 : rule__Operation__Group_7__0__Impl rule__Operation__Group_7__1 ;
    public final void rule__Operation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1107:1: ( rule__Operation__Group_7__0__Impl rule__Operation__Group_7__1 )
            // InternalRestDsl.g:1108:2: rule__Operation__Group_7__0__Impl rule__Operation__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Operation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__0"


    // $ANTLR start "rule__Operation__Group_7__0__Impl"
    // InternalRestDsl.g:1115:1: rule__Operation__Group_7__0__Impl : ( 'logic' ) ;
    public final void rule__Operation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1119:1: ( ( 'logic' ) )
            // InternalRestDsl.g:1120:1: ( 'logic' )
            {
            // InternalRestDsl.g:1120:1: ( 'logic' )
            // InternalRestDsl.g:1121:2: 'logic'
            {
             before(grammarAccess.getOperationAccess().getLogicKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLogicKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__0__Impl"


    // $ANTLR start "rule__Operation__Group_7__1"
    // InternalRestDsl.g:1130:1: rule__Operation__Group_7__1 : rule__Operation__Group_7__1__Impl ;
    public final void rule__Operation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1134:1: ( rule__Operation__Group_7__1__Impl )
            // InternalRestDsl.g:1135:2: rule__Operation__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__1"


    // $ANTLR start "rule__Operation__Group_7__1__Impl"
    // InternalRestDsl.g:1141:1: rule__Operation__Group_7__1__Impl : ( ( rule__Operation__LogicAssignment_7_1 ) ) ;
    public final void rule__Operation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1145:1: ( ( ( rule__Operation__LogicAssignment_7_1 ) ) )
            // InternalRestDsl.g:1146:1: ( ( rule__Operation__LogicAssignment_7_1 ) )
            {
            // InternalRestDsl.g:1146:1: ( ( rule__Operation__LogicAssignment_7_1 ) )
            // InternalRestDsl.g:1147:2: ( rule__Operation__LogicAssignment_7_1 )
            {
             before(grammarAccess.getOperationAccess().getLogicAssignment_7_1()); 
            // InternalRestDsl.g:1148:2: ( rule__Operation__LogicAssignment_7_1 )
            // InternalRestDsl.g:1148:3: rule__Operation__LogicAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__LogicAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getLogicAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__1__Impl"


    // $ANTLR start "rule__Logic__Group__0"
    // InternalRestDsl.g:1157:1: rule__Logic__Group__0 : rule__Logic__Group__0__Impl rule__Logic__Group__1 ;
    public final void rule__Logic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1161:1: ( rule__Logic__Group__0__Impl rule__Logic__Group__1 )
            // InternalRestDsl.g:1162:2: rule__Logic__Group__0__Impl rule__Logic__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Logic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Logic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logic__Group__0"


    // $ANTLR start "rule__Logic__Group__0__Impl"
    // InternalRestDsl.g:1169:1: rule__Logic__Group__0__Impl : ( '{' ) ;
    public final void rule__Logic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1173:1: ( ( '{' ) )
            // InternalRestDsl.g:1174:1: ( '{' )
            {
            // InternalRestDsl.g:1174:1: ( '{' )
            // InternalRestDsl.g:1175:2: '{'
            {
             before(grammarAccess.getLogicAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLogicAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logic__Group__0__Impl"


    // $ANTLR start "rule__Logic__Group__1"
    // InternalRestDsl.g:1184:1: rule__Logic__Group__1 : rule__Logic__Group__1__Impl rule__Logic__Group__2 ;
    public final void rule__Logic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1188:1: ( rule__Logic__Group__1__Impl rule__Logic__Group__2 )
            // InternalRestDsl.g:1189:2: rule__Logic__Group__1__Impl rule__Logic__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Logic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Logic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logic__Group__1"


    // $ANTLR start "rule__Logic__Group__1__Impl"
    // InternalRestDsl.g:1196:1: rule__Logic__Group__1__Impl : ( ( rule__Logic__ImplementationAssignment_1 ) ) ;
    public final void rule__Logic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1200:1: ( ( ( rule__Logic__ImplementationAssignment_1 ) ) )
            // InternalRestDsl.g:1201:1: ( ( rule__Logic__ImplementationAssignment_1 ) )
            {
            // InternalRestDsl.g:1201:1: ( ( rule__Logic__ImplementationAssignment_1 ) )
            // InternalRestDsl.g:1202:2: ( rule__Logic__ImplementationAssignment_1 )
            {
             before(grammarAccess.getLogicAccess().getImplementationAssignment_1()); 
            // InternalRestDsl.g:1203:2: ( rule__Logic__ImplementationAssignment_1 )
            // InternalRestDsl.g:1203:3: rule__Logic__ImplementationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Logic__ImplementationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicAccess().getImplementationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logic__Group__1__Impl"


    // $ANTLR start "rule__Logic__Group__2"
    // InternalRestDsl.g:1211:1: rule__Logic__Group__2 : rule__Logic__Group__2__Impl ;
    public final void rule__Logic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1215:1: ( rule__Logic__Group__2__Impl )
            // InternalRestDsl.g:1216:2: rule__Logic__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Logic__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logic__Group__2"


    // $ANTLR start "rule__Logic__Group__2__Impl"
    // InternalRestDsl.g:1222:1: rule__Logic__Group__2__Impl : ( '}' ) ;
    public final void rule__Logic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1226:1: ( ( '}' ) )
            // InternalRestDsl.g:1227:1: ( '}' )
            {
            // InternalRestDsl.g:1227:1: ( '}' )
            // InternalRestDsl.g:1228:2: '}'
            {
             before(grammarAccess.getLogicAccess().getRightCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLogicAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logic__Group__2__Impl"


    // $ANTLR start "rule__RestDsl__EntitiesAssignment_0"
    // InternalRestDsl.g:1238:1: rule__RestDsl__EntitiesAssignment_0 : ( ruleEntity ) ;
    public final void rule__RestDsl__EntitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1242:1: ( ( ruleEntity ) )
            // InternalRestDsl.g:1243:2: ( ruleEntity )
            {
            // InternalRestDsl.g:1243:2: ( ruleEntity )
            // InternalRestDsl.g:1244:3: ruleEntity
            {
             before(grammarAccess.getRestDslAccess().getEntitiesEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getRestDslAccess().getEntitiesEntityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestDsl__EntitiesAssignment_0"


    // $ANTLR start "rule__RestDsl__RestApisAssignment_1"
    // InternalRestDsl.g:1253:1: rule__RestDsl__RestApisAssignment_1 : ( ruleRestApi ) ;
    public final void rule__RestDsl__RestApisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1257:1: ( ( ruleRestApi ) )
            // InternalRestDsl.g:1258:2: ( ruleRestApi )
            {
            // InternalRestDsl.g:1258:2: ( ruleRestApi )
            // InternalRestDsl.g:1259:3: ruleRestApi
            {
             before(grammarAccess.getRestDslAccess().getRestApisRestApiParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRestApi();

            state._fsp--;

             after(grammarAccess.getRestDslAccess().getRestApisRestApiParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestDsl__RestApisAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalRestDsl.g:1268:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1272:1: ( ( RULE_ID ) )
            // InternalRestDsl.g:1273:2: ( RULE_ID )
            {
            // InternalRestDsl.g:1273:2: ( RULE_ID )
            // InternalRestDsl.g:1274:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__FieldsAssignment_3"
    // InternalRestDsl.g:1283:1: rule__Entity__FieldsAssignment_3 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1287:1: ( ( ruleField ) )
            // InternalRestDsl.g:1288:2: ( ruleField )
            {
            // InternalRestDsl.g:1288:2: ( ruleField )
            // InternalRestDsl.g:1289:3: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FieldsAssignment_3"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // InternalRestDsl.g:1298:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1302:1: ( ( RULE_ID ) )
            // InternalRestDsl.g:1303:2: ( RULE_ID )
            {
            // InternalRestDsl.g:1303:2: ( RULE_ID )
            // InternalRestDsl.g:1304:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_0"


    // $ANTLR start "rule__Field__TypeAssignment_2"
    // InternalRestDsl.g:1313:1: rule__Field__TypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__Field__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1317:1: ( ( RULE_ID ) )
            // InternalRestDsl.g:1318:2: ( RULE_ID )
            {
            // InternalRestDsl.g:1318:2: ( RULE_ID )
            // InternalRestDsl.g:1319:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getTypeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getTypeIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_2"


    // $ANTLR start "rule__RestApi__NameAssignment_1"
    // InternalRestDsl.g:1328:1: rule__RestApi__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RestApi__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1332:1: ( ( RULE_ID ) )
            // InternalRestDsl.g:1333:2: ( RULE_ID )
            {
            // InternalRestDsl.g:1333:2: ( RULE_ID )
            // InternalRestDsl.g:1334:3: RULE_ID
            {
             before(grammarAccess.getRestApiAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRestApiAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__NameAssignment_1"


    // $ANTLR start "rule__RestApi__PathAssignment_4"
    // InternalRestDsl.g:1343:1: rule__RestApi__PathAssignment_4 : ( RULE_STRING ) ;
    public final void rule__RestApi__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1347:1: ( ( RULE_STRING ) )
            // InternalRestDsl.g:1348:2: ( RULE_STRING )
            {
            // InternalRestDsl.g:1348:2: ( RULE_STRING )
            // InternalRestDsl.g:1349:3: RULE_STRING
            {
             before(grammarAccess.getRestApiAccess().getPathSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRestApiAccess().getPathSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__PathAssignment_4"


    // $ANTLR start "rule__RestApi__OperationsAssignment_5"
    // InternalRestDsl.g:1358:1: rule__RestApi__OperationsAssignment_5 : ( ruleOperation ) ;
    public final void rule__RestApi__OperationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1362:1: ( ( ruleOperation ) )
            // InternalRestDsl.g:1363:2: ( ruleOperation )
            {
            // InternalRestDsl.g:1363:2: ( ruleOperation )
            // InternalRestDsl.g:1364:3: ruleOperation
            {
             before(grammarAccess.getRestApiAccess().getOperationsOperationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getRestApiAccess().getOperationsOperationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestApi__OperationsAssignment_5"


    // $ANTLR start "rule__Operation__NameAssignment_1"
    // InternalRestDsl.g:1373:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1377:1: ( ( RULE_ID ) )
            // InternalRestDsl.g:1378:2: ( RULE_ID )
            {
            // InternalRestDsl.g:1378:2: ( RULE_ID )
            // InternalRestDsl.g:1379:3: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_1"


    // $ANTLR start "rule__Operation__MethodAssignment_3"
    // InternalRestDsl.g:1388:1: rule__Operation__MethodAssignment_3 : ( ( rule__Operation__MethodAlternatives_3_0 ) ) ;
    public final void rule__Operation__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1392:1: ( ( ( rule__Operation__MethodAlternatives_3_0 ) ) )
            // InternalRestDsl.g:1393:2: ( ( rule__Operation__MethodAlternatives_3_0 ) )
            {
            // InternalRestDsl.g:1393:2: ( ( rule__Operation__MethodAlternatives_3_0 ) )
            // InternalRestDsl.g:1394:3: ( rule__Operation__MethodAlternatives_3_0 )
            {
             before(grammarAccess.getOperationAccess().getMethodAlternatives_3_0()); 
            // InternalRestDsl.g:1395:3: ( rule__Operation__MethodAlternatives_3_0 )
            // InternalRestDsl.g:1395:4: rule__Operation__MethodAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__MethodAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getMethodAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__MethodAssignment_3"


    // $ANTLR start "rule__Operation__PathAssignment_4_1"
    // InternalRestDsl.g:1403:1: rule__Operation__PathAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Operation__PathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1407:1: ( ( RULE_STRING ) )
            // InternalRestDsl.g:1408:2: ( RULE_STRING )
            {
            // InternalRestDsl.g:1408:2: ( RULE_STRING )
            // InternalRestDsl.g:1409:3: RULE_STRING
            {
             before(grammarAccess.getOperationAccess().getPathSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getPathSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__PathAssignment_4_1"


    // $ANTLR start "rule__Operation__RequestAssignment_5_1"
    // InternalRestDsl.g:1418:1: rule__Operation__RequestAssignment_5_1 : ( ruleType ) ;
    public final void rule__Operation__RequestAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1422:1: ( ( ruleType ) )
            // InternalRestDsl.g:1423:2: ( ruleType )
            {
            // InternalRestDsl.g:1423:2: ( ruleType )
            // InternalRestDsl.g:1424:3: ruleType
            {
             before(grammarAccess.getOperationAccess().getRequestTypeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getRequestTypeParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__RequestAssignment_5_1"


    // $ANTLR start "rule__Operation__ResponseAssignment_6_1"
    // InternalRestDsl.g:1433:1: rule__Operation__ResponseAssignment_6_1 : ( ruleType ) ;
    public final void rule__Operation__ResponseAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1437:1: ( ( ruleType ) )
            // InternalRestDsl.g:1438:2: ( ruleType )
            {
            // InternalRestDsl.g:1438:2: ( ruleType )
            // InternalRestDsl.g:1439:3: ruleType
            {
             before(grammarAccess.getOperationAccess().getResponseTypeParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getResponseTypeParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ResponseAssignment_6_1"


    // $ANTLR start "rule__Operation__LogicAssignment_7_1"
    // InternalRestDsl.g:1448:1: rule__Operation__LogicAssignment_7_1 : ( ruleLogic ) ;
    public final void rule__Operation__LogicAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1452:1: ( ( ruleLogic ) )
            // InternalRestDsl.g:1453:2: ( ruleLogic )
            {
            // InternalRestDsl.g:1453:2: ( ruleLogic )
            // InternalRestDsl.g:1454:3: ruleLogic
            {
             before(grammarAccess.getOperationAccess().getLogicLogicParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLogic();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getLogicLogicParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__LogicAssignment_7_1"


    // $ANTLR start "rule__Type__TypeAssignment"
    // InternalRestDsl.g:1463:1: rule__Type__TypeAssignment : ( RULE_ID ) ;
    public final void rule__Type__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1467:1: ( ( RULE_ID ) )
            // InternalRestDsl.g:1468:2: ( RULE_ID )
            {
            // InternalRestDsl.g:1468:2: ( RULE_ID )
            // InternalRestDsl.g:1469:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getTypeIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment"


    // $ANTLR start "rule__Logic__ImplementationAssignment_1"
    // InternalRestDsl.g:1478:1: rule__Logic__ImplementationAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Logic__ImplementationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestDsl.g:1482:1: ( ( RULE_STRING ) )
            // InternalRestDsl.g:1483:2: ( RULE_STRING )
            {
            // InternalRestDsl.g:1483:2: ( RULE_STRING )
            // InternalRestDsl.g:1484:3: RULE_STRING
            {
             before(grammarAccess.getLogicAccess().getImplementationSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLogicAccess().getImplementationSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logic__ImplementationAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000040F800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001E0F0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});

}