package org.logical;

import java.util.Arrays;

public class RemoveCharactersFromArray {
	public static void main(String[] args) {
		
	
	
	String input= "33ww,67yy,889,77";
	
	String parts []=input.split(",");
	
    int numbers[]=new int[parts.length];
    
    for(int i=0;i<parts.length;i++) {
    	
    	numbers[i]=Integer.parseInt(parts[i].replaceAll("\\D", ""));
    }
    	
    	Arrays.sort(numbers);
    	//int arrayLength = numbers.length;
    /*	if (arrayLength<6) {
    		System.out.println("These are less than 3 number");
			
		} else {
			int thirdLargest = numbers[arrayLength-1];
			
			System.out.println("The third largest=" +thirdLargest);*/

System.out.println("Second largest="+numbers[numbers.length-2]);
    


	}
}