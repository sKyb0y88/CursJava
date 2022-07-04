package curs8.package3;

public class Vehicul {
	
	public String brand;
	public int nivelPoluare;
	public String vitezaMedie;
			
	public String nume() {
		return "nume generic";
	}
	
	public String motorizare() {
		return "motorizare generica";
	}

	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru masina " + nume() + " " + brand + " este de: " + nivelPoluare + ", si viteza medie atinsa este de: " + vitezaMedie);
	}


}
