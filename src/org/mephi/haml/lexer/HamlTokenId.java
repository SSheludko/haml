/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mephi.haml.lexer;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;


public class HamlTokenId implements TokenId {

	private final String name;
	private final String primaryCategory;
	private final int id;
	private static final Language<HamlTokenId> language = new HamlLanguageHierarchy().language();

	HamlTokenId(String name, String primaryCategory, int id) {
		this.name = name;
		this.primaryCategory = primaryCategory;
		this.id = id;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public int ordinal() {
		return id;
	}

	@Override
	public String primaryCategory() {
		return primaryCategory;
	}

	public static Language<HamlTokenId> getLanguage() {
		return language;
	}
}
