package com.example;

public class NameHelper {
	
	public static void main(String[] args) {
		System.out.println(toCamelCase("R'AVI SANKARMR"));
	}
	
	public static String toCamelCase(String name) {
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
<<<<<<< Upstream, based on origin/master
<<<<<<< Upstream, based on origin/master
		System.out.println("Ravi6");
		System.out.println("Version 1");
		System.out.println("Version 2");
=======
		System.out.println("Ravi6");
>>>>>>> e5383a9 Ravi1 Ravi2 Ravi3 Ravi4 Ravi5 Ravi 6
=======
		System.out.println("Ravi6");
		System.out.println("Version 1");
>>>>>>> 009fced Version 1
		return camelCase.toString();
	}

}

