package seleniumsessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForMultipleElements {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/ ");
		By topLinks = By.cssSelector("#navbar-collapse a");
		
		int topLinksList = waitForPresenceOfElementsLocated(topLinks, 10).size();
		System.out.println(topLinksList);

	}
	
	/**
	 * An expectation for checking that there is at least one element present on a web page. 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static List<WebElement> waitForPresenceOfElementsLocated(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		 return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		
		
	}
	
	/**
	 * An expectation for checking that all elements present on the web page that match the locator are visible. 
	 * Visibility means that the elements are not only displayed but also have a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static List<WebElement> waitForVisiblityOfElementsLocated(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		 return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
		
	}

}
