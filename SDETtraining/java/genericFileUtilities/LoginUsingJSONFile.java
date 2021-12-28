package genericFileUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingJSONFile {


	public static void main(String[] args) throws Exception 
	{
        JSONFIleUtility ref = new JSONFIleUtility();
		String url = ref.readDatafromJSON("url");
		String un = ref.readDatafromJSON("un");
		String pwd = ref.readDatafromJSON("pwd");
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys("cat");
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		

	}

}
