package practiceCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample4 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::a[1]")).click();
		WebElement WE = driver.findElement(By.xpath("//select[@name='accounttype']"));
		Actions AC = new Actions(driver);
		AC.moveToElement(WE).click().perform();
		
		WebElement J = driver.findElement(By.xpath("(//span[text()=' Administrator'])/following::img[1]"));
		Actions lo = new Actions(driver);
		lo.moveToElement(J).click().perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}