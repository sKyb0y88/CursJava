package curs9;

public class Exception3 {

	public static void main(String[] args) {
		
		String nume = null;
		int[] array  = {1,2,3,4};

		try {
			//System.out.println(nume.length());
			System.out.println(nume);
				try {
					int x = 2;
					System.out.println(array[x]);
					System.out.println(nume.length());
					
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Index out of bound was used!");
				} catch (Exception e) {
					System.out.println("Error occured");
				}
				
		} catch(NullPointerException e) {
			System.out.println("Null pointer has occured!");
		}
		
		System.out.println("Code outside try catch");
	}

}
