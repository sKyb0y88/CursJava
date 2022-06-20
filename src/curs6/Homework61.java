package curs6;

import java.util.Scanner;

public class Homework61 {
	
	/**
	 * Cerem userului 10 numere
	 * Punem acele numbere intr-un array
	 * Size-ul array-ul este de 10
	 * Calculam suma numerelor
	 * Printam suma numerelor
	 * 
	 */

	public static void main(String[] args) {
		
		sumNumbersOfArray();
	
	}

	public static void sumNumbersOfArray() {
		
		int arraySize = 10;
		int[] populateArray = new int[arraySize];
		int sum = 0; 
		Scanner scan = new Scanner(System.in);
		for(int i=0; i < arraySize; i++) {
			
			System.out.println("Please enter a number to populate the array");
			populateArray[i] = Integer.parseInt(scan.nextLine());	
			//sum = sum + populateArray[i];   | another way to do this is below
			sum += populateArray[i];
		}
		scan.close();
		System.out.println("Sum of the numbers from array is: " + sum);
	}
	
}
