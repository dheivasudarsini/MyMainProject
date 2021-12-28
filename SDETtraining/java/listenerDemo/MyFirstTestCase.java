package listenerDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTestCase {
	
	public void vtigerTitleVerify() {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
