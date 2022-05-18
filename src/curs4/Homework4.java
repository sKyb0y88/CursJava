package curs4;

import java.util.Scanner;

public class Homework4 {
	
	

	public static void main(String[] args) {
		calculateSumOfNumbers();
		//numberMultiplicationTable();
	}
	
	public static void calculateSumOfNumbers() {
		
		int number = 0;
		Scanner scan = new Scanner(System.in);
		for(int i=1; i<11; i++) {
			if(i==1) {
				System.out.println("Please insert "+ i +"st" +" number");
				number = scan.nextInt();
			} else if (i==2) {
				System.out.println("Please insert "+ i +"nd" +" number");
				number += scan.nextInt();
			} else if (i==3) {
				System.out.println("Please insert "+ i +"rd" +" number");
				number += scan.nextInt();
			} else {
				System.out.println("Please insert "+ i +"th" +" number");
				number += scan.nextInt();
			}		
		}
		
		System.out.println("The sum of numbers is: " + number);
	}
	

	public static void numberMultiplicationTable() {
		
		int number = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = scan.nextInt();
		for(int i=1; i<11; i++) {		
			System.out.println(number + "*"+ i + "=" + number*i);
		}
		
	}
	
}
