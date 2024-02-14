package org.logical;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number=");
		
		int number=sc.nextInt();
		
		int org_number=number;
		
		int reverse=0;
		
		while(number!=0) {
			int remainder=number%10;
			
			 reverse=reverse*10+remainder;
			 
			 number=number/10;
		}
		if(org_number==reverse) {
			System.out.println(org_number +"== Is a Palindrome number");
			
		}else {
			System.out.println(org_number +"=Not a Palindrome number");

		}
	}

}
