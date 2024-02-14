package org.logical;

public class Example {
	public static void main(String[] args) {
		
		String str="45sd 67er 90yu 23 45";
		 str=str.replaceAll("([a-z])", "");
		 try {
		 int parseInt = Integer.parseInt(str);
		 System.out.println(parseInt);
		 }catch(NumberFormatException nfe) {
			 
		 }
		 System.out.println("continue");
	}

}
