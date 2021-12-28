package webDriverUtilities;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * this class is used for webdriver utilities
 * @param driver
 * @param ele
 */
public class WebDriverUtilities {
	WebDriver driver;

	/**
	 * this method is used to wait until page loads
	 * @param driver
	 */
	public void waitUntilPageLoads(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	/**
	 * this method is used to wait for the visibility of elements
	 * @param driver
	 * @param element
	 */
	public void waitforElementVisibility(WebDriver driver, WebElement element) {


		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));

	}

	/**
	 * this method is used to wait and click
	 * @param element
	 * @throws Exception
	 */
	public void waitandClick(WebElement element) throws Exception {
		int count =0;
		while(count<20) {
			try {
				element.click();
				break;
			}

			catch(Throwable e) {
				Thread.sleep(1000);
				count++;
			}
		}
	}

	/**
	 * this method is used for mouse hover
	 * @param driver
	 * @param ele
	 */
	public void mouseHover(WebDriver driver, WebElement ele) {

		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}

	/**
	 * this method is used for double click
	 * @param driver
	 * @param ele
	 */

	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		ele = driver.findElement(By.xpath(""));
		act.moveToElement(ele).perform();
	}
	/**
	 * this method is used for right click
	 * @param driver
	 * @param ele
	 */
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}
	/**
	 * this method is used to handle dropdown using visible text
	 * @param element
	 * @param option
	 */
	public void selectbyVisibleText(WebElement element, String option)
	{
		Select select = new Select(element);
		select.selectByVisibleText(option);
	}
	/**
	 * this method is used to handle dropdown using index
	 * @param ele
	 * @param index
	 */
	public void selectbyIndex(WebElement ele, int index)
	{
		Select select = new Select(ele);
		select.selectByIndex(index);

	}
	/**
	 * this method is used to switch to window
	 * @param driver
	 * @param partialWinTitle
	 */
	public void switchToWindow(WebDriver driver, String partialWinTitle)
	{
		Set<String>window= driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while(it.hasNext())
		{
			String winId=it.next();
			String title=driver.switchTo().window(winId).getTitle();
			if(title.contains(partialWinTitle)) {
				break;
			}
		}
	}

	/**
	 * this method is used to accept the alert
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	/**
	 * this method is used to cancel the alert
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		alert.dismiss();	}

	/**
	 * this method is used to scroll to a particular web element
	 * @param driver
	 * @param element
	 */
	public void scrollToWebElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = 	(JavascriptExecutor) driver;
		int y = element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")", element);
	}

	/**
	 * this method is used to switch frames using index
	 */
	public void switchFrame(WebDriver driver, int index) {

		driver.switchTo().frame(index);
	}

    /**
     * this method is used to switch frames using webelement
     * @param driver
     * @param element
     */
	public void switchFrame(WebDriver driver, WebElement element) {

		driver.switchTo().frame(element);
	}
	/**
	 * this method is used to switch frames using values
	 * @param element
	 * @param value
	 */
	public void selectbyValue(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
    /**
     * this method is used to switch frames using id
     * @param driver
     * @param id
     */
	public void switchFrame1(WebDriver driver, String id) 
	{
		driver.switchTo().frame(id);
	}
    /**
     * this method is used to switch frames using name
     * @param driver
     * @param name
     */
    public void switchFrame(WebDriver driver, String name) 
    {
    	driver.switchTo().frame(name);
    }
    /**
     * this method is used to take screenshot
     * @param driver
     * @param screenshotName
     * @throws Throwable
     */
    public void takeScreenshot(WebDriver driver, String screenshotName) throws Throwable
    {
    	TakesScreenshot ts = (TakesScreenshot) driver;
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	File dest=new File(".//ScreenShots//"+screenshotName+".PNG");
    	Files.copy(src, dest);
    	
    }
    
    /**
     * this method is used to pass enter key into browser
     * @param driver
     */
    public void passEnterKey(WebDriver driver )
    {
    	Actions act = new Actions(driver);
    	act.sendKeys(Keys.ENTER).perform();
    }
    
    
    
    

}
