package curs8.package1;

public class ProtectedAccessModifier {
	
	/** 
	 * Scopul lui este in acelasi pachet si subclase din pachete diferite
	 * Clasele nu pot fi declarate ca si protected
	 * 
	 * Aceeasi clasa: yes
	 * Subclasa in acelasi pachet: yes
	 * Alta clasa in acelasi pachet: yes
	 * 
	 * Subclasa in alt pachet: yes
	 * Alta clasa in alt pachet: no
	 * 
	 * 
	 */

	protected String mesaj = "Protected access";

	protected void printMesaj() {
		System.out.println(mesaj);
	}
	
	public static void main(String[] args) {
		
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		obj.printMesaj();

	}

}
