package curs7;

public class Qualification extends Teacher {
	
	public Qualification (String course, int experience, String schedule) {
		this.course = course;
		this.experienceYears = experience;
		this.schedule = schedule;	
	}

	
	public void verify() {
		
		if(experienceYears > 3 && course.equals("Java") && schedule.equalsIgnoreCase("Afternoon")) {
			displayQualification(true);
		} else {
			displayQualification(false);
		}
	}
	
}
