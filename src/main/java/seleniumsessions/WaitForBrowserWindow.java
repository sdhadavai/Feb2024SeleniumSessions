package seleniumsessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForBrowserWindow {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//Parent
		Thread.sleep(3000);
		
		By twitter = By.xpath("//a[contains(@href,'twitter')]");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.clickWhenReady(twitter, 10);

		if(waitForWindowsToBe(2,5)) {
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			String parentWindowId = it.next();
			System.out.println("Parent window id is: " + parentWindowId);
			
			String childWindowId = it.next();
			System.out.println("Child window id is: " + childWindowId);
			
			
			//2. switching work
			driver.switchTo().window(childWindowId);
			System.out.println("Child window URL: " + driver.getCurrentUrl());
			driver.close();//closes the child window
			//driver is lost
			
			driver.switchTo().window(parentWindowId);
			System.out.println("Parent window URL: " + driver.getCurrentUrl());
			//driver.quit();
			driver.close();
		}
	
		
	}
	
	public static boolean waitForWindowsToBe(int totalWindows, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindows));
	}

}
