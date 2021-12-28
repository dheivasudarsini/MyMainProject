package com.crm.vtiger.objectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import genericFileUtilities.PropertyFileUtility;
import genericJavaUtilities.JavaUtilities;
import webDriverUtilities.WebDriverUtilities;

public class BaseClass {
	
	//public static WebDriver swd;
	public WebDriver driver;
	PropertyFileUtility p = new PropertyFileUtility();
	public WebDriverUtilities wb = new WebDriverUtilities();
	public JavaUtilities ju = new JavaUtilities();
	//Loginpage lp = new Loginpage(driver);
	//HomePage hp = new HomePage(driver);
	
	//@Parameters("browser")
	@BeforeClass
	//public void launchBrowser(String browser) throws Exception {
	public void launchBrowser() throws Exception {
		System.out.println("launch the browser");
		
	 String browser =p.readDatafromProperty("brw");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		//swd=driver;
		driver.manage().window().maximize();
		driver.get(p.readDatafromProperty("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@BeforeMethod
	public void logintoApp() throws Exception {
		Loginpage lp = new Loginpage(driver);

		String username = p.readDatafromProperty("un");
		String password= p.readDatafromProperty("pwd");
		lp.login(username, password);
	}
	@AfterMethod
	public void LogoutPage() {
		LogoutPage lop = new LogoutPage(driver);
		lop.administrator();
		lop.logout();
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
  
	
	
	

}
