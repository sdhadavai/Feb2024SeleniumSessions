package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	public static WebDriver driver;

	public static void main(String[] args) {
		// create a WebElement + perform action(Click, sendKeys,getText, isEnabled ...)
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1. Id: unique attribute
		//driver.findElement(By.id("input-email")).sendKeys("srinvas@gmil.com");
		//driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2. name: Can be duplicate
		//driver.findElement(By.name("email")).sendKeys("Sri@test.com");
		
		//3. class name: can be duplicate
		//driver.findElement(By.className("form-control")).sendKeys("ss@test.com");
		
		//4. xpth: 
		//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("ham@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("12345D");
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		//5. cssSelector: cascaded style sheet
		//driver.findElement(By.cssSelector("#input-email")).sendKeys("test@test.com");
		//driver.findElement(By.cssSelector("#input-password")).sendKeys("test12345");
		//driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		
		
		//6. Link Text: only for links tag=<a>
		//driver.findElement(By.linkText("Register")).click();
		
		//7. Partial link test
		//driver.findElement(By.partialLinkText("Delivery")).click();
		
		//8. tagName html
		String header = driver.findElement(By.tagName("h2")).getText();//get the first h2 tag text
		System.out.println(header);
		
		driver.findElement(By.tagName("a")).click();//clicks on first link
		
		
	}

}
