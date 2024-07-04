package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
			//driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
			
			//By contentMenu = By.cssSelector(".menulink");
			//By coursesLink = By.linkText("COURSES");
			//handleParentSubMenu(contentMenu, coursesLink);
			
			driver.get("https://www.spicejet.com/");
			By addons = By.xpath("//div[text()='Add-ons']");
			By spcePlus = By.xpath("//div[text()='SpcePlus']");
			handleParentSubMenu(addons,spcePlus);
	}
	
	public static void handleParentSubMenu(By parentLocator, By childLocator) throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(parentLocator)).perform();
			
		Thread.sleep(2000);
		driver.findElement(childLocator).click();
		
	}

}
