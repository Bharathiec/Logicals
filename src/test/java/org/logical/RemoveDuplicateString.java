package org.logical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateString {
	
	public static void main(String[] args) {
		String sentence,result="";
		String allWords[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence=");
		 sentence = sc.nextLine().toLowerCase();
		 //split the given sentence to get each word as a string array
		allWords= sentence.split(" ");
		//convert string array allwords to linkedHashset to remove duplicates
		LinkedHashSet<String>set=new LinkedHashSet<String>(Arrays.asList(allWords));
		//convert to string
		for (String word : set) {
			result=result+word+"";
			
		}
		
		System.out.println("Sentence Remove duplicates="+result);

	}
}