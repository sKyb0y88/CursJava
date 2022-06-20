package curs8.package3;

public class runHomework8 {

	public static void main(String[] args) {
		
		Vehicul bicicleta = new Bicicleta("Pegas", 0, "10");
		verificaMotorizarea(bicicleta);
		bicicleta.detaliiVehicul();
		Vehicul masina = new Masina("Mazda", 2, "100");
		verificaMotorizarea(masina);
		masina.detaliiVehicul();
		
	}
	
	public static void verificaMotorizarea(Vehicul parameter) {
		System.out.println("Numele vehiculului este: " + parameter.nume());
		System.out.println("Motorizarea vehiculului este: " + parameter.motorizare());
	}

}
