package curs2;

public class Rectangle {
	
	//variabile de instanta
	private int lenght;
	private int width;
	private String name;

	
	public Rectangle() {
		lenght = 5;
		
	}
	
	public Rectangle(int num1, int num2) {
		setLenght(num1);
		setWidth(num2); // width = num2;  // this.width =  width;
	}
	
	public Rectangle(int num1, int num2, String Name) {
		setLenght(num1);
		setWidth(num2); // width = num2;  // this.width =  width;
		name = Name;
	}
	
	
	
	public void calculateTotal() {
		//variabile locale
		int total =  lenght + width;
	}



	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	
	
	
}
