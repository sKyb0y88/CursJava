package curs5;

import java.util.Scanner;

public class SwitchExample {
	
	/*
	 * Intrebam userul ce calificativ a obtinut
	 * Pe baza calificativului printam un mesaj
	 * A --> Felicitari!
	 * B --> Destul de bine!
	 * C --> Suficient
	 * D --> Insuficient
	 * Daca introduce alt calificativ decat cele de mai sus, printram "Nota invalida!"
	 */


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu ce nota ai luat:");
		String nota = scan.next();
		
		switch (nota) {
		
		case "A" : 
			System.out.println("Felicitari!");
			break;
		case "B" :
			System.out.println("Destul de bine");
			break;
		case "C" :
			System.out.println("Insuficient");
			break;
		case "D" :
			System.out.println("Insuficient");
			break;
		default : 
			System.out.println("Nota invalida!");
			break;
		}

	}

}
