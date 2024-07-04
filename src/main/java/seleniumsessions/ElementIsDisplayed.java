package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//boolean flag = driver.findElement(By.id("input-email1")).isDisplayed();
		//System.out.println(flag);
		
		By emailId = By.id("input-email");
		By logo = By.className(".img-responsive");
		By forogtPwdLink = By.linkText("Forgotten Password");
		System.out.println(isElementDisplayed(forogtPwdLink, 2));
		
		/*
		 * if(doIsDisplayed(emailId)) { System.out.println("PASS");
		 * 
		 * } else { System.out.println("FAIL"); }
		 */
		
		/*
		 * List<WebElement> emailIdList = driver.findElements(emailId);
		 * if(emailIdList.size()==1) {
		 * System.out.println("Email id is present on the page only once."); }else {
		 * System.out.println("Email id is coming more than to one time on the page.");
		 * }
		 */
		System.out.println(isElementDisplayed(logo));
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean isElementDisplayed(By locator) {
		int elementCount = driver.findElements(locator).size();
		if(elementCount==1) {
			System.out.println("Single element is displayed: " + locator);
			return true;
		}else {
			System.out.println("Multiple or zero elements are displayed: " + locator);
			return false;
		}
	}
	
	public static boolean isElementDisplayed(By locator, int expectedElementCount) {
		int elementCount = driver.findElements(locator).size();
		if(elementCount==expectedElementCount) {
			System.out.println("Element is displayed: " + locator + " with the occurance of " + expectedElementCount);
			return true;
		}else {
			System.out.println("Multiple or zero elements are displayed" + locator + " with the occurance of " + expectedElementCount);
			return false;
		}
	}
	
	public static boolean doIsDisplayed(By locator) {
		try {
		boolean flag = getElement(locator).isDisplayed();
		System.out.println("Element is displayed: " + locator);
		return flag;
		}catch(NoSuchElementException e) {
			System.out.println("Element with locator " + locator + " is not displayed");
			return false;
		}
	}

}
