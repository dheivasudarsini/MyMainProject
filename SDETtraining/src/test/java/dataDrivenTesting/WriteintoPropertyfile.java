package dataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteintoPropertyfile {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		
		p.setProperty("url", "www.whatsapp.com");
		
		p.setProperty("brw", "chrome");
		
		p.setProperty("un", "windows");
		
		p.setProperty("pwd", "microsoft");
		
		FileOutputStream fos = new FileOutputStream("./CommonDataPropertyFile.txt");
		
		p.store(fos, null);
		
		System.out.println("un");
		
	}
	
}