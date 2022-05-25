package curs6;

import java.util.Random;

public class ArrayExample3 {
	
	/**
	 * Facem un program care genereaza 6 numere intre 0 si 9
	 * Le tine intr-un array
	 * Nu tine numere duplicate
	 */


	public static void main(String[] args) {

		ArrayExample3 ex = new ArrayExample3();
		ex.printArray(ex.generateNumbers());
	
	}
	//ce stim
	public int LENGHT = 6;
	public static final int MAX_NUMBERS = 9;
		
	//ce nu stim
	//metoda care genereaza nr si le pune in array
	//metoda care elimina duplicate
	//metoda care printeaza array-ul

	
	public int[] generateNumbers() {
		int[] numbers = new int[LENGHT];
		
		Random random = new Random();
		
		for(int i=0; i<LENGHT; i++) {
			
			int randomNr = 0;
			
			do {
				randomNr = random.nextInt(MAX_NUMBERS);
			} while(checkForUnicity(numbers, randomNr));
			
			
			numbers[i] = randomNr;
		}
		
		return numbers;
	}
	
	public void printArray(int[] array) {
		
		for(int nr : array) {
			System.out.print(nr + " | ");
		}
		
	}
	
	public boolean checkForUnicity(int[] array, int element) {
		
		for(int nr : array) {
			
			if(nr == element) {
				
				return true;
			}
		}
		
		return false; 
	}
	
}
