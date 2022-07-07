package curs9;

public class Homework9InsufficientFundsException extends Exception {
	
	/*
	 * este o clasa de exceptie custom
	 * extinde Exception si seteaza in constructor mesajul "Insuficient funds for transaction"
	 */

	
	public Homework9InsufficientFundsException() {
		super("Insufficient funds for transaction");

	}
}
