package curs4;

public class TernaryOperator {

	public static void main(String [] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		int x = (num1 > num2)?num2:num1;
		/*
		 * Este (num1>num2) : true ? - Daca da, atunci num2 va fi atribuit lui X
		 * Este (num1>num2) : false ? - Daca da, atunci num1 va fi atribuit lui X
		 * 
		 */
		
		System.out.println(x);
		
	}
}
