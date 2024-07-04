package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// create a WebElement  + perform action(Click, sendKeys,getText, isEnabled ...)
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1.
		//driver.findElement(By.id("input-email")).sendKeys("srinvas@gmil.com");
		//driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2. 
		//WebElement emailId = driver.findElement(By.id("input-email"));
		//WebElement password = driver.findElement(By.id("input-password"));
		//emailId.sendKeys("srinvas@gmil.com");
		//password.sendKeys("test@123");
		
		//3. By locator: OR
		//By emailId = By.id("input-email");
		//By password =By.id("input-password");
		//WebElement emailId_ele =driver.findElement(emailId);
		//WebElement password_ele = driver.findElement(password);
		//emailId_ele.sendKeys("srinvas@gmil.com");
		//password_ele.sendKeys("test@123");
		
		//4. By locator + generic function for web element
		//By emailId = By.id("input-email");
		//By password = By.id("input-password");
		
		//getElement(emailId).sendKeys("Sri@test.com");
		//getElement(password).sendKeys("test123");
		
		//5.By locator + generic function for web element + sendKeys
		//By emailId = By.id("input-email");
		//By password = By.id("input-password");
		
		//doSendKeys(emailId, "Sri@test.com");
		//doSendKeys(password, "test123");
		
		//6. By locator + generic function for web element + sendKeys in ElementUtil
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "test@test.com");
		eleUtil.doSendKeys(password, "t@123");
		
		//7. By locator + BrUtil + eleUtil
		
	}
	
	public static void doSendKeys(By locator, String value) {
		//WebElement element =getElement(locator);
		//element.sendKeys(value);
		getElement(locator).sendKeys(value);
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
		
	}

}
