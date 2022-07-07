package curs9;

import java.util.Scanner;

public class Homework9TestSavingsAccount {
	
	/* 
	 * creaza un obiect de tip customer
	 * creata un obiect de tip savings Account
	 * saluta userul hi + name
	 * intreaba userul sa introduca cantitatea de retragere
	 * 
	 * clasa de test simuleaza retragerea de la atm
	 * daca are suficienti bani va printa noua balanta dupa retragere 
	 * o sa mai printeze si "please pick your money!" si "thank you for using our atm"
	 * 
	 * daca nu are bani o sa arunce o exceptie si va printa "the amount you entered is greater than the available balance: " + balance
	 * o sa mai printeze si "thank you for using our ATM" si printam stack trace eroare
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) throws Homework9InsufficientFundsException {
		
		Homework9Customer customer = new Homework9Customer("Dan", "Home address", "dan@test.com");
		Homework9SavingsAccount savings = new Homework9SavingsAccount(1234, 2600, customer);
		
		System.out.println("Hi " + customer.getName());
		System.out.println("Please enter the amount to withdraw");
		
		Scanner scanner = new Scanner(System.in);
		double moneyToWithdraw = Double.parseDouble(scanner.nextLine());
		try {
			savings.withdraw(moneyToWithdraw);
		} catch (Homework9InsufficientFundsException e) {
			e.printStackTrace();
		}
		
		scanner.close();
		
	}

}
