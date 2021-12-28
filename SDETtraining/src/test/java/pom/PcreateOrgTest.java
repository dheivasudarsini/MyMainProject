package pom;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.vtiger.objectRepository.BaseClass;
import com.crm.vtiger.objectRepository.HomePage;

//@Listeners(com.crm.vtiger.objectRepository.Listener.class)
public class PcreateOrgTest extends BaseClass {
	@Test(retryAnalyzer=com.crm.vtiger.objectRepository.RetryAnalyser.class)
	public void createOrg() {
		HomePage hp = new HomePage(driver);
		hp.getOrganisationLink().click();
		Assert.assertTrue(true);
	}
	
	
	

}
