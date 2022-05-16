package curs4;

import java.util.Scanner;

public class LetterSearch {

	
	/**
	 * citim de la tastatura un text
	 * cautam o anumite litera in el (A)
	 * daca o gasimt printam litera si numarul de cate ori am gasit litera
	 * daca nu o gasit printam ca nu am gasit litera
	 */
	
	public static void main(String[] args) {

		System.out.println("Please enter a text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		char letter = 'A';
		
		int counter = 0; 
		
		for(int i = 0; i< text.length(); i++) {
			
			char currentLetter = text.charAt(i);
			
			if(currentLetter == letter || currentLetter == 'a') {	
				counter++;

			}
		}
		
		String result = counter > 0 ? "Letter " + letter + " appeared " + counter +  " times." : "The letter " + letter + " was not found.";
		System.out.println(result);
		
	}

}
