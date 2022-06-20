package curs7;

public class verifyTeacher {
	
	public static void main(String[] args) {
	
		Qualification qualification = new Qualification("Java", 5, "Afternoon");
		qualification.verify();
		
		qualification = new Qualification("Math", 3, "Morning");
		qualification.verify();
	}

}
