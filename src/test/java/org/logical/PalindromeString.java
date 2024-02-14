package org.logical;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name=");
		
		String str=sc.next();
		
		String org_str=str;
		
		String rstr="";
		
		char ch;
		
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			rstr=ch+rstr;
		}
		if(org_str.equals(rstr)) {
			System.out.println(org_str+"=Is a Palindrome String");

		}else {
			System.out.println(org_str+"=Not a Palindrome String");

		}
		
	}

}
