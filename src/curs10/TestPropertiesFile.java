package curs10;

import java.io.IOException;

public class TestPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		PropertiesFileProcessor propFile = new PropertiesFileProcessor();
		//propFile.writePropertiesFile();
		propFile.readPropertiesFile("user");
		propFile.readPropertiesFile("email");
		propFile.readPropertiesFile("pass");

	}

}
