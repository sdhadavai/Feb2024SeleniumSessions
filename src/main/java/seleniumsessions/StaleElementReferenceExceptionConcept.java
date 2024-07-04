package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceExceptionConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement emailId=driver.findElement(By.id("input-email"));
		emailId.sendKeys("srinvas");
		driver.navigate().refresh();
		
		emailId=driver.findElement(By.id("input-email"));
		
		emailId.sendKeys("sai");
		//org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
		
		
		
		
	}

}
