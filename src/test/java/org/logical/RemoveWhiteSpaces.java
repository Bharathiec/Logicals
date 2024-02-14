package org.logical;

import java.util.Scanner;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Input Text Without Space");
		
		String inputStream = sc.nextLine();
		
		String withoutSpace = inputStream.replaceAll("\\s+", "");
		
		System.out.println("Input== "+ inputStream);
		
		System.out.println("Input String Without Space== " + withoutSpace);
	}

}
