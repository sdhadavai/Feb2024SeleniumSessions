package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3AllLinks {
	
	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Total links: "+list.size());
		int linksHavingText=0;
		int linksNotHavingText=0;
		for(WebElement e: list) {
			String linkText = e.getText();
			System.out.println(linkText);
			if(linkText.length()>0) {
				linksHavingText++;
			}else {
				linksNotHavingText++;
			}
		}
		System.out.println("Total links: "+list.size());
		System.out.println("Links having text count: " + linksHavingText);
		System.out.println("Links not having text count: " +linksNotHavingText);
		

	}

}
