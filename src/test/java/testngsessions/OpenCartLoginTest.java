package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartLoginTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@Test(description = "checking login page title...")
	public void loginPageTitleTest() {
		String actTitle = driver.getTitle();
		System.out.println("Page title is: " + actTitle);
		Assert.assertEquals(actTitle, "Account Login","====== Title is not matched =======");
	}
	
	@Test(description = "cheking login page URL...")
	public void loginPageURLTest() {
		String actURL = driver.getCurrentUrl();
		System.out.println("Page URL is: " + actURL);
		Assert.assertTrue(actURL.contains("route=account/login"), "==== URL is not matched =====");
	}
	
	@Test(description = "Checking login page logo")
	public void loginPageLogoTest() {
		boolean flag = driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed();
		Assert.assertEquals(flag, true, "====== Logo is missing =====");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}
