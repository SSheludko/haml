// $ANTLR 3.5.2 Haml.g 2016-07-06 15:00:46
 package org.mephi.haml.antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HamlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "WHITESPACE"
	};
	public static final int EOF=-1;
	public static final int ID=4;
	public static final int INT=5;
	public static final int WHITESPACE=6;

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
	}

	@Override public String[] getTokenNames() { return HamlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Haml.g"; }



	// $ANTLR start "prog"
	// Haml.g:13:1: prog : ( haml )+ ;
	public final void prog() throws RecognitionException {
		try {
			// Haml.g:13:5: ( ( haml )+ )
			// Haml.g:13:7: ( haml )+
			{
			// Haml.g:13:7: ( haml )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ID && LA1_0 <= WHITESPACE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Haml.g:13:8: haml
					{
					pushFollow(FOLLOW_haml_in_prog54);
					haml();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "haml"
	// Haml.g:15:1: haml : ( INT | ID | WHITESPACE );
	public final void haml() throws RecognitionException {
		try {
			// Haml.g:15:5: ( INT | ID | WHITESPACE )
			// Haml.g:
			{
			if ( (input.LA(1) >= ID && input.LA(1) <= WHITESPACE) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "haml"

	// Delegated rules



	public static final BitSet FOLLOW_haml_in_prog54 = new BitSet(new long[]{0x0000000000000072L});
}
