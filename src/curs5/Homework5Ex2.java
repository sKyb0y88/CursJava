package curs5;

public class Homework5Ex2 {
	
	
	
	public static void main(String[] args) {
		
		int number1 = 0;
		int number2 = 1;
		int result = 0;
		
	
		fibonacciFor(number1, number2, result);
		fibonacciWhile(number1, number2, result);
	} 

	public static void fibonacciFor (int number1, int number2, int result) {
	for(int i =0; i < 8; i++) {
		result = number1 + number2;
		System.out.println("Result este: " + result);
		number2 = number1;
		number1 = result;
		}
	}
	
	public static void fibonacciWhile (int number1, int number2, int result) {
		int i = 0;
		while (i < 8) {
			result = number1 + number2;
			System.out.println("Result este: " + result);
			number2 = number1;
			number1 = result;
			i++;
		
		}
	}
}
