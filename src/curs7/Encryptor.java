package curs7;

public class Encryptor {
	
	public static void main(String[] args) {
		
		Encryptor enc = new Encryptor();
		//enc.encrypt("masina");
		enc.decrypt(enc.encrypt("masina"));
		
	}
	

	
	public String encrypt(String text) {
		String textEncrypted = ""; 
		char letter = ' ';
		int letterInt = 0;
		
		System.out.println("String initial: " + text);
		
		for(int i = 0; i < text.length(); i++) {
			
			letterInt = text.charAt(i) + 1;
			//System.out.println(letterInt);
			letter = (char)letterInt;
			//System.out.println(letter);
			textEncrypted = textEncrypted + String.valueOf(letter);
		}
		
		System.out.println("Text criptat: " + textEncrypted);
		return textEncrypted;
	}
	
	public String decrypt(String textEncrypted) {
		String textDecrypted = "";
		char letter = ' ';
		int letterInt = 0;
		
		System.out.println("Text criptat initial: " + textEncrypted);
		
		for(int i = 0; i < textEncrypted.length(); i++) {
			
			letterInt = textEncrypted.charAt(i) - 1;
			letter = (char)letterInt;
			textDecrypted = textDecrypted + String.valueOf(letter);
		}
		System.out.println("Text decriptat: " + textDecrypted);
		return textEncrypted;
	}
}
