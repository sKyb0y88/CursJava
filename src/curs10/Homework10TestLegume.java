package curs10;

import java.io.IOException;
import java.util.Scanner;

public class Homework10TestLegume {

	public static void main(String[] args) throws IOException {

		Homework10ReadCaloriesFile calorii = new Homework10ReadCaloriesFile();
		Homework10VerifyStock checkStock = new Homework10VerifyStock();
		while (true) {

			System.out.println("Ce leguma ai vrea sa cumperi?");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			String leguma = scanner.nextLine().toLowerCase();

			if (checkStock.isLegumaAvailable(leguma)) {
				System.out.println("Leguma " + leguma + " are " + calorii.readPropertiesFile(leguma) + " calorii");			
				break;
			} else
				System.out.println("Nu vindem aceasta leguma!");
		}
	}
}
