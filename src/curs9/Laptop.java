package curs9;

public class Laptop extends Product {

	int buyingPrice;
	int TVA;
	int adaosComercial;
	
	public Laptop(int buyingPrice, int TVA, int adaosComercial) {
		setBuyingPrice(buyingPrice);
		setTVA(TVA);
		setAdaosComercial(adaosComercial);
	}
	
	
	public int getBuyingPrice() {
		return buyingPrice;
	}


	public void setBuyingPrice(int buyingPrice) {
		this.buyingPrice = buyingPrice;
	}


	public int getTVA() {
		return TVA;
	}


	public void setTVA(int tVA) {
		TVA = tVA;
	}


	public int getAdaosComercial() {
		return adaosComercial;
	}


	public void setAdaosComercial(int adaosComercial) {
		this.adaosComercial = adaosComercial;
	}


	@Override
	public int calculatePrice() {
		
		return 0;
	}

}
