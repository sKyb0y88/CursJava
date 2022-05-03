package curs3;

import java.util.Scanner;

public class Calculator {
	
	/**
	 * Calculator pentru operatiile de baza: +, -, *, / cu 2 numere
	 * Intrebam userul primul numar
	 * Intrebam operatia matematica pe care vrea sa o execute
	 * Intrebam al doilea numar
	 * Printram numerele, operatia si rezultatul : Ex: 2 + 3 = 5;
	 */ 
	int number1;
	int number2; 
	char operation;
	int result; 
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert the first number:");
		number1 = scan.nextInt();
		System.out.println("Please enter the operation :");
		operation = scan.next().charAt(0);
		System.out.println("Please insert the second number:");
		number2 = scan.nextInt();
		scan.close();
	}
	
	public void calculateValues() {
		
		if(operation == '+') {
			
			result = number1 + number2;
			printResult();
		
		} else if(operation == '-') {
			
			result = number1 - number2;
			printResult();
		
		} else if (operation == '/') {
			
			result = number1 / number2;
			printResult();
			
		} else if (operation == '*' || operation == 'x') {
			
			result = number1 * number2;
			printResult();
			
		} else {
			
			System.out.println("Please insert a valid operator between : +, -, *, x, / ");
		}
		
			
	}
	
	public void printResult() {
		
		System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
	}
	
}
