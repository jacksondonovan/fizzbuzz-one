package com.fizzbuzzlucky;

import java.util.Arrays;

public class FizzBuzzLucky {
	public static void main(String[] args) {
		printFizzBuzz(1, 20);
	}

	public static int[] printFizzBuzz(int rangeStart, int rangeEnd) {
		int fizzFactor = 3;
		int buzzFactor = 5;

		int fizzFrequency = 0;
		int buzzFrequency = 0;
		int fizzBuzzFrequency = 0;
		int integerFrequency = 0;

		// Print the range of numbers/fizzbuzz words
		for(int number = rangeStart; number <= rangeEnd; number++) {
			if(number % fizzFactor == 0 && number % buzzFactor == 0) {
				fizzBuzzFrequency++;
				System.out.println("fizzbuzz");
			}
			else if(number % fizzFactor == 0) {
				fizzFrequency++;
				System.out.println("fizz");
			}
			else if(number % buzzFactor == 0) {
				buzzFrequency++;
				System.out.println("buzz");
			}
			else {
				integerFrequency++;
				System.out.println(number);
			}
		}

		int[] resultsReport = new int[4];
		resultsReport[0] = fizzFrequency;
		resultsReport[1] = buzzFrequency;
		resultsReport[2] = fizzBuzzFrequency;
		resultsReport[3] = integerFrequency;

		return resultsReport;
	}
}
