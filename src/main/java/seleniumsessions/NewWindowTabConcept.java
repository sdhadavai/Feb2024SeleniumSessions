package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowTabConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// Parent
		String parentWindowId = driver.getWindowHandle();
		//From Selenium 4.X
		//driver.switchTo().newWindow(WindowType.TAB); //Creates new blank tab and switch to it also
		driver.switchTo().newWindow(WindowType.WINDOW); //Creates new blank window and switch to it also
		
		driver.get("https:www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		
	}

}
