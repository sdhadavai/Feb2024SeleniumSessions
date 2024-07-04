package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {
	
	//go to url
	//back
	//forward
	//refresh
	
	public static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		// create a WebElement  + perform action(Click, sendKeys,getText, isEnabled ...)
		driver = new ChromeDriver();
		
		//driver.navigate().to("https://google.com");
		driver.navigate().to(new URL ("https://google.com"));
		
		//driver.get("https://google.com");
		driver.navigate().to("https://google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://amazon.com");
		//driver.get("https://amazon.com");
		System.out.println(driver.getTitle());
		
		//back
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		//Forward
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
	}

}
