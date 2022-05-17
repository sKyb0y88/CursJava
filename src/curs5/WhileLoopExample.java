package curs5;

import java.util.Scanner;

public class WhileLoopExample {
	
	/**
	 * Program care calculeaza salariul pe o saptamana
	 * Intrebam utilizatorul cate ore a lucrat
	 * Calculam daca a lucrat maxim 40 de ore pe saptamana si minim o ora pe saptamana respectiva
	 * Daca introduce un numar invalid il rugam sa introduca din nou
	 * Rate per hour este 15
	 */
	

	public static void main(String[] args) {
		
		//ce stim
		int maxNumbersHoursWorked = 40;
		int ratePerHour = 15;
		
		//ce nu stim
		System.out.println("Cate ore ai lucrat saptamana aceasta?");
		Scanner scan = new Scanner(System.in);
		int hoursWorked = scan.nextInt();
		
		//hoursWorked < 0 || hoursWorked > 40 --> (65 <1 || 65>40) --> conditia 2 evaluarea pe true si intra in while
		
		//hoursWorked < 0 && hoursWorked > 40 --> (65 <1 && 65>40) --> evaluarea pe false si nu intra in while
		
		//validarea 
		while(hoursWorked < 0 || hoursWorked > 40) {
			System.out.println("Numar invalid de ore lucrate");
			System.out.println("Te rog introdu un numar intre 1 si 40");
			hoursWorked = scan.nextInt();
		}
		
		System.out.println("Nr ore lucrate este: " + hoursWorked*ratePerHour);
	}

}
