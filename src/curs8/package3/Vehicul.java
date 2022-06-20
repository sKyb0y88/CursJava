package curs8.package3;

public class Vehicul {
	
	private String brand;
	private int nivelPoluare;
	private String vitezaMedie;
			
	public String nume() {
		return getBrand();
	}
	
	public int motorizare() {
		return getNivelPoluare();
	}

	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru masina " + brand + " este de: " + nivelPoluare + ", si viteza medie atinsa este de: " + vitezaMedie);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNivelPoluare() {
		return nivelPoluare;
	}

	public void setNivelPoluare(int nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}

	public String getVitezaMedie() {
		return vitezaMedie;
	}

	public void setVitezaMedie(String vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}

}
