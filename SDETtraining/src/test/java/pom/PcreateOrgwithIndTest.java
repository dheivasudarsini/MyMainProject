package pom;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.vtiger.objectRepository.BaseClass;
import com.crm.vtiger.objectRepository.HomePage;
import com.crm.vtiger.objectRepository.OrgHomePage;


@Listeners(com.crm.vtiger.objectRepository.Listener.class)
public class PcreateOrgwithIndTest extends BaseClass{

	@Test
  
	 public void createOrgTest() {
		 
		 HomePage hp = new HomePage(driver);
		 hp.getOrganisationLink().click();
		 
		 OrgHomePage o = new OrgHomePage(driver);
		 o.getOrgPlus().click();
		 o.getorgwithIndutry().click();
		 o.selectIndustry("HealthCare");
	 }

}
