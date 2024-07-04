package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateElements {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// create a WebElement  + perform action(Click, sendKeys,getText, isEnabled ...)
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
		By forgotPwdLink = By.linkText("Forgotten Password");
		By loginLink = By.linkText("Login");
		doClick(forgotPwdLink);
		doClick(loginLink);
	
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
		
	}

}
