package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageCurrentURL());
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "srin@gmail.com");
		eleUtil.doSendKeys(password, "ds@123");
		
		brUtil.closeBrowser();

	}

}
