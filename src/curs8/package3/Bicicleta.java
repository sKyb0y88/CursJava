package curs8.package3;

public class Bicicleta extends Vehicul {
	
	public Bicicleta (String brand, int poluare, String vitezaMedie) {
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
	
	public static void main(String[] args) {
		
	
	}

}
