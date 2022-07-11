package curs10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Homework10ReadCaloriesFile {

	public String readPropertiesFile(String key) throws IOException {
		
		InputStream inputStream = new FileInputStream("calorii.properties");
		Properties prop = new Properties();
		prop.load(inputStream);
		
		String value = prop.getProperty(key);
		
		return(value);
	}
	
}
