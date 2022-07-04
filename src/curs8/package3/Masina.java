package curs8.package3;

public class Masina extends Vehicul {
	
	public Masina (String carBrand, int carPoluare, String carVitezaMedie) {
		
		brand = carBrand;
		nivelPoluare = carPoluare;
		vitezaMedie = carVitezaMedie;	
	}
	
	@Override
	public String nume() {
		return "masina";
	}
	
	@Override
	public String motorizare() {
		return "benzina";
	}

}
