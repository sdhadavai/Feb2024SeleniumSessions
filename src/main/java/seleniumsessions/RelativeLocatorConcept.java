package seleniumsessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//From 4.0
		
		//			  above	
		//				|
		//left <---- WebElement ----> right
		//				|
		// near		   below	
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/in/dashboard/india/delhi/new-delhi");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.linkText("Hapur, India"));
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		String rightRank = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(leftRank);
		System.out.println(rightRank);
		
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		
		String nearCity=driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearCity);
		
		
		
		
	}

}
