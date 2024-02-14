package org.logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringOccurance {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Name==");
		
		String s = sc.nextLine();
		//replace the White Space
		
		s=s.replace(" ", "");
		
		//make the string char array
		
		char arr[]=s.toCharArray();
		
		//apply the logic
		
		int count=0;
		Map<Character,Integer>map=new HashMap();
		for(int i=0;i<arr.length;i++) {
			count=0;
			
			for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
			}
			map.put(arr[i], count);
		}
		
		
		System.out.println(map);
		
	}

}
