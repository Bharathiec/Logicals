package org.logical;

import java.util.Scanner;

public class SumofFirstandLastNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number:");
		int number = sc.nextInt();

		int lastDigit = number%10;

		int firstDigit = number;

		while (firstDigit >= 10) {
			firstDigit = firstDigit / 10;
		}
		System.out.println("First Digit= " + firstDigit);
		System.out.println("Last Digit= " + lastDigit);
		System.out.println("Sum= " + (firstDigit + lastDigit));

	}
}
