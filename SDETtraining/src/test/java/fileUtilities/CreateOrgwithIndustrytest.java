package fileUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.vtiger.objectRepository.BaseClass;


public class CreateOrgwithIndustrytest extends BaseClass {
	@Test
	public void OrgtestwithInd() {
		
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::a[1]")).click();
		Select industry = new Select(driver.findElement(By.xpath("//select[@name='industry']")));
		industry.selectByVisibleText("Healthcare");
		
	}

}
