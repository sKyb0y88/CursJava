package curs6;


public class Homework63 {

	public static void main(String[] args) {
		
		checkForDuplicates();
		
	
	}
	
	public static void checkForDuplicates () {
		
		String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};
		
		for(int i = 0 ; i < myStringArray.length; i++) {
			System.out.println("I este: " + myStringArray[i]);
				for (int j = i + 1; j < myStringArray.length; j++) {
					System.out.println("J este: " + myStringArray[j]);
					if (myStringArray[i].equals(myStringArray[j])) {
						System.out.println("Nume duplicat: " + myStringArray[j]);
					}
				}
			}
	}
	

}
