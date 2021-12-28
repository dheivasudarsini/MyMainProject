package com.crm.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webDriverUtilities.WebDriverUtilities;

public class HomePage extends WebDriverUtilities {
	
	
       WebDriver driver;
       
       
       public HomePage(WebDriver driver) {
    	   
    	   this.driver=driver;
    	   PageFactory.initElements(driver, this);
    	   
       }
       
       @FindBy(xpath=("(//a[text()='Organizations'])[1]"))
       private WebElement organisationLink;
       
       public WebElement getOrganisationLink() {
		return organisationLink;
    	   
       }
       
       
}
