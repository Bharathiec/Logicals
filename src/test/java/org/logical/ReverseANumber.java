package org.logical;

import java.util.Scanner;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
		//int number=65789,reverse=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int number = sc.nextInt();
		
		
		int reverse=0;
		
		
		while(number!=0) {
			
			int remainder=number%10;
			
			reverse=reverse*10+remainder;
			
			number=number/10;
		}
		System.out.println("The Reverse a Number " + reverse );
		
	}

}
