package com.h2kinfosys.spring;

public class MSWord {
	
	private String version;
	private SpellChecker spellCheker;
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public SpellChecker getSpellCheker() {
		
		return spellCheker;
	}
	public void setSpellCheker(SpellChecker spellCheker) {
		System.out.println(SpellChecker.getLanguage());
		this.spellCheker = spellCheker;
	}
	
	

}
