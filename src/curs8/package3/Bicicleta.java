package curs8.package3;

public class Bicicleta extends Vehicul {
	
	public Bicicleta (String bikeBrand, int bikePoluare, String bikeVitezaMedie) {

		brand = bikeBrand;
		nivelPoluare = bikePoluare;
		vitezaMedie = bikeVitezaMedie;	
	}
	
	@Override
	public String nume() {
		return "bicicleta";
	}
	
	@Override
	public String motorizare() {
		return "pedale";
	}
	
}
