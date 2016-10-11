package com.example;

public class NameHelper {
	
	public static void main(String[] args) {
		System.out.println(toCamelCase("R'AVI SANKARMR"));
	}
	
	public static String toCamelCase(String name) {
		System.out.println("on1");
		StringBuilder camelCase = new StringBuilder();
		boolean nextCharCapital = true;
		for(char c : name.toCharArray()) {
			if(Character.isSpaceChar(c)) {
				camelCase.append(c);
				nextCharCapital = true;
			}	
			else if(c == '\'' || c == '-') {
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
		String camelCaseString = camelCase.toString();
		if(camelCaseString.toLowerCase().endsWith("mr")) {
			return camelCaseString.substring(0, camelCaseString.length()-2);
		}
		System.out.println("Ravi1");
		System.out.println("Ravi2");
		System.out.println("Ravi3");
		System.out.println("Ravi4");
		System.out.println("Ravi5");
		System.out.println("Ravi6");
		System.out.println("Version 1");
		System.out.println("Version 2");
		return camelCase.toString();
	}

}

