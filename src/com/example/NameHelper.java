package com.example;

public class NameHelper {
	
	public static void main(String[] args) {
		System.out.println(toCamelCase("RAVI SANKARMR"));
	}
	
	public static String toCamelCase(String name) {
		StringBuilder camelCase = new StringBuilder();
		boolean nextCharCapital = true;
		for(char c : name.toCharArray()) {
			if(Character.isSpaceChar(c)) {
				camelCase.append(c);
				nextCharCapital = true;
			}	
			else if(nextCharCapital) {
				camelCase.append(Character.toUpperCase(c));
				nextCharCapital = false;
			}
			else {
				camelCase.append(Character.toLowerCase(c));
			}
		}
		return camelCase.toString();
	}

}

