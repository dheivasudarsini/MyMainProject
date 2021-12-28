package com.crm.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDriverUtilities.WebDriverUtilities;

public class OrgHomePage {
	
	WebDriverUtilities wu = new WebDriverUtilities();
	WebDriver driver;
	
	public OrgHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("(//a[text()='Organizations'])[2]/following::a[1]"))
	private WebElement orgPlus;
	
	@FindBy(xpath=("//select[@name='industry']"))
	private WebElement orgwithIndustry;
	
	public WebElement getOrgPlus() {
		return orgPlus;
	}
	
	public WebElement getorgwithIndutry() {
		return orgwithIndustry;
	}
	
	public void selectIndustry(String industry)
	{
		wu.selectbyVisibleText(orgwithIndustry, industry);
	}
	
	

}
