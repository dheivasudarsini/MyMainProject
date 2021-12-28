package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadfromPropertyFile {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("./CommonDataPropertyFile.txt");
		
		Properties p = new Properties();
		
		p.load(fis);
		
		String url = p.getProperty("url");
		
		String brw = p.getProperty("brw");
		
		String un = p.getProperty("un");
		
		String pwd = p.getProperty("pwd");
		
		System.out.println(url);
		
		System.out.println(brw);
		
		System.out.println(un);
		
		System.out.println(pwd);
		
		if(brw.equals("Firefox"))
			
		{
			
			System.out.println("browser is firefox");
		}
		
		else {
			
			System.out.println("browser is chrome");
		}
			
		
		

	}

}

