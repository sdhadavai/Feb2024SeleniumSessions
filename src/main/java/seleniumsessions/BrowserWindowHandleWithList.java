package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// Parent
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();// Child

		// 1. fetch the windows ids:
		Set<String> handles = driver.getWindowHandles();

		// Set --> List
		List<String> handleList = new ArrayList<String>(handles);
		String parentWindowId = handleList.get(0);
		String childWindowId = handleList.get(1);
		System.out.println("Parent Window Id: " + parentWindowId);
		System.out.println("Child Window Id: " + childWindowId);

		// 2. switching work
		driver.switchTo().window(childWindowId);
		System.out.println("Child window URL: " + driver.getCurrentUrl());
		driver.close();// closes the child window
		// driver is lost

		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window URL: " + driver.getCurrentUrl());
		// driver.quit();
		driver.close();

	}

}
