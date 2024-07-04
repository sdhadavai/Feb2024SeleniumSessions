package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest{
	

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

	
	

}
