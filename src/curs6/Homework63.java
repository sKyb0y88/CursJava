package curs6;

import java.util.Arrays;

public class Homework63 {

	public static void main(String[] args) {
		
		checkForDuplicates();
		
	
	}
	
	public static void checkForDuplicates () {
		
		String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};
		
		for(String name : myStringArray) {
				if (Arrays.asList(myStringArray).contains(name)) {
					System.out.println("Nume duplicat: " + name);
				}
			}
	}
	

}
