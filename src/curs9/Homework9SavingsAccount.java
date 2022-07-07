package curs9;

public class Homework9SavingsAccount extends Homework9Account {

	public Homework9SavingsAccount(int accNumber, double accountBalance, Homework9Customer accOwner) {
		super(accNumber, accountBalance, accOwner);
	}

	@Override
	public void withdraw(double withdrawAmount) throws Homework9InsufficientFundsException {
		
		if(withdrawAmount > balance) {
			System.out.println("The amount you've entered is greater than the available balance: " + balance);
			throw new Homework9InsufficientFundsException();
			
		} else {
			balance = balance - withdrawAmount;
			System.out.println("Please pick your money");
			System.out.println("Your new balance is: " + balance);
			System.out.println("Thank you for using our ATM!");
		}
			
		
	}
	
	/*
	 * mosteneste clasa Account
	 * seteaza in constructor accountOwner, balance si accountNumber
	 * suprascrie metoda withdraw unde implementeaza: 
	 * daca suma ce urmeaza a fi retrasa este mai mare decat balanta curenta arunca InsuficientFundsException
	 * altfel scade suma ce urmeaza a fi retrasa din balanta
	 */

}
