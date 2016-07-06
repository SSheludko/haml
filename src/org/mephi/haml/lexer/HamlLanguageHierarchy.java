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
                token(HamlLexer.ID, "text"),
                token(HamlLexer.WHITESPACE, "separator"),};

	static {
		for (HamlTokenId token : tokens) {
			idToToken.put(token.ordinal(), token);
		}
	}

	private static HamlTokenId token(int antlrToken, String category) {
		return new HamlTokenId(HamlParser.tokenNames[antlrToken], category, antlrToken);
	}    
}
