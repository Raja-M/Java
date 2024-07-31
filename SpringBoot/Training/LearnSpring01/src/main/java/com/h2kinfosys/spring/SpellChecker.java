package com.h2kinfosys.spring;

public class SpellChecker {
	
	public static String language;

	public static String getLanguage() {
		try {
			return language;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	

}
