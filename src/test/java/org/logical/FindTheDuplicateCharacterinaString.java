package org.logical;

public class FindTheDuplicateCharacterinaString {
	
	public static void main(String[] args) {
		
		String str="Beautifull Beach";
		
		char[] duplicate=str.toCharArray();
		System.out.println("Duplicate Character in a String: ");
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1; j<str.length();j++) {
				if(duplicate[i]==duplicate[j]) {
					System.out.println(duplicate[j] + " ");
					break;
				}
			}
		}
		
	}

}
