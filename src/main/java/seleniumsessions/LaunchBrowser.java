package seleniumsessions;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
		public static void main(String[] args) throws MalformedURLException {
		// create a WebElement  + perform action(Click, sendKeys,getText, isEnabled ...)
		
		//3 sessions ids will create 
		//WebDriver driver1  = new ChromeDriver();
		//WebDriver driver2 = new ChromeDriver();
		//WebDriver driver3 = new ChromeDriver();
			
			//3 sessions ids will create in below case as well
			WebDriver driver  = new ChromeDriver();
			driver = new ChromeDriver();
			driver = new FirefoxDriver();
			driver = new ChromeDriver();//latest id
		
	}

}
