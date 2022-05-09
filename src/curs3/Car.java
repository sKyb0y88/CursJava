package curs3;

public class Car {
	
	public static String brand;
	public static String type;
	public static String engine;
	
	public void car(String brand, String engine) {
		Car car = new Car();
		car.brand = brand;
		car.engine = engine;
		car.type = "Suv";
	}
	
	public void carDetails() {
		System.out.println("All "+ brand + " cars are " + engine + " and are of type " + type);
	}
	
}
