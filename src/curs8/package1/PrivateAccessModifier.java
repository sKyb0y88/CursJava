package curs8.package1;

public class PrivateAccessModifier {

	/**
	 * Scopul este limitat la clasa in care se afla
	 * Clasa sau interfata nu pot fi declarate ca private
	 * 
	 * Aceeasi clasa : yes
	 * Subclasa acelasi pachet : no
	 * Alta clasa acelasi pachet : no
	 * Subclasa alt pachet : no 
	 * Alta clasa alt pachet : no
	 */
	
	private String mesaj = "Private";
	
	
	
	public static void main(String[] args) {
		

	}

}
