package org.logical;

import java.util.Arrays;

public class FindTheSecondLargestNumber {
	
	public static void main(String[] args) {
		secondLargest();
		usingSort();

		
	}
		public static void usingSort() {
		int array[]= {1,20,40,30,45};
		Arrays.sort(array);
		
		System.out.println("Second Largest number::"+array[array.length-2]);
		
	}

	

	public static void secondLargest() {
		int secondNum,size;
		int array[]= {89,99,899,99,77778};
		size=array.length;
		
		for(int i=0; i<size; i++) {
			
			for(int j=i+1; j<size; j++){
				if(array[i]>array[j]) {
					secondNum=array[i];
					array[i]=array[j];
					array[j]=secondNum;
				}
				
				
			}
		}
		System.out.println("Second Largest number of Array:"+ array[size-2]);
		
	}
		
}


