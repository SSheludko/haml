// $ANTLR 3.5.2 Haml.g 2016-07-12 12:38:16
 package org.mephi.haml.antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HamlLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public HamlLexer() {} 
	public HamlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public HamlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Haml.g"; }

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:29:12: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' ) )
			// Haml.g:30:2: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPACE"

	// $ANTLR start "KW_IF"
	public final void mKW_IF() throws RecognitionException {
		try {
			int _type = KW_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:38:2: ( 'if' )
			// Haml.g:38:4: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IF"

	// $ANTLR start "KW_ELSE"
	public final void mKW_ELSE() throws RecognitionException {
		try {
			int _type = KW_ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:41:2: ( 'else' )
			// Haml.g:41:4: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ELSE"

	// $ANTLR start "KW_DO"
	public final void mKW_DO() throws RecognitionException {
		try {
			int _type = KW_DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:44:2: ( 'do' )
			// Haml.g:44:4: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DO"

	// $ANTLR start "KW_FOR"
	public final void mKW_FOR() throws RecognitionException {
		try {
			int _type = KW_FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:47:2: ( 'for' )
			// Haml.g:47:4: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FOR"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:49:11: ( '(' )
			// Haml.g:49:13: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:51:11: ( ')' )
			// Haml.g:51:13: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACK"
	public final void mLBRACK() throws RecognitionException {
		try {
			int _type = LBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:53:11: ( '[' )
			// Haml.g:53:13: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACK"

	// $ANTLR start "RBRACK"
	public final void mRBRACK() throws RecognitionException {
		try {
			int _type = RBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:55:11: ( ']' )
			// Haml.g:55:13: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACK"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:57:11: ( ':' )
			// Haml.g:57:13: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:59:10: ( ',' )
			// Haml.g:59:12: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:61:9: ( ';' )
			// Haml.g:61:11: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:63:9: ( '+' )
			// Haml.g:63:11: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:65:10: ( '-' )
			// Haml.g:65:12: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:67:9: ( '*' )
			// Haml.g:67:11: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "SLASH"
	public final void mSLASH() throws RecognitionException {
		try {
			int _type = SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:69:10: ( '/' )
			// Haml.g:69:12: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SLASH"

	// $ANTLR start "VBAR"
	public final void mVBAR() throws RecognitionException {
		try {
			int _type = VBAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:71:9: ( '|' )
			// Haml.g:71:11: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VBAR"

	// $ANTLR start "AMPER"
	public final void mAMPER() throws RecognitionException {
		try {
			int _type = AMPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:73:10: ( '&' )
			// Haml.g:73:12: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AMPER"

	// $ANTLR start "LESS"
	public final void mLESS() throws RecognitionException {
		try {
			int _type = LESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:75:9: ( '<' )
			// Haml.g:75:11: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS"

	// $ANTLR start "GREATER"
	public final void mGREATER() throws RecognitionException {
		try {
			int _type = GREATER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:77:12: ( '>' )
			// Haml.g:77:14: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:79:11: ( '=' )
			// Haml.g:79:13: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "PERCENT"
	public final void mPERCENT() throws RecognitionException {
		try {
			int _type = PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:81:12: ( '%' )
			// Haml.g:81:14: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERCENT"

	// $ANTLR start "BACKQUOTE"
	public final void mBACKQUOTE() throws RecognitionException {
		try {
			int _type = BACKQUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:83:14: ( '`' )
			// Haml.g:83:16: '`'
			{
			match('`'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BACKQUOTE"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:85:11: ( '{' )
			// Haml.g:85:13: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:87:11: ( '}' )
			// Haml.g:87:13: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "CIRCUMFLEX"
	public final void mCIRCUMFLEX() throws RecognitionException {
		try {
			int _type = CIRCUMFLEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:89:15: ( '^' )
			// Haml.g:89:17: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CIRCUMFLEX"

	// $ANTLR start "TILDE"
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:91:10: ( '~' )
			// Haml.g:91:12: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TILDE"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:93:5: ( '.' )
			// Haml.g:93:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:95:4: ( '@' )
			// Haml.g:95:6: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "QUESTION"
	public final void mQUESTION() throws RecognitionException {
		try {
			int _type = QUESTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:97:10: ( '?' )
			// Haml.g:97:12: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:99:5: ( '!' )
			// Haml.g:99:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "TEXT"
	public final void mTEXT() throws RecognitionException {
		try {
			int _type = TEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:101:6: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '-' | '_' )* )
			// Haml.g:101:8: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '-' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Haml.g:101:31: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '-' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='-'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Haml.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXT"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:103:9: ( ( '0' .. '9' )+ )
			// Haml.g:103:11: ( '0' .. '9' )+
			{
			// Haml.g:103:11: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Haml.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "TAG"
	public final void mTAG() throws RecognitionException {
		try {
			int _type = TAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:107:5: ( ( '%' ) TEXT )
			// Haml.g:107:7: ( '%' ) TEXT
			{
			// Haml.g:107:7: ( '%' )
			// Haml.g:107:8: '%'
			{
			match('%'); 
			}

			mTEXT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAG"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:109:7: ( ( WHITESPACE )? ( DOT ) ( TEXT ) ( WHITESPACE ) )
			// Haml.g:109:8: ( WHITESPACE )? ( DOT ) ( TEXT ) ( WHITESPACE )
			{
			// Haml.g:109:8: ( WHITESPACE )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Haml.g:109:9: WHITESPACE
					{
					mWHITESPACE(); 

					}
					break;

			}

			if ( input.LA(1)=='.' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Haml.g:109:26: ( TEXT )
			// Haml.g:109:27: TEXT
			{
			mTEXT(); 

			}

			// Haml.g:109:32: ( WHITESPACE )
			// Haml.g:109:33: WHITESPACE
			{
			mWHITESPACE(); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASS"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:111:4: ( ( '#' ) TEXT )
			// Haml.g:111:6: ( '#' ) TEXT
			{
			// Haml.g:111:6: ( '#' )
			// Haml.g:111:7: '#'
			{
			match('#'); 
			}

			mTEXT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:115:10: ( AT ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )* )
			// Haml.g:115:12: AT ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
			{
			mAT(); 

			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Haml.g:115:37: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Haml.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLE"

	// $ANTLR start "SCREENING"
	public final void mSCREENING() throws RecognitionException {
		try {
			int _type = SCREENING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:117:10: ( ( '\\\\' ) ( (~ ( '\\r' | '\\n' ) )* ) )
			// Haml.g:117:12: ( '\\\\' ) ( (~ ( '\\r' | '\\n' ) )* )
			{
			// Haml.g:117:12: ( '\\\\' )
			// Haml.g:117:13: '\\\\'
			{
			match('\\'); 
			}

			// Haml.g:117:18: ( (~ ( '\\r' | '\\n' ) )* )
			// Haml.g:117:19: (~ ( '\\r' | '\\n' ) )*
			{
			// Haml.g:117:19: (~ ( '\\r' | '\\n' ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Haml.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCREENING"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:120:7: ( ( '\"' ( options {greedy=false; } : . )* '\"' ) | ( '\\'' ( options {greedy=false; } : . )* '\\'' ) )
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
					// Haml.g:120:10: ( '\"' ( options {greedy=false; } : . )* '\"' )
					{
					// Haml.g:120:10: ( '\"' ( options {greedy=false; } : . )* '\"' )
					// Haml.g:120:11: '\"' ( options {greedy=false; } : . )* '\"'
					{
					match('\"'); 
					// Haml.g:120:15: ( options {greedy=false; } : . )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0=='\"') ) {
							alt6=2;
						}
						else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// Haml.g:120:43: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop6;
						}
					}

					match('\"'); 
					}

					}
					break;
				case 2 :
					// Haml.g:121:5: ( '\\'' ( options {greedy=false; } : . )* '\\'' )
					{
					// Haml.g:121:5: ( '\\'' ( options {greedy=false; } : . )* '\\'' )
					// Haml.g:121:6: '\\'' ( options {greedy=false; } : . )* '\\''
					{
					match('\''); 
					// Haml.g:121:11: ( options {greedy=false; } : . )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0=='\'') ) {
							alt7=2;
						}
						else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '&')||(LA7_0 >= '(' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// Haml.g:121:39: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop7;
						}
					}

					match('\''); 
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "UNICODE_CHAR"
	public final void mUNICODE_CHAR() throws RecognitionException {
		try {
			int _type = UNICODE_CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:131:2: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' | '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
			// Haml.g:
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_CHAR"

	// $ANTLR start "OTHER_CHAR"
	public final void mOTHER_CHAR() throws RecognitionException {
		try {
			int _type = OTHER_CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Haml.g:162:2: (~ UNICODE_CHAR )
			// Haml.g:
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '#')||(input.LA(1) >= '%' && input.LA(1) <= '/')||(input.LA(1) >= ':' && input.LA(1) <= '@')||(input.LA(1) >= '[' && input.LA(1) <= '^')||input.LA(1)=='`'||(input.LA(1) >= '{' && input.LA(1) <= '\u00BF')||input.LA(1)=='\u00D7'||input.LA(1)=='\u00F7'||(input.LA(1) >= '\u2000' && input.LA(1) <= '\u303F')||(input.LA(1) >= '\u3190' && input.LA(1) <= '\u32FF')||(input.LA(1) >= '\u3380' && input.LA(1) <= '\u33FF')||(input.LA(1) >= '\u3D2E' && input.LA(1) <= '\u4DFF')||(input.LA(1) >= '\uA000' && input.LA(1) <= '\uF8FF')||(input.LA(1) >= '\uFB00' && input.LA(1) <= '\uFFFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OTHER_CHAR"

	@Override
	public void mTokens() throws RecognitionException {
		// Haml.g:1:8: ( WHITESPACE | KW_IF | KW_ELSE | KW_DO | KW_FOR | LPAREN | RPAREN | LBRACK | RBRACK | COLON | COMMA | SEMI | PLUS | MINUS | STAR | SLASH | VBAR | AMPER | LESS | GREATER | ASSIGN | PERCENT | BACKQUOTE | LCURLY | RCURLY | CIRCUMFLEX | TILDE | DOT | AT | QUESTION | NOT | TEXT | INT | TAG | CLASS | ID | VARIABLE | SCREENING | STRING | UNICODE_CHAR | OTHER_CHAR )
		int alt9=41;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// Haml.g:1:10: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;
			case 2 :
				// Haml.g:1:21: KW_IF
				{
				mKW_IF(); 

				}
				break;
			case 3 :
				// Haml.g:1:27: KW_ELSE
				{
				mKW_ELSE(); 

				}
				break;
			case 4 :
				// Haml.g:1:35: KW_DO
				{
				mKW_DO(); 

				}
				break;
			case 5 :
				// Haml.g:1:41: KW_FOR
				{
				mKW_FOR(); 

				}
				break;
			case 6 :
				// Haml.g:1:48: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 7 :
				// Haml.g:1:55: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 8 :
				// Haml.g:1:62: LBRACK
				{
				mLBRACK(); 

				}
				break;
			case 9 :
				// Haml.g:1:69: RBRACK
				{
				mRBRACK(); 

				}
				break;
			case 10 :
				// Haml.g:1:76: COLON
				{
				mCOLON(); 

				}
				break;
			case 11 :
				// Haml.g:1:82: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 12 :
				// Haml.g:1:88: SEMI
				{
				mSEMI(); 

				}
				break;
			case 13 :
				// Haml.g:1:93: PLUS
				{
				mPLUS(); 

				}
				break;
			case 14 :
				// Haml.g:1:98: MINUS
				{
				mMINUS(); 

				}
				break;
			case 15 :
				// Haml.g:1:104: STAR
				{
				mSTAR(); 

				}
				break;
			case 16 :
				// Haml.g:1:109: SLASH
				{
				mSLASH(); 

				}
				break;
			case 17 :
				// Haml.g:1:115: VBAR
				{
				mVBAR(); 

				}
				break;
			case 18 :
				// Haml.g:1:120: AMPER
				{
				mAMPER(); 

				}
				break;
			case 19 :
				// Haml.g:1:126: LESS
				{
				mLESS(); 

				}
				break;
			case 20 :
				// Haml.g:1:131: GREATER
				{
				mGREATER(); 

				}
				break;
			case 21 :
				// Haml.g:1:139: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 22 :
				// Haml.g:1:146: PERCENT
				{
				mPERCENT(); 

				}
				break;
			case 23 :
				// Haml.g:1:154: BACKQUOTE
				{
				mBACKQUOTE(); 

				}
				break;
			case 24 :
				// Haml.g:1:164: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 25 :
				// Haml.g:1:171: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 26 :
				// Haml.g:1:178: CIRCUMFLEX
				{
				mCIRCUMFLEX(); 

				}
				break;
			case 27 :
				// Haml.g:1:189: TILDE
				{
				mTILDE(); 

				}
				break;
			case 28 :
				// Haml.g:1:195: DOT
				{
				mDOT(); 

				}
				break;
			case 29 :
				// Haml.g:1:199: AT
				{
				mAT(); 

				}
				break;
			case 30 :
				// Haml.g:1:202: QUESTION
				{
				mQUESTION(); 

				}
				break;
			case 31 :
				// Haml.g:1:211: NOT
				{
				mNOT(); 

				}
				break;
			case 32 :
				// Haml.g:1:215: TEXT
				{
				mTEXT(); 

				}
				break;
			case 33 :
				// Haml.g:1:220: INT
				{
				mINT(); 

				}
				break;
			case 34 :
				// Haml.g:1:224: TAG
				{
				mTAG(); 

				}
				break;
			case 35 :
				// Haml.g:1:228: CLASS
				{
				mCLASS(); 

				}
				break;
			case 36 :
				// Haml.g:1:234: ID
				{
				mID(); 

				}
				break;
			case 37 :
				// Haml.g:1:237: VARIABLE
				{
				mVARIABLE(); 

				}
				break;
			case 38 :
				// Haml.g:1:246: SCREENING
				{
				mSCREENING(); 

				}
				break;
			case 39 :
				// Haml.g:1:256: STRING
				{
				mSTRING(); 

				}
				break;
			case 40 :
				// Haml.g:1:263: UNICODE_CHAR
				{
				mUNICODE_CHAR(); 

				}
				break;
			case 41 :
				// Haml.g:1:276: OTHER_CHAR
				{
				mOTHER_CHAR(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\1\uffff\1\50\4\53\20\uffff\1\77\5\uffff\1\106\1\107\4\uffff\1\47\1\uffff"+
		"\2\47\4\uffff\1\117\1\uffff\1\53\1\121\1\53\41\uffff\1\53\1\uffff\1\124"+
		"\1\125\2\uffff";
	static final String DFA9_eofS =
		"\126\uffff";
	static final String DFA9_minS =
		"\1\0\1\56\1\146\1\154\2\157\20\uffff\1\101\5\uffff\2\101\4\uffff\1\101"+
		"\1\uffff\2\0\4\uffff\1\55\1\uffff\1\163\1\55\1\162\41\uffff\1\145\1\uffff"+
		"\2\55\2\uffff";
	static final String DFA9_maxS =
		"\1\uffff\1\56\1\146\1\154\2\157\20\uffff\1\172\5\uffff\2\172\4\uffff\1"+
		"\172\1\uffff\2\uffff\4\uffff\1\172\1\uffff\1\163\1\172\1\162\41\uffff"+
		"\1\145\1\uffff\2\172\2\uffff";
	static final String DFA9_acceptS =
		"\6\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
		"\1\23\1\24\1\25\1\uffff\1\27\1\30\1\31\1\32\1\33\2\uffff\1\36\1\37\1\40"+
		"\1\41\1\uffff\1\46\2\uffff\1\50\1\51\1\1\1\43\1\uffff\1\40\3\uffff\1\6"+
		"\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
		"\1\25\1\26\1\42\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\45\1\36\1\37\1\41"+
		"\1\44\1\46\1\47\1\2\1\uffff\1\4\2\uffff\1\5\1\3";
	static final String DFA9_specialS =
		"\1\0\43\uffff\1\2\1\1\60\uffff}>";
	static final String[] DFA9_transitionS = {
			"\11\47\2\1\1\47\2\1\22\47\1\1\1\37\1\44\1\42\1\46\1\26\1\22\1\45\1\6"+
			"\1\7\1\17\1\15\1\13\1\16\1\34\1\20\12\41\1\12\1\14\1\23\1\25\1\24\1\36"+
			"\1\35\32\40\1\10\1\43\1\11\1\32\1\46\1\27\3\40\1\4\1\3\1\5\2\40\1\2\21"+
			"\40\1\30\1\21\1\31\1\33\101\47\27\46\1\47\37\46\1\47\u1f08\46\u1040\47"+
			"\u0150\46\u0170\47\u0080\46\u0080\47\u092e\46\u10d2\47\u5200\46\u5900"+
			"\47\u0200\46\u0500\47",
			"\1\51",
			"\1\52",
			"\1\54",
			"\1\55",
			"\1\56",
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
			"",
			"",
			"",
			"\32\100\6\uffff\32\100",
			"",
			"",
			"",
			"",
			"",
			"\32\51\6\uffff\32\51",
			"\32\110\6\uffff\32\110",
			"",
			"",
			"",
			"",
			"\32\114\6\uffff\32\114",
			"",
			"\0\116",
			"\0\116",
			"",
			"",
			"",
			"",
			"\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
			"",
			"\1\120",
			"\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
			"\1\122",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\123",
			"",
			"\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
			"\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( WHITESPACE | KW_IF | KW_ELSE | KW_DO | KW_FOR | LPAREN | RPAREN | LBRACK | RBRACK | COLON | COMMA | SEMI | PLUS | MINUS | STAR | SLASH | VBAR | AMPER | LESS | GREATER | ASSIGN | PERCENT | BACKQUOTE | LCURLY | RCURLY | CIRCUMFLEX | TILDE | DOT | AT | QUESTION | NOT | TEXT | INT | TAG | CLASS | ID | VARIABLE | SCREENING | STRING | UNICODE_CHAR | OTHER_CHAR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA9_0 = input.LA(1);
						s = -1;
						if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||(LA9_0 >= '\f' && LA9_0 <= '\r')||LA9_0==' ') ) {s = 1;}
						else if ( (LA9_0=='i') ) {s = 2;}
						else if ( (LA9_0=='e') ) {s = 3;}
						else if ( (LA9_0=='d') ) {s = 4;}
						else if ( (LA9_0=='f') ) {s = 5;}
						else if ( (LA9_0=='(') ) {s = 6;}
						else if ( (LA9_0==')') ) {s = 7;}
						else if ( (LA9_0=='[') ) {s = 8;}
						else if ( (LA9_0==']') ) {s = 9;}
						else if ( (LA9_0==':') ) {s = 10;}
						else if ( (LA9_0==',') ) {s = 11;}
						else if ( (LA9_0==';') ) {s = 12;}
						else if ( (LA9_0=='+') ) {s = 13;}
						else if ( (LA9_0=='-') ) {s = 14;}
						else if ( (LA9_0=='*') ) {s = 15;}
						else if ( (LA9_0=='/') ) {s = 16;}
						else if ( (LA9_0=='|') ) {s = 17;}
						else if ( (LA9_0=='&') ) {s = 18;}
						else if ( (LA9_0=='<') ) {s = 19;}
						else if ( (LA9_0=='>') ) {s = 20;}
						else if ( (LA9_0=='=') ) {s = 21;}
						else if ( (LA9_0=='%') ) {s = 22;}
						else if ( (LA9_0=='`') ) {s = 23;}
						else if ( (LA9_0=='{') ) {s = 24;}
						else if ( (LA9_0=='}') ) {s = 25;}
						else if ( (LA9_0=='^') ) {s = 26;}
						else if ( (LA9_0=='~') ) {s = 27;}
						else if ( (LA9_0=='.') ) {s = 28;}
						else if ( (LA9_0=='@') ) {s = 29;}
						else if ( (LA9_0=='?') ) {s = 30;}
						else if ( (LA9_0=='!') ) {s = 31;}
						else if ( ((LA9_0 >= 'A' && LA9_0 <= 'Z')||(LA9_0 >= 'a' && LA9_0 <= 'c')||(LA9_0 >= 'g' && LA9_0 <= 'h')||(LA9_0 >= 'j' && LA9_0 <= 'z')) ) {s = 32;}
						else if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {s = 33;}
						else if ( (LA9_0=='#') ) {s = 34;}
						else if ( (LA9_0=='\\') ) {s = 35;}
						else if ( (LA9_0=='\"') ) {s = 36;}
						else if ( (LA9_0=='\'') ) {s = 37;}
						else if ( (LA9_0=='$'||LA9_0=='_'||(LA9_0 >= '\u00C0' && LA9_0 <= '\u00D6')||(LA9_0 >= '\u00D8' && LA9_0 <= '\u00F6')||(LA9_0 >= '\u00F8' && LA9_0 <= '\u1FFF')||(LA9_0 >= '\u3040' && LA9_0 <= '\u318F')||(LA9_0 >= '\u3300' && LA9_0 <= '\u337F')||(LA9_0 >= '\u3400' && LA9_0 <= '\u3D2D')||(LA9_0 >= '\u4E00' && LA9_0 <= '\u9FFF')||(LA9_0 >= '\uF900' && LA9_0 <= '\uFAFF')) ) {s = 38;}
						else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\b')||LA9_0=='\u000B'||(LA9_0 >= '\u000E' && LA9_0 <= '\u001F')||(LA9_0 >= '\u007F' && LA9_0 <= '\u00BF')||LA9_0=='\u00D7'||LA9_0=='\u00F7'||(LA9_0 >= '\u2000' && LA9_0 <= '\u303F')||(LA9_0 >= '\u3190' && LA9_0 <= '\u32FF')||(LA9_0 >= '\u3380' && LA9_0 <= '\u33FF')||(LA9_0 >= '\u3D2E' && LA9_0 <= '\u4DFF')||(LA9_0 >= '\uA000' && LA9_0 <= '\uF8FF')||(LA9_0 >= '\uFB00' && LA9_0 <= '\uFFFF')) ) {s = 39;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA9_37 = input.LA(1);
						s = -1;
						if ( ((LA9_37 >= '\u0000' && LA9_37 <= '\uFFFF')) ) {s = 78;}
						else s = 39;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA9_36 = input.LA(1);
						s = -1;
						if ( ((LA9_36 >= '\u0000' && LA9_36 <= '\uFFFF')) ) {s = 78;}
						else s = 39;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 9, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
