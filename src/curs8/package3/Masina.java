package curs8.package3;

public class Masina extends Vehicul {
	
	public Masina (String brand, int poluare, String vitezaMedie) {
		this.setBrand(brand);
		this.setNivelPoluare(poluare);
		this.setVitezaMedie(vitezaMedie);	
	}
	
	public String nume() {
		return getBrand();
	}
	
	public int motorizare() {
		return getNivelPoluare();
	}

}
