package curs10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonProcessor {
	
	public void writeJson() {
		
		JSONObject obj = new JSONObject();
		obj.put("name", "TestUser");
		
		JSONArray list = new JSONArray();
		list.add("Object 1");
		list.add("Object 2");
		list.add("Object 3");
		list.add("Object 4");
		
		obj.put("listaObiecte", list);
		
		
		try {
			FileWriter file = new FileWriter("test.json");
			file.write(obj.toJSONString());
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		System.out.println(obj);
	}
	
	public void readJsonFile(String key) throws IOException, ParseException {
		
		JSONParser parser = new JSONParser ();
		
		try {
			Reader reader = new FileReader("test.json");
			JSONObject jsonObj = (JSONObject) parser.parse(reader);
			System.out.println("Read:" + jsonObj);
			
			String obiect = (String) jsonObj.get(key);
			System.out.println(obiect);

			JSONArray obj = (JSONArray) jsonObj.get("listaObiecte");
			System.out.println(obj);
			
			Iterator<String> iterator = obj.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			
			//for(String element : obj) {}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
