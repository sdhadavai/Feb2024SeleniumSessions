package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttrbuteValue {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// create a WebElement  + perform action(Click, sendKeys,getText, isEnabled ...)
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By forgotPwd = By.linkText("Forgotten Password");
		
		String hrefVal = driver.findElement(forgotPwd).getAttribute("href");
		System.out.println(hrefVal);
		
		By emialId = By.id("input-email");
		//String placeholder = driver.findElement(emialId).getAttribute("placeholder");
		//System.out.println(placeholder);
		
		//driver.findElement(emialId).sendKeys("sri@test.com");
		/*
		 * String emailVal = driver.findElement(emialId).getText();// cannot get entered value by getText()
		 * System.out.println(emailVal);
		 */
		
		//String emailVal = driver.findElement(emialId).getAttribute("value");
		//System.out.println(emailVal);
		
		String p = doGetAttribute(emialId, "placeholder");
		System.out.println(p);
		driver.findElement(emialId).sendKeys("sri@test.com");
		String value = doGetAttribute(emialId, "value");
		System.out.println(value);
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	

}
