package dataDrivenTesting;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadfromJSONFile {
	
public static void main(String[]args) throws IOException, ParseException {
		
		FileReader fr = new FileReader("./JSON.json");
		
		JSONParser jp = new JSONParser();
		
		Object javaObj = jp.parse(fr);	//Upcasting is done by default
		
		HashMap map = (HashMap) javaObj;
		
		String UN = map.get("un").toString();
		
		System.out.println(UN);
		
     }

}
