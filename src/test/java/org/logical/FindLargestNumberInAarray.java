package org.logical;

public class FindLargestNumberInAarray {
	
	public static void main(String[] args) {
		
		int arr[]= {5,10,234,678,999};
		
		int maxNumber=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxNumber) {
				maxNumber=arr[i];
			}
		}
		System.out.println(maxNumber);
	}

}
