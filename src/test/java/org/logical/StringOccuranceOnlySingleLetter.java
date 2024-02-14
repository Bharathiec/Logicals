package org.logical;

import java.util.Arrays;
import java.util.Collections;

public class StringOccuranceOnlySingleLetter {
	
	public static void main(String[] args) {
		String str="Bharathi";
		char c='a';
		
		System.out.println(Collections.frequency(Arrays.asList(str.split("")), String.valueOf(c)));
	}

}
