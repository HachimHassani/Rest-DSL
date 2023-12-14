package org.example.restdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.restdsl.services.RestDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'{'", "'}'", "':'", "'restApi'", "'path'", "'create'", "'read'", "'update'", "'delete'", "'customEndpoint'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'request'", "'response'", "'logic'"
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

        public InternalRestDslParser(TokenStream input, RestDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RestDsl";
       	}

       	@Override
       	protected RestDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRestDsl"
    // InternalRestDsl.g:64:1: entryRuleRestDsl returns [EObject current=null] : iv_ruleRestDsl= ruleRestDsl EOF ;
    public final EObject entryRuleRestDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestDsl = null;


        try {
            // InternalRestDsl.g:64:48: (iv_ruleRestDsl= ruleRestDsl EOF )
            // InternalRestDsl.g:65:2: iv_ruleRestDsl= ruleRestDsl EOF
            {
             newCompositeNode(grammarAccess.getRestDslRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestDsl=ruleRestDsl();

            state._fsp--;

             current =iv_ruleRestDsl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestDsl"


    // $ANTLR start "ruleRestDsl"
    // InternalRestDsl.g:71:1: ruleRestDsl returns [EObject current=null] : ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_restApis_1_0= ruleRestApi ) ) )* ;
    public final EObject ruleRestDsl() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;

        EObject lv_restApis_1_0 = null;



        	enterRule();

        try {
            // InternalRestDsl.g:77:2: ( ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_restApis_1_0= ruleRestApi ) ) )* )
            // InternalRestDsl.g:78:2: ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_restApis_1_0= ruleRestApi ) ) )*
            {
            // InternalRestDsl.g:78:2: ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_restApis_1_0= ruleRestApi ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }
                else if ( (LA1_0==15) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRestDsl.g:79:3: ( (lv_entities_0_0= ruleEntity ) )
            	    {
            	    // InternalRestDsl.g:79:3: ( (lv_entities_0_0= ruleEntity ) )
            	    // InternalRestDsl.g:80:4: (lv_entities_0_0= ruleEntity )
            	    {
            	    // InternalRestDsl.g:80:4: (lv_entities_0_0= ruleEntity )
            	    // InternalRestDsl.g:81:5: lv_entities_0_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getRestDslAccess().getEntitiesEntityParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRestDslRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_0_0,
            	    						"org.example.restdsl.RestDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRestDsl.g:99:3: ( (lv_restApis_1_0= ruleRestApi ) )
            	    {
            	    // InternalRestDsl.g:99:3: ( (lv_restApis_1_0= ruleRestApi ) )
            	    // InternalRestDsl.g:100:4: (lv_restApis_1_0= ruleRestApi )
            	    {
            	    // InternalRestDsl.g:100:4: (lv_restApis_1_0= ruleRestApi )
            	    // InternalRestDsl.g:101:5: lv_restApis_1_0= ruleRestApi
            	    {

            	    					newCompositeNode(grammarAccess.getRestDslAccess().getRestApisRestApiParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_restApis_1_0=ruleRestApi();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRestDslRule());
            	    					}
            	    					add(
            	    						current,
            	    						"restApis",
            	    						lv_restApis_1_0,
            	    						"org.example.restdsl.RestDsl.RestApi");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestDsl"


    // $ANTLR start "entryRuleEntity"
    // InternalRestDsl.g:122:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalRestDsl.g:122:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalRestDsl.g:123:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalRestDsl.g:129:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalRestDsl.g:135:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) )
            // InternalRestDsl.g:136:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            {
            // InternalRestDsl.g:136:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            // InternalRestDsl.g:137:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalRestDsl.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestDsl.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestDsl.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalRestDsl.g:143:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRestDsl.g:163:3: ( (lv_fields_3_0= ruleField ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRestDsl.g:164:4: (lv_fields_3_0= ruleField )
            	    {
            	    // InternalRestDsl.g:164:4: (lv_fields_3_0= ruleField )
            	    // InternalRestDsl.g:165:5: lv_fields_3_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_fields_3_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_3_0,
            	    						"org.example.restdsl.RestDsl.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleField"
    // InternalRestDsl.g:190:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalRestDsl.g:190:46: (iv_ruleField= ruleField EOF )
            // InternalRestDsl.g:191:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalRestDsl.g:197:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalRestDsl.g:203:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) )
            // InternalRestDsl.g:204:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            {
            // InternalRestDsl.g:204:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            // InternalRestDsl.g:205:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) )
            {
            // InternalRestDsl.g:205:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRestDsl.g:206:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRestDsl.g:206:4: (lv_name_0_0= RULE_ID )
            // InternalRestDsl.g:207:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
            		
            // InternalRestDsl.g:227:3: ( (lv_type_2_0= RULE_ID ) )
            // InternalRestDsl.g:228:4: (lv_type_2_0= RULE_ID )
            {
            // InternalRestDsl.g:228:4: (lv_type_2_0= RULE_ID )
            // InternalRestDsl.g:229:5: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getFieldAccess().getTypeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleRestApi"
    // InternalRestDsl.g:249:1: entryRuleRestApi returns [EObject current=null] : iv_ruleRestApi= ruleRestApi EOF ;
    public final EObject entryRuleRestApi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestApi = null;


        try {
            // InternalRestDsl.g:249:48: (iv_ruleRestApi= ruleRestApi EOF )
            // InternalRestDsl.g:250:2: iv_ruleRestApi= ruleRestApi EOF
            {
             newCompositeNode(grammarAccess.getRestApiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestApi=ruleRestApi();

            state._fsp--;

             current =iv_ruleRestApi; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestApi"


    // $ANTLR start "ruleRestApi"
    // InternalRestDsl.g:256:1: ruleRestApi returns [EObject current=null] : (otherlv_0= 'restApi' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= RULE_STRING ) ) ( (lv_operations_5_0= ruleOperation ) )* otherlv_6= '}' ) ;
    public final EObject ruleRestApi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_path_4_0=null;
        Token otherlv_6=null;
        EObject lv_operations_5_0 = null;



        	enterRule();

        try {
            // InternalRestDsl.g:262:2: ( (otherlv_0= 'restApi' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= RULE_STRING ) ) ( (lv_operations_5_0= ruleOperation ) )* otherlv_6= '}' ) )
            // InternalRestDsl.g:263:2: (otherlv_0= 'restApi' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= RULE_STRING ) ) ( (lv_operations_5_0= ruleOperation ) )* otherlv_6= '}' )
            {
            // InternalRestDsl.g:263:2: (otherlv_0= 'restApi' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= RULE_STRING ) ) ( (lv_operations_5_0= ruleOperation ) )* otherlv_6= '}' )
            // InternalRestDsl.g:264:3: otherlv_0= 'restApi' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= RULE_STRING ) ) ( (lv_operations_5_0= ruleOperation ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRestApiAccess().getRestApiKeyword_0());
            		
            // InternalRestDsl.g:268:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestDsl.g:269:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestDsl.g:269:4: (lv_name_1_0= RULE_ID )
            // InternalRestDsl.g:270:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRestApiAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestApiRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRestApiAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRestApiAccess().getPathKeyword_3());
            		
            // InternalRestDsl.g:294:3: ( (lv_path_4_0= RULE_STRING ) )
            // InternalRestDsl.g:295:4: (lv_path_4_0= RULE_STRING )
            {
            // InternalRestDsl.g:295:4: (lv_path_4_0= RULE_STRING )
            // InternalRestDsl.g:296:5: lv_path_4_0= RULE_STRING
            {
            lv_path_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_path_4_0, grammarAccess.getRestApiAccess().getPathSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestApiRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRestDsl.g:312:3: ( (lv_operations_5_0= ruleOperation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRestDsl.g:313:4: (lv_operations_5_0= ruleOperation )
            	    {
            	    // InternalRestDsl.g:313:4: (lv_operations_5_0= ruleOperation )
            	    // InternalRestDsl.g:314:5: lv_operations_5_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getRestApiAccess().getOperationsOperationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_operations_5_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRestApiRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_5_0,
            	    						"org.example.restdsl.RestDsl.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRestApiAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestApi"


    // $ANTLR start "entryRuleOperation"
    // InternalRestDsl.g:339:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalRestDsl.g:339:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalRestDsl.g:340:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalRestDsl.g:346:1: ruleOperation returns [EObject current=null] : ( (otherlv_0= 'create' | otherlv_1= 'read' | otherlv_2= 'update' | otherlv_3= 'delete' | otherlv_4= 'customEndpoint' ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( (lv_method_7_1= 'GET' | lv_method_7_2= 'POST' | lv_method_7_3= 'PUT' | lv_method_7_4= 'DELETE' ) ) )? (otherlv_8= 'path' ( (lv_path_9_0= RULE_STRING ) ) )? (otherlv_10= 'request' ( (lv_request_11_0= ruleType ) ) )? (otherlv_12= 'response' ( (lv_response_13_0= ruleType ) ) )? (otherlv_14= 'logic' ( (lv_logic_15_0= ruleLogic ) ) )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_method_7_1=null;
        Token lv_method_7_2=null;
        Token lv_method_7_3=null;
        Token lv_method_7_4=null;
        Token otherlv_8=null;
        Token lv_path_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_request_11_0 = null;

        EObject lv_response_13_0 = null;

        EObject lv_logic_15_0 = null;



        	enterRule();

        try {
            // InternalRestDsl.g:352:2: ( ( (otherlv_0= 'create' | otherlv_1= 'read' | otherlv_2= 'update' | otherlv_3= 'delete' | otherlv_4= 'customEndpoint' ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( (lv_method_7_1= 'GET' | lv_method_7_2= 'POST' | lv_method_7_3= 'PUT' | lv_method_7_4= 'DELETE' ) ) )? (otherlv_8= 'path' ( (lv_path_9_0= RULE_STRING ) ) )? (otherlv_10= 'request' ( (lv_request_11_0= ruleType ) ) )? (otherlv_12= 'response' ( (lv_response_13_0= ruleType ) ) )? (otherlv_14= 'logic' ( (lv_logic_15_0= ruleLogic ) ) )? ) )
            // InternalRestDsl.g:353:2: ( (otherlv_0= 'create' | otherlv_1= 'read' | otherlv_2= 'update' | otherlv_3= 'delete' | otherlv_4= 'customEndpoint' ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( (lv_method_7_1= 'GET' | lv_method_7_2= 'POST' | lv_method_7_3= 'PUT' | lv_method_7_4= 'DELETE' ) ) )? (otherlv_8= 'path' ( (lv_path_9_0= RULE_STRING ) ) )? (otherlv_10= 'request' ( (lv_request_11_0= ruleType ) ) )? (otherlv_12= 'response' ( (lv_response_13_0= ruleType ) ) )? (otherlv_14= 'logic' ( (lv_logic_15_0= ruleLogic ) ) )? )
            {
            // InternalRestDsl.g:353:2: ( (otherlv_0= 'create' | otherlv_1= 'read' | otherlv_2= 'update' | otherlv_3= 'delete' | otherlv_4= 'customEndpoint' ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( (lv_method_7_1= 'GET' | lv_method_7_2= 'POST' | lv_method_7_3= 'PUT' | lv_method_7_4= 'DELETE' ) ) )? (otherlv_8= 'path' ( (lv_path_9_0= RULE_STRING ) ) )? (otherlv_10= 'request' ( (lv_request_11_0= ruleType ) ) )? (otherlv_12= 'response' ( (lv_response_13_0= ruleType ) ) )? (otherlv_14= 'logic' ( (lv_logic_15_0= ruleLogic ) ) )? )
            // InternalRestDsl.g:354:3: (otherlv_0= 'create' | otherlv_1= 'read' | otherlv_2= 'update' | otherlv_3= 'delete' | otherlv_4= 'customEndpoint' ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( (lv_method_7_1= 'GET' | lv_method_7_2= 'POST' | lv_method_7_3= 'PUT' | lv_method_7_4= 'DELETE' ) ) )? (otherlv_8= 'path' ( (lv_path_9_0= RULE_STRING ) ) )? (otherlv_10= 'request' ( (lv_request_11_0= ruleType ) ) )? (otherlv_12= 'response' ( (lv_response_13_0= ruleType ) ) )? (otherlv_14= 'logic' ( (lv_logic_15_0= ruleLogic ) ) )?
            {
            // InternalRestDsl.g:354:3: (otherlv_0= 'create' | otherlv_1= 'read' | otherlv_2= 'update' | otherlv_3= 'delete' | otherlv_4= 'customEndpoint' )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            case 21:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRestDsl.g:355:4: otherlv_0= 'create'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getCreateKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRestDsl.g:360:4: otherlv_1= 'read'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getReadKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalRestDsl.g:365:4: otherlv_2= 'update'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getUpdateKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalRestDsl.g:370:4: otherlv_3= 'delete'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getDeleteKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalRestDsl.g:375:4: otherlv_4= 'customEndpoint'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCustomEndpointKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalRestDsl.g:380:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalRestDsl.g:381:4: (lv_name_5_0= RULE_ID )
            {
            // InternalRestDsl.g:381:4: (lv_name_5_0= RULE_ID )
            // InternalRestDsl.g:382:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_5_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getColonKeyword_2());
            		
            // InternalRestDsl.g:402:3: ( ( (lv_method_7_1= 'GET' | lv_method_7_2= 'POST' | lv_method_7_3= 'PUT' | lv_method_7_4= 'DELETE' ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=22 && LA6_0<=25)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRestDsl.g:403:4: ( (lv_method_7_1= 'GET' | lv_method_7_2= 'POST' | lv_method_7_3= 'PUT' | lv_method_7_4= 'DELETE' ) )
                    {
                    // InternalRestDsl.g:403:4: ( (lv_method_7_1= 'GET' | lv_method_7_2= 'POST' | lv_method_7_3= 'PUT' | lv_method_7_4= 'DELETE' ) )
                    // InternalRestDsl.g:404:5: (lv_method_7_1= 'GET' | lv_method_7_2= 'POST' | lv_method_7_3= 'PUT' | lv_method_7_4= 'DELETE' )
                    {
                    // InternalRestDsl.g:404:5: (lv_method_7_1= 'GET' | lv_method_7_2= 'POST' | lv_method_7_3= 'PUT' | lv_method_7_4= 'DELETE' )
                    int alt5=4;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt5=1;
                        }
                        break;
                    case 23:
                        {
                        alt5=2;
                        }
                        break;
                    case 24:
                        {
                        alt5=3;
                        }
                        break;
                    case 25:
                        {
                        alt5=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }

                    switch (alt5) {
                        case 1 :
                            // InternalRestDsl.g:405:6: lv_method_7_1= 'GET'
                            {
                            lv_method_7_1=(Token)match(input,22,FOLLOW_12); 

                            						newLeafNode(lv_method_7_1, grammarAccess.getOperationAccess().getMethodGETKeyword_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "method", lv_method_7_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalRestDsl.g:416:6: lv_method_7_2= 'POST'
                            {
                            lv_method_7_2=(Token)match(input,23,FOLLOW_12); 

                            						newLeafNode(lv_method_7_2, grammarAccess.getOperationAccess().getMethodPOSTKeyword_3_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "method", lv_method_7_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalRestDsl.g:427:6: lv_method_7_3= 'PUT'
                            {
                            lv_method_7_3=(Token)match(input,24,FOLLOW_12); 

                            						newLeafNode(lv_method_7_3, grammarAccess.getOperationAccess().getMethodPUTKeyword_3_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "method", lv_method_7_3, null);
                            					

                            }
                            break;
                        case 4 :
                            // InternalRestDsl.g:438:6: lv_method_7_4= 'DELETE'
                            {
                            lv_method_7_4=(Token)match(input,25,FOLLOW_12); 

                            						newLeafNode(lv_method_7_4, grammarAccess.getOperationAccess().getMethodDELETEKeyword_3_0_3());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "method", lv_method_7_4, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalRestDsl.g:451:3: (otherlv_8= 'path' ( (lv_path_9_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRestDsl.g:452:4: otherlv_8= 'path' ( (lv_path_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getPathKeyword_4_0());
                    			
                    // InternalRestDsl.g:456:4: ( (lv_path_9_0= RULE_STRING ) )
                    // InternalRestDsl.g:457:5: (lv_path_9_0= RULE_STRING )
                    {
                    // InternalRestDsl.g:457:5: (lv_path_9_0= RULE_STRING )
                    // InternalRestDsl.g:458:6: lv_path_9_0= RULE_STRING
                    {
                    lv_path_9_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_path_9_0, grammarAccess.getOperationAccess().getPathSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"path",
                    							lv_path_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRestDsl.g:475:3: (otherlv_10= 'request' ( (lv_request_11_0= ruleType ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRestDsl.g:476:4: otherlv_10= 'request' ( (lv_request_11_0= ruleType ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getOperationAccess().getRequestKeyword_5_0());
                    			
                    // InternalRestDsl.g:480:4: ( (lv_request_11_0= ruleType ) )
                    // InternalRestDsl.g:481:5: (lv_request_11_0= ruleType )
                    {
                    // InternalRestDsl.g:481:5: (lv_request_11_0= ruleType )
                    // InternalRestDsl.g:482:6: lv_request_11_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getRequestTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_request_11_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						set(
                    							current,
                    							"request",
                    							lv_request_11_0,
                    							"org.example.restdsl.RestDsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRestDsl.g:500:3: (otherlv_12= 'response' ( (lv_response_13_0= ruleType ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRestDsl.g:501:4: otherlv_12= 'response' ( (lv_response_13_0= ruleType ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getOperationAccess().getResponseKeyword_6_0());
                    			
                    // InternalRestDsl.g:505:4: ( (lv_response_13_0= ruleType ) )
                    // InternalRestDsl.g:506:5: (lv_response_13_0= ruleType )
                    {
                    // InternalRestDsl.g:506:5: (lv_response_13_0= ruleType )
                    // InternalRestDsl.g:507:6: lv_response_13_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getResponseTypeParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_response_13_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						set(
                    							current,
                    							"response",
                    							lv_response_13_0,
                    							"org.example.restdsl.RestDsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRestDsl.g:525:3: (otherlv_14= 'logic' ( (lv_logic_15_0= ruleLogic ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRestDsl.g:526:4: otherlv_14= 'logic' ( (lv_logic_15_0= ruleLogic ) )
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getOperationAccess().getLogicKeyword_7_0());
                    			
                    // InternalRestDsl.g:530:4: ( (lv_logic_15_0= ruleLogic ) )
                    // InternalRestDsl.g:531:5: (lv_logic_15_0= ruleLogic )
                    {
                    // InternalRestDsl.g:531:5: (lv_logic_15_0= ruleLogic )
                    // InternalRestDsl.g:532:6: lv_logic_15_0= ruleLogic
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getLogicLogicParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_logic_15_0=ruleLogic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						set(
                    							current,
                    							"logic",
                    							lv_logic_15_0,
                    							"org.example.restdsl.RestDsl.Logic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleType"
    // InternalRestDsl.g:554:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalRestDsl.g:554:45: (iv_ruleType= ruleType EOF )
            // InternalRestDsl.g:555:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalRestDsl.g:561:1: ruleType returns [EObject current=null] : ( (lv_type_0_0= RULE_ID ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;


        	enterRule();

        try {
            // InternalRestDsl.g:567:2: ( ( (lv_type_0_0= RULE_ID ) ) )
            // InternalRestDsl.g:568:2: ( (lv_type_0_0= RULE_ID ) )
            {
            // InternalRestDsl.g:568:2: ( (lv_type_0_0= RULE_ID ) )
            // InternalRestDsl.g:569:3: (lv_type_0_0= RULE_ID )
            {
            // InternalRestDsl.g:569:3: (lv_type_0_0= RULE_ID )
            // InternalRestDsl.g:570:4: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_type_0_0, grammarAccess.getTypeAccess().getTypeIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"type",
            					lv_type_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLogic"
    // InternalRestDsl.g:589:1: entryRuleLogic returns [EObject current=null] : iv_ruleLogic= ruleLogic EOF ;
    public final EObject entryRuleLogic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogic = null;


        try {
            // InternalRestDsl.g:589:46: (iv_ruleLogic= ruleLogic EOF )
            // InternalRestDsl.g:590:2: iv_ruleLogic= ruleLogic EOF
            {
             newCompositeNode(grammarAccess.getLogicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogic=ruleLogic();

            state._fsp--;

             current =iv_ruleLogic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogic"


    // $ANTLR start "ruleLogic"
    // InternalRestDsl.g:596:1: ruleLogic returns [EObject current=null] : (otherlv_0= '{' ( (lv_implementation_1_0= RULE_STRING ) ) otherlv_2= '}' ) ;
    public final EObject ruleLogic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_implementation_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRestDsl.g:602:2: ( (otherlv_0= '{' ( (lv_implementation_1_0= RULE_STRING ) ) otherlv_2= '}' ) )
            // InternalRestDsl.g:603:2: (otherlv_0= '{' ( (lv_implementation_1_0= RULE_STRING ) ) otherlv_2= '}' )
            {
            // InternalRestDsl.g:603:2: (otherlv_0= '{' ( (lv_implementation_1_0= RULE_STRING ) ) otherlv_2= '}' )
            // InternalRestDsl.g:604:3: otherlv_0= '{' ( (lv_implementation_1_0= RULE_STRING ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalRestDsl.g:608:3: ( (lv_implementation_1_0= RULE_STRING ) )
            // InternalRestDsl.g:609:4: (lv_implementation_1_0= RULE_STRING )
            {
            // InternalRestDsl.g:609:4: (lv_implementation_1_0= RULE_STRING )
            // InternalRestDsl.g:610:5: lv_implementation_1_0= RULE_STRING
            {
            lv_implementation_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_implementation_1_0, grammarAccess.getLogicAccess().getImplementationSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"implementation",
            						lv_implementation_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLogicAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogic"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003E2000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000001FC10002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000001C010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});

}