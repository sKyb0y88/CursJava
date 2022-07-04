package curs10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.parser.ParseException;

public class TestJsonProcessor {

	public static void main(String[] args) throws IOException, ParseException {
	
		
		JsonProcessor json = new JsonProcessor();
		//json.writeJson();
		json.readJsonFile("name");
		
		//String file = "test.json";
		//System.out.println(readJsonAsString(file));

	}
	
	public static String readJsonAsString(String file) throws IOException {
		
		return new String(Files.readAllBytes(Paths.get(file)));
	}

}
