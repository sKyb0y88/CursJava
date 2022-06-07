package curs8.package1;

class DefaultAccessModifier {
	
	/**
	 * Daca nu mentionam niciun access modifier se considera default
	 * 
	 * Scopul lui este limitat la pachetul in care se afla
	 * 
	 * Same class: yes
	 * Subclass in acelasi pachet: yes
	 * Alta clasa in acelasi pachet: yes
	 * 
	 * Subclasa in alt pachet: nu
	 * Alta clasa in alt pachet: nu 
	 *
	 *
	 *
	 */
	
	String mesaj;
	
	void printMesaj() {
		System.out.println("Default modifier");
	}

	
	
}
