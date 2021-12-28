package genericFileUtilities;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

import genericFileUtilities.IPathConstants;
/**
 * This class is for JSONFile Utility
 * @author Dheiva
 *
 */
public class JSONFIleUtility {
	/**
	 * This method is for read data from JSON File
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String readDatafromJSON(String key) throws Exception  {
		
        FileReader fr = new FileReader(IPathConstants.JSONPath);
		
		JSONParser jp = new JSONParser();
		
		Object javaObj = jp.parse(fr);	//Upcasting is done by default
		
		HashMap map = (HashMap) javaObj;
		
		String value = map.get(key).toString();
		
		return value;
	}

}
