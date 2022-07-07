package curs9;

public abstract class Homework9Account {
	
	/*
	 * contine 3 variable 
	 * 1 variabila private de tip int - account number
	 * 1 variabila publica de tip double - balance
	 * 1 variabila publica de tip customer - accountOwner
	 * valoarea variabilelor se seteaza la chemarea constructorului in clasa de executie
	 * 
	 * mai avem o metoda abstracta withdraw care primeste ca argument suma ce trebuie retrasa si arunca exceptia insufficientFundsException
	 */

	private int accountNumber;
	public double balance;
	public Homework9Customer accountOwner;
	
	public Homework9Account(int accNumber, double accountBalance, Homework9Customer accOwner) {
		
		accountNumber = accNumber;
		balance = accountBalance;
		accountOwner = accOwner;
	}
	
	public abstract void withdraw (double withdrawAmount) throws Homework9InsufficientFundsException;
	
}
	

