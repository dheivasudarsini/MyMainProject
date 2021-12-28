package genericFileUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingPropertyFile {
	
	public static void main(String[] args) throws Exception {
		
		PropertyFileUtility ref = new PropertyFileUtility();
		
		String url = ref.readDatafromProperty("url");
		String un = ref.readDatafromProperty("un");
		String pwd = ref.readDatafromProperty("pwd");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys("cat");
		driver.findElement(By.xpath("")).click();
		
		
		
	}

}
