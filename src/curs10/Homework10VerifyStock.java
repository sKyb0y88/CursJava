package curs10;

public class Homework10VerifyStock {
	
	String [] legume = {"cartof", "morcov", "varza", "ardei"};
	
	
	public boolean isLegumaAvailable(String leguma) {
		
		boolean isPresent = false;
		for (String element : legume) {
			if (element.equals(leguma)) {
				 isPresent = true;
				 break;
			}
		}
		
		return isPresent;
		
	}

}
