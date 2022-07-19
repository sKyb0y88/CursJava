package curs11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework11Catalog {

	public static void main(String[] args) {

		System.out.println("Pease enter your name");
		Scanner scanner = new Scanner(System.in);
		String numeElev = scanner.nextLine();

		System.out.println("Please enter your grade");
		int notaElev = scanner.nextInt();

		Map<String, Integer> catalog = new HashMap<>();
		
		catalog.put("Alex".toLowerCase(), 8);
		catalog.put("Dan".toLowerCase(), 6);
		
		System.out.println("Exista elevul?: " + catalog.containsKey(numeElev.toLowerCase()));
		if(catalog.containsKey(numeElev.toLowerCase())) {
			
			Integer notaExistenta = catalog.get(numeElev.toLowerCase());
			System.out.println("Nota elevului existent este: " + notaExistenta);
			boolean isGradeSmaller = notaExistenta < (notaElev);
			
			if(isGradeSmaller) {
				System.out.println("Noua nota este mai mare ca cea existenta, asa ca vom actualiza nota in catalog");
				catalog.replace(numeElev, notaElev);
			} else {
				System.out.println("Nu ai nevoie de alta nota");
			}
		
		} else {
			System.out.println("Nu aveai nota, ti-am trecut acum!");
			catalog.put(numeElev.toLowerCase(), notaElev);
		}
		
		System.out.println("Catalogul contine :" + catalog);

		System.out.println("---------------------------------");
		scanner.close();
	}

}
