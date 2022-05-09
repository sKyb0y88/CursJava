package curs3;

import java.util.Scanner;

public class AgeCheck {
	
	int age;
	
	public void askForAge() {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Please insert your age");
		age = scan.nextInt();
		
		scan.close();
	}
	
	public void checkAge() {
		if(age < 18) {
			System.out.println("Esti minor");
		} else if(age >= 18 && age < 65) {
			System.out.println("Esti adult");
		} else if(age > 65) {
			System.out.println("Esti batran");
		} 
	}
	
	

}
