package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowWithMultipleTabHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//Parent
		
		//window handler APIs
		//any browser: window/tab
		//advertisements
		String parentWindowId = driver.getWindowHandle();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();//Child
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();//Child
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();//Child
		driver.findElement(By.xpath("//a[contains(@href,'youtub')]")).click();//Child
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1000);
			if(!parentWindowId.equals(windowId)) {
			driver.close();
			}
					
		}
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		
	}

}
