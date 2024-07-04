package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeList {
	public static WebDriver driver;

	public static void main(String[] args) {
		// create a WebElement + perform action(Click, sendKeys,getText, isEnabled ...)
		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/");
		driver.get("https://flipkart.com");
		//driver.get("https://bigbasket.com");
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
		/*
		 * getElementAttributeList(images, "src"); System.out.println("---Alt-----");
		 * getElementAttributeList(images, "alt"); System.out.println("---Style-----");
		 * getElementAttributeList(images, "style");
		 */
		System.out.println("-----hrefs-----");
		getElementAttributeList(links, "href");
		System.out.println("---Titles----");
		getElementAttributeList(links, "title");
		
		
	}
	
	public static List<String> getElementAttributeList(By locator, String attrName) {
		List<WebElement> imagesList = getElements(locator);
		List<String> attrList = new ArrayList<String>();
		for(WebElement e : imagesList) {
			String attrValue = e.getAttribute(attrName);
			if(attrValue != null && attrValue.length()!=0) {
				attrList.add(attrValue);
				System.out.println(attrValue);
			}
		}
		return attrList;
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
