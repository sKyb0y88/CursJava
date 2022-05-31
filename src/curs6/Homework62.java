package curs6;

public class Homework62 {

	public static void main(String[] args) {
		
		String text = "Eu invat java";
	
		countVowels(text);
				
	}
	
	public static void countVowels (String text) {
		
		int vowelsCounter = 0;
		
		for(int i = 0; i < text.length(); i++) {
			
			if(text.charAt(i) == 'a' || text.charAt(i) == 'e' ||
					text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u' ||
					text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'I' || 
					text.charAt(i) == 'O' || text.charAt(i) == 'U') {
				vowelsCounter++;
			}	
		}
		System.out.println("Vocale: " + vowelsCounter);
	}

}
