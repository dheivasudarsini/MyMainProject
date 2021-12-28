package genericFileUtilities;

import java.io.FileInputStream;
import java.util.Properties;

import genericFileUtilities.IPathConstants;
/**
 * this class is for property file utility
 * @author Dheiva
 *
 */
public class PropertyFileUtility {
	
	/**
	 * this method is to read data from property file
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public String readDatafromProperty(String key) throws Exception {
		
		FileInputStream fis = new FileInputStream(IPathConstants.PropertyPath);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
		
	}

}
