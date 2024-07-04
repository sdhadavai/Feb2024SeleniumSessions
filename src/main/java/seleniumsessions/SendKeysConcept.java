package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {
	public static WebDriver driver;

	public static void main(String[] args) {
		// create a WebElement + perform action(Click, sendKeys,getText, isEnabled ...)
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		
		//driver.findElement(By.id("input-email")).sendKeys("srinvas@gmil.com");
		//driver.findElement(By.id("input-password")).sendKeys(null);
		
		String name = "srinvias";
		String degi ="SDET";
		StringBuilder sb= new StringBuilder("automation");
		StringBuffer sf = new StringBuffer("Selenium");
		driver.findElement(By.id("input-email")).sendKeys(name, " ", degi, "google", sb, sf,"123");
	
	
	}

}
