package curs9;

import java.util.Scanner;

public class Exception5 {

	public static void main(String[] args) {
		
		System.out.println(division());

	}
	
	public String test() {
		return "Text";
	
	}

	
	public static int division() {
		
		Scanner scan = new Scanner(System.in);
		int output = 0;
		try {
			System.out.println("Please enter number 1: ");
			int num1 = scan.nextInt();
			
			System.out.println("Please enter number 2: ");
			int num2 = scan.nextInt();
			num2 = (Integer) null;
			output = num1/num2;
			//System.out.println("Result: " + output);
			return output;
			
		} catch(ArithmeticException error) {
			
			System.out.println("You should not divide by 0");
			error.printStackTrace();
			return output;
		} finally {
			
			System.out.println("Finally block of code");
		}
		
		
	}
	
}
