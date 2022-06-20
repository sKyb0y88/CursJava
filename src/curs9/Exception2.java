package curs9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		try {
			System.out.println("Please enter number 1: ");
			int num1 = scan.nextInt();
			
			System.out.println("Please enter number 2: ");
			int num2 = scan.nextInt();
			num2 = (Integer) null;
			int output = num1/num2;
			System.out.println("Result: " + output);
		
		} catch(ArithmeticException error) {
			System.out.println("You should not divide by 0");
			error.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Please enter only integer values");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Null pointer occured");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
		System.out.println("code after try-catch");
	}

}
