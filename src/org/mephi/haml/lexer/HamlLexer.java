package org.mephi.haml.lexer;
import org.netbeans.api.lexer.PartType;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

public class HamlLexer implements Lexer<HamlTokenId> {
    
    	private LexerRestartInfo<HamlTokenId> info;
	private org.mephi.haml.antlr.HamlLexer lexer;

	public HamlLexer(LexerRestartInfo<HamlTokenId> info) {

		this.info = info;
		AntlrCharStream charStream = new AntlrCharStream(info.input(), "Haml");
		this.lexer = new org.mephi.haml.antlr.HamlLexer(charStream);
	}

	@Override
	public Token<HamlTokenId> nextToken() {

		org.antlr.runtime.Token token = lexer.nextToken();
		Token<HamlTokenId> resultToken = null;

		if (token.getType() != org.mephi.haml.antlr.HamlLexer.EOF) {
			HamlTokenId tokenId = HamlLanguageHierarchy.getToken(token.getType());
			resultToken = info.tokenFactory().createToken(tokenId);
		} else if (info.input().readLength() > 0) // incomplete token, return as a comment
		{
			HamlTokenId tokenId = HamlLanguageHierarchy.getToken(org.mephi.haml.antlr.HamlLexer.ID);
			resultToken = info.tokenFactory().createToken(tokenId, info.input().readLength(), PartType.MIDDLE);
		}
                
		return resultToken;
	}

	@Override
	public Object state() {
		return null;
	}

	@Override
	public void release() {
	}
}
