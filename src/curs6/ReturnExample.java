package curs6;

public class ReturnExample {

	public static void main(String[] args) {
		
		ReturnExample obj = new ReturnExample();
		obj.calculateNr(3, 20);
		obj.calculateNr(4, 20);
		
		System.out.println("--------------------------------");
		//System.out.println(obj.calculateNr(3, 20));
		System.out.println(obj.calculateNr1(4, 20));
		int sum2 = 2 + obj.calculateNr1(4, 20);
	}
	
	public void calculateNr(int num1, int num2) {
		
		System.out.println(num1 + num2);
	}
	
	public int calculateNr1(int num1, int num2) {
		
		return num1 + num2;
	}
	

}
