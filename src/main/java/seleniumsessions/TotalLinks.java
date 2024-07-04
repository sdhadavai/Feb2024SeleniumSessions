package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	// total links
	// Fetch text of each link if text is present
	// broken links

	public static WebDriver driver;

	public static void main(String[] args) {
		// create a WebElement + perform action(Click, sendKeys,getText, isEnabled ...)
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		//driver.get("https://flipkart.com");

		// htmltag <a>
		/*
		 * List<WebElement> linksList = driver.findElements(By.tagName("a"));
		 * System.out.println("Total no of links = " + linksList.size());
		 * 
		 * for (int i = 0; i < linksList.size(); i++) { String text =
		 * linksList.get(i).getText(); if (text.length() != 0) {
		 * System.out.println(text); } }
		 * 
		 * System.out.println("-------------"); for (WebElement e : linksList) { String
		 * text = e.getText(); if (text.length() != 0) { System.out.println(text);
		 * 
		 * } } System.out.println("------------");
		 * 
		 * Iterator<WebElement> it = linksList.iterator(); while (it.hasNext()) { String
		 * text = it.next().getText(); if (text.length() != 0) {
		 * System.out.println(text); } }
		 */
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		System.out.println("Total no of links: " + getElementsCount(links));
		System.out.println("Total no of Images: " + getElementsCount(images));
		
		List<String> linksTextList = getElementTextList(links);
		System.out.println(linksTextList);
		System.out.println(linksTextList.contains("Components"));
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	//Write A Funcation (WAF) to fetch each link store it in some list and return. text should not be blank
	//name: getElementTextList
	//return: List<String>
	//parm: By locator
	
	public static List<String> getElementTextList(By locator){
		
		List<WebElement> elementList = getElements(locator);
		List<String> elementTextList = new ArrayList<>();
		for(WebElement e: elementList) {
			String text = e.getText();
			if(text.length()!=0) {
				elementTextList.add(text);
			}
		}
		return elementTextList;
	}
	
}
