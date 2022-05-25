package curs5;

import java.util.Scanner;

public class Homework5 {
	
	/* User has to enter an user
	 * User has to enter a password
	 * Program will print Login Error if user or pass are incorrect
	 * User has 3 attempts to insert user and password
	 * If 3rd time is unsuccessful we will print: "Maximum attempts reached. User blocked"
	 * If credentials are valid we print: "Login successful"
	 * 
	 * User: TestUser
	 * Pass: 1234
	 * 
	 * */

	public static void main(String[] args) {

		String username = "TestUser"; 
		int password = 1234; 
		String inputUser;
		int inputPassword = 0;
		int counter = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Enter your username:");
			inputUser = scan.nextLine();
			System.out.println("Enter your password:");
			inputPassword = scan.nextInt();
			
			if(!username.equalsIgnoreCase(inputUser) || inputPassword!=password) {
				System.out.println("Login error");
				counter++;
			} else if (username.equalsIgnoreCase(inputUser) & inputPassword==password){
				System.out.println("Login succesfully");
				}
			if (counter == 3) {
				System.out.println("Maximum attempts reached. User blocked");
			}
		} while (counter < 3);		
		
		System.out.println("End of program");
		scan.close();
	}

}
