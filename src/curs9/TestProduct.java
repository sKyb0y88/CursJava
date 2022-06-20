package curs9;

public class TestProduct extends Product {
	
	
	public static void main(String [] args) {
		
		//Product produs = new Product();
		
		Laptop laptop = new Laptop(20, 19, 4);
		System.out.println(laptop.calculatePrice());
		laptop.printProductRationg();
		
		MobilePhone mobile = new MobilePhone(40, 19);
		System.out.println(mobile.calculatePrice());
		mobile.printProductRationg();
	}

	@Override
	public int calculatePrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
