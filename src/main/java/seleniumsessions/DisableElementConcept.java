package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementConcept {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		//By submitButton = By.id("submitButton");
		//driver.findElement(By.id("pass")).click();//nothing will happen with no exception
		//driver.findElement(By.id("pass")).sendKeys("srinvas");//ElementNotInteractableException
		driver.findElement(By.id("passnew")).sendKeys("srinvas");
		//ElementNotInteractableException: element not intractable in case of sendKeys on disabled element
		
	}

}
