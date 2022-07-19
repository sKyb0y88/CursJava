package curs11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		
		System.out.println("Pease enter your name");
		Scanner scanner = new Scanner(System.in);
		String numeElev = scanner.nextLine().toLowerCase();
		
		System.out.println("Pease enter your grade");
		int notaElev = scanner.nextInt();
		
		Map<String, Integer> catalog = new HashMap<>();
		catalog.put(numeElev, notaElev);
	
		for(String key: catalog.keySet()) {
			System.out.println(key);
		}
		
		for(Integer value : catalog.values()) {
			
			System.out.println(value);
		}
		System.out.println("--------------------");
		scanner.close();
	}

}
