package fileUtilities;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.vtiger.objectRepository.BaseClass;



public class CreateOrgTest extends BaseClass  {
	@Test
	
	public void createOrg() {
		
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
	}
	

}
