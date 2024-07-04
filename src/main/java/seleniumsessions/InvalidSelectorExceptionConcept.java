package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidSelectorExceptionConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//driver.findElement(By.id("input-email11")).sendKeys("Srinvas");
		//NSEE
		
		
		//wrong xpath
		//driver.findElement(By.xpath("//input//[@@@id='testing']")).click();
		//JavaScriptException
		
		//wrong css
		//driver.findElement(By.xpath("input//[@id==='testing']")).click();
		//JavaScriptException
		
		
		//driver.findElement(By.xpath("input[@#id='testing']")).click();
		//JS Error: is not a valid xpath expression
		
		driver.findElement(By.className("form-control input-lg")).sendKeys("test");
		
		
		
	}

}
