package curs3;

public class TestCar {

	public static void main(String[] args) {
		
		Car vehicle = new Car();
		
		vehicle.car("Mazda", "diesel");
		vehicle.carDetails();
		
		Car vehicle2 = new Car();
		
		vehicle2.car("Mercedes", "gas");
		vehicle2.type = "Sedan";
		
		vehicle2.carDetails();
		vehicle.carDetails();

	}

}
