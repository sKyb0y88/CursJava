package curs1;

public class CalculatorSalariu {
	
	int nrLucrate = 40; 
	

	public static void main(String[] args) {
	
		Tester tester1 = new Tester();
		
		tester1.setNume("Oana");
		tester1.setRatePerHour(25);
		tester1.setAge(23);
		
		System.out.println(tester1.getNume());
		System.out.println(tester1.getRatePerHour());
		System.out.println(tester1.getNume() + " are: " + tester1.getAge() + " ani");
		
		Tester tester2 = new Tester();
		tester2.setNume("Ion");
		tester2.setRatePerHour(20);
		
		System.out.println(tester2.getNume());
		System.out.println(tester2.getRatePerHour());
		tester2.setAge(30);
		System.out.println(tester2.getNume() + " are: " + tester2.getAge() + " ani");
		
		CalculatorSalariu calc = new CalculatorSalariu();
		System.out.println(calc.calculeazaSalariu(tester1.getRatePerHour()));
	
		System.out.println("Salariul lui " + tester1.getNume() + " este de " + calc.calculeazaSalariu(tester1.getRatePerHour()));
		
	}
	
	public int calculeazaSalariu(int rateHour) {
		
		
		int salariu = nrLucrate * rateHour;
				
				
		return salariu;
	}

}
