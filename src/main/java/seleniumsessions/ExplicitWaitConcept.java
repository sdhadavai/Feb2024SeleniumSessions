package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	public static WebDriver driver;

	public static void main(String[] args) {

		//Wait(i) --until(); --> implemented by FluentWait(c) --method(){} + until(){}
						    //--> //extended by WebDriverWait(c) --> Inherited methods + individual methods
		
		// Do not mix imp wait and exp wait
		
		//e1: 20 + 10 --> 30 secs
		//e1: 5	 + 2 --> 7 secs (waste of 5 secs)
		//e1: 0	+ 2 --> 2 secs
		//e1: 21(NSE)
		//e1: 0 + ) --> 0 secs
		//e1:20 + 0 --> 20 secs
		
		

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@type='submit']");
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * WebElement email_ele =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
		 * email_ele.sendKeys("test@gmail.com");
		 * 
		 * getElement(password).sendKeys("test123"); getElement(loginBtn).click();
		 */
		//waitForElementPresent(emailId, 10).sendKeys("sri@gmail.com");
		//getElement(password).sendKeys("srin");
		//getElement(loginBtn).click();
		//waitForElementPresent(loginBtn, 5).click();
		//waitForElementVisible(emailId,10).sendKeys("Srinvas@gmail.com");
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(emailId, "sai@gmail.com", 10);
		eUtil.doSendKeys(password, "sri124");
		eUtil.doClick(loginBtn, 5);
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
/**
 * An expectation for checking that an element is present on the DOM of a page. 
 * This does not necessarily mean that the element is visible
 * @param locator
 * @param timeout
 * @return
 */
	public static WebElement waitForElementPresent(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
/**
 * An expectation for checking that an element is present on the DOM of a page and visible.
 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.	
 * @param locator
 * @param timeout
 * @return
 */
	public static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
