package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegister {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement fristName = driver.findElement(By.id("input-firstname"));
		
		Actions act = new Actions(driver);
		act.sendKeys(fristName, "Amit")
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys("Sharma")
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys("amin@gmail.com")
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys("1234567890")
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys("admin@123")
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys("admin@123")
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys(Keys.SPACE)
			.pause(1000)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys(Keys.ENTER)
			.build()
			.perform();
	
	
		driver.get("https://www.amazon.in/");
		act.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys("Mackbook")
		.build().perform();
	
	}
}
