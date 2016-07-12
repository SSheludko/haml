/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mephi.haml.lexer;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.mephi.haml.antlr.HamlLexer;
import org.mephi.haml.antlr.HamlParser;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

public class HamlLanguageHierarchy  extends LanguageHierarchy<HamlTokenId> {

	@Override
	protected Collection<HamlTokenId> createTokenIds() {
		return Arrays.asList(tokens);
	}

	@Override
	protected Lexer<HamlTokenId> createLexer(LexerRestartInfo<HamlTokenId> lri) {
		return new org.mephi.haml.lexer.HamlLexer(lri);
	}

	@Override
	protected String mimeType() {
		return "text/x-haml";
	}

	static synchronized HamlTokenId getToken(int id) {
		return idToToken.get(id);
	}
	private static final Map<Integer, HamlTokenId> idToToken = new HashMap<Integer, HamlTokenId>();
        
	private static final HamlTokenId[] tokens = new HamlTokenId[]{
		token(HamlLexer.INT, "number"),
                token(HamlLexer.TEXT, "text"),
                token(HamlLexer.WHITESPACE, "separator"),
                token(HamlLexer.TAG, "tag"),
                token(HamlLexer.SCREENING, "screening"),
                token(HamlLexer.CLASS, "class"),
                token(HamlLexer.ID, "id"),
                token(HamlLexer.STRING, "string"),
                token(HamlLexer.LPAREN, "text"),
                token(HamlLexer.RPAREN, "text"),
                token(HamlLexer.LBRACK, "text"),
                token(HamlLexer.RBRACK, "text"),
                token(HamlLexer.COLON, "text"),
                token(HamlLexer.COMMA, "text"),
                token(HamlLexer.SEMI, "text"),
                token(HamlLexer.PLUS, "text"),
                token(HamlLexer.MINUS, "text"),
                token(HamlLexer.STAR, "text"),
                token(HamlLexer.SLASH, "text"),
                token(HamlLexer.VBAR, "text"),
                token(HamlLexer.AMPER, "text"),
                token(HamlLexer.LESS, "text"),
                token(HamlLexer.GREATER, "text"),
                token(HamlLexer.ASSIGN, "text"),
                token(HamlLexer.PERCENT, "text"),
                token(HamlLexer.BACKQUOTE, "text"),
                token(HamlLexer.LCURLY, "text"),
                token(HamlLexer.RCURLY, "text"),
                token(HamlLexer.CIRCUMFLEX, "text"),
                token(HamlLexer.TILDE, "text"),
                token(HamlLexer.DOT, "text"),
                token(HamlLexer.AT, "text"),
                token(HamlLexer.QUESTION, "text"),
                token(HamlLexer.NOT, "text"),
                token(HamlLexer.VARIABLE, "variable"),
                token(HamlLexer.KW_IF, "keyword"),
                token(HamlLexer.KW_ELSE, "keyword"),
                token(HamlLexer.KW_FOR, "keyword"),
                token(HamlLexer.KW_DO, "keyword"),
                token(HamlLexer.UNICODE_CHAR, "error"),
                token(HamlLexer.OTHER_CHAR, "error"),
//                token(HamlLexer.ATTRIBUTE, "error"),
        };

	static {
		for (HamlTokenId token : tokens) {
			idToToken.put(token.ordinal(), token);
		}
	}

	private static HamlTokenId token(int antlrToken, String category) {
		return new HamlTokenId(HamlParser.tokenNames[antlrToken], category, antlrToken);
	}    
}
