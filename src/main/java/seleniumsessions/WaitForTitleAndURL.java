package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndURL {
public static WebDriver driver ;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.isPageLoaded(10);
		
		By pricingLink = By.linkText("Pricing");
		

		eUtil.clickWhenReady(pricingLink, 10);
		//String title = waitForTitleContains("PRICING", 5);
		//System.out.println(title);
		//System.out.println(title.concat("PRICING"));

		String actUrl = waitForURLContains("pricing.html", 10);
		System.out.println(actUrl);
		

	}
	
	public static String waitForTitleContains(String titleFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("Title not found");
			
		}
		return driver.getTitle();
	}
	
	public static String waitForTitleToBe(String titleValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			if (wait.until(ExpectedConditions.titleIs(titleValue))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("Title not found");
			
		}
		return driver.getTitle();
	}
	
	public static String waitForURLContains(String urlFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println("URL not found");
			
		}
		return driver.getCurrentUrl();
	}
	
	public static String waitForURLToBe(String urlValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			if (wait.until(ExpectedConditions.urlToBe(urlValue))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println("URL not found");
			
		}
		return driver.getCurrentUrl();
	}

}
