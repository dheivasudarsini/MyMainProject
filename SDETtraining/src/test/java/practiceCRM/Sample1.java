package practiceCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.vtiger.objectRepository.BaseClass;

@Listeners(com.crm.vtiger.objectRepository.Listener.class)
public class Sample1 extends BaseClass {

	@Test
	public void tc1() {
	//public static void main(String[] args) {
		
	/*	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		*/
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("(//a[text()='rganizations'])[1]")).click();
	/*	driver.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::a[1]")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Abcd");
		Select industry = new Select(driver.findElement(By.xpath("//select[@name='industry']")));
		industry.selectByVisibleText("Healthcare");
		
		driver.findElement(By.name("button")).click();
*/
	}

}
