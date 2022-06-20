package curs7;

public class Teacher {
	
	String course;
	int experienceYears; 
	String schedule;
	
	public void displayQualification(boolean canTeach) {
		
		if(canTeach) {
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify");
		}
		
	}

}
