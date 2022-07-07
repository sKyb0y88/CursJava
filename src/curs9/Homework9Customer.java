package curs9;

public class Homework9Customer {
	
	/*
	 * contine 3 variable private: name, adress si email
	 * cele 3 variabile vor avea valori setate in chemarea constructorului in clasa de executie - testClass
	 */
	
	private String name;
	private String address;
	private String email;

	public Homework9Customer (String customerName, String customerAddress, String customerEmail) {
		
		name = customerName;
		address = customerAddress;
		email = customerEmail;
	}

	public String getName() {
		return name;
	}


}
