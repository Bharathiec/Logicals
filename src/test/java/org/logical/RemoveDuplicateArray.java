package org.logical;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {
	public static void main(String[] args) {
		
		int arr[]= {12,46,12,46,76,44,33,22};
		int n = arr.length;
		
		Set hSet=new HashSet();
		for (int i=0;i<n;i++) {
			hSet.add(arr[i]);

		}

		System.out.println(hSet);

	}

}
