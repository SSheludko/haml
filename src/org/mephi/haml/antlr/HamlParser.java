// $ANTLR 3.5.2 Haml.g 2016-07-12 12:38:16
 package org.mephi.haml.antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class HamlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AMPER", "ASSIGN", "AT", "BACKQUOTE", 
		"CIRCUMFLEX", "CLASS", "COLON", "COMMA", "DOT", "GREATER", "ID", "INT", 
		"KW_DO", "KW_ELSE", "KW_FOR", "KW_IF", "LBRACK", "LCURLY", "LESS", "LPAREN", 
		"MINUS", "NOT", "OTHER_CHAR", "PERCENT", "PLUS", "QUESTION", "RBRACK", 
		"RCURLY", "RPAREN", "SCREENING", "SEMI", "SLASH", "STAR", "STRING", "TAG", 
		"TEXT", "TILDE", "UNICODE_CHAR", "VARIABLE", "VBAR", "WHITESPACE"
	};
	public static final int EOF=-1;
	public static final int AMPER=4;
	public static final int ASSIGN=5;
	public static final int AT=6;
	public static final int BACKQUOTE=7;
	public static final int CIRCUMFLEX=8;
	public static final int CLASS=9;
	public static final int COLON=10;
	public static final int COMMA=11;
	public static final int DOT=12;
	public static final int GREATER=13;
	public static final int ID=14;
	public static final int INT=15;
	public static final int KW_DO=16;
	public static final int KW_ELSE=17;
	public static final int KW_FOR=18;
	public static final int KW_IF=19;
	public static final int LBRACK=20;
	public static final int LCURLY=21;
	public static final int LESS=22;
	public static final int LPAREN=23;
	public static final int MINUS=24;
	public static final int NOT=25;
	public static final int OTHER_CHAR=26;
	public static final int PERCENT=27;
	public static final int PLUS=28;
	public static final int QUESTION=29;
	public static final int RBRACK=30;
	public static final int RCURLY=31;
	public static final int RPAREN=32;
	public static final int SCREENING=33;
	public static final int SEMI=34;
	public static final int SLASH=35;
	public static final int STAR=36;
	public static final int STRING=37;
	public static final int TAG=38;
	public static final int TEXT=39;
	public static final int TILDE=40;
	public static final int UNICODE_CHAR=41;
	public static final int VARIABLE=42;
	public static final int VBAR=43;
	public static final int WHITESPACE=44;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public HamlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public HamlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[10+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return HamlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Haml.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// Haml.g:17:1: prog : ( haml )+ ;
	public final HamlParser.prog_return prog() throws RecognitionException {
		HamlParser.prog_return retval = new HamlParser.prog_return();
		retval.start = input.LT(1);
		int prog_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope haml1 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// Haml.g:17:5: ( ( haml )+ )
			// Haml.g:17:7: ( haml )+
			{
			root_0 = (Object)adaptor.nil();


			// Haml.g:17:7: ( haml )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CLASS||(LA1_0 >= ID && LA1_0 <= INT)||LA1_0==SCREENING||(LA1_0 >= STRING && LA1_0 <= TEXT)||LA1_0==WHITESPACE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Haml.g:17:8: haml
					{
					pushFollow(FOLLOW_haml_in_prog73);
					haml1=haml();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, haml1.getTree());

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class haml_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "haml"
	// Haml.g:19:1: haml : ( INT | TEXT | WHITESPACE | TAG | SCREENING | ID | CLASS | STRING );
	public final HamlParser.haml_return haml() throws RecognitionException {
		HamlParser.haml_return retval = new HamlParser.haml_return();
		retval.start = input.LT(1);
		int haml_StartIndex = input.index();

		Object root_0 = null;

		Token set2=null;

		Object set2_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// Haml.g:19:5: ( INT | TEXT | WHITESPACE | TAG | SCREENING | ID | CLASS | STRING )
			// Haml.g:
			{
			root_0 = (Object)adaptor.nil();


			set2=input.LT(1);
			if ( input.LA(1)==CLASS||(input.LA(1) >= ID && input.LA(1) <= INT)||input.LA(1)==SCREENING||(input.LA(1) >= STRING && input.LA(1) <= TEXT)||input.LA(1)==WHITESPACE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set2));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, haml_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "haml"

	// Delegated rules



	public static final BitSet FOLLOW_haml_in_prog73 = new BitSet(new long[]{0x000010E20000C202L});
}
