package curs6;

public class FindIndexOfElementInArray {

	/**
	 * Avem un array
	 * Ne trebuie o metoda pentru a afla care este indexul unui element
	 * Printam care este elementul si indexul
	 * Rezolvare cu FOR
	 * Rezolvare cu FOR EACH
	 * Rezolvare cu WHILE
	 */
	
	//ce stim:
	int[] numbers = {3, 5, 7, 8 , 9, 2};
	
	//ce nu stim?:
	//elementul
	//indexul
	
	public void findIndexUsingFor(int element) {
		
		for(int i=0; i<numbers.length; i++) {
			if(element == numbers[i]) {
				System.out.println("index pentru elementul" +element + " este: " + i);
			}
		}
	}
	
	public void findIndexUsingForEach(int element) {
		int index = 0; 
		for(int nr : numbers) {
			if(nr == element) {
				System.out.println("index pentru elementul" +element + " este: " + index);
			}
			
			index++;
		}
		
	}
	
	public void findIndexUsingWhile(int element) {
		int i = 0;
		
		while(i < numbers.length) {
			if(element == numbers[i]) {
				System.out.println("index pentru elementul" +element + " este: " + i);
			}
			i++;
		}
		
	}
	
	
	public static void main(String[] args) {

		FindIndexOfElementInArray obj = new FindIndexOfElementInArray();
		obj.findIndexUsingFor(9);
		System.out.println("--------------------------------------------");
		obj.findIndexUsingForEach(9);
		System.out.println("--------------------------------------------");
		obj.findIndexUsingWhile(9);

	}

}
