package curs2;

public class Shape {
	
	public Shape(int length) {
		calculateSquareArea(length);
	}
	
	public Shape(int length, int width) {
		calculateRectangleArea(length, width);
	}
	
	public Shape(double radius) {
		double result = radius*radius*Math.PI;
		System.out.println("The area of the square is: " + result);
	}
	
	
	public void calculateSquareArea(int length) {
		int total = length * length;
		System.out.println("The area of the square is: " + total);
	}
	
	public void calculateRectangleArea(int length, int width ) {
		int total = length * width;
		System.out.println("The area of the rectangle is: " + total);
	}

}
