package pom;

import org.testng.annotations.Test;

import com.crm.vtiger.objectRepository.BaseClass;
import com.crm.vtiger.objectRepository.HomePage;
import com.crm.vtiger.objectRepository.OrgHomePage;

public class PcreateOrgwithIndustrytest extends BaseClass {
	@Test
	public void createOrgwithIndustry() throws Throwable {
		
		HomePage hp = new HomePage(driver);
		hp.getOrganisationLink().click();
	
	
	OrgHomePage o = new OrgHomePage(driver);
	o.getOrgPlus().click();
	o.getorgwithIndutry().click();
	o.selectIndustry("Healthcare");
	Thread.sleep(5000);
	
	}
}
