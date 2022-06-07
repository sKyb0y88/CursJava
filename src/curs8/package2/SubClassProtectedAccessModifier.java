package curs8.package2;

import curs8.package1.ProtectedAccessModifier;

public class SubClassProtectedAccessModifier extends ProtectedAccessModifier{
	
	// subclasa in alt pachet : yes

	public static void main(String[] args) {
		
		SubClassProtectedAccessModifier obj = new SubClassProtectedAccessModifier();
		obj.printMesaj();

	}

}
