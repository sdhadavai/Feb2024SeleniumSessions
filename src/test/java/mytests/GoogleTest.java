package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{


	@Test(description = "checking login page title...", priority=1)
	public void googleTitleTest() {
		String actTitle = driver.getTitle();
		System.out.println("Page title is: " + actTitle);
		Assert.assertEquals(actTitle, "Google","====== Title is not matched =======");
	}
	
	@Test(description = "cheking login page URL..." , priority=2)
	public void googleURLTest() {
		String actURL = driver.getCurrentUrl();
		System.out.println("Page URL is: " + actURL);
		Assert.assertTrue(actURL.contains("google"), "==== URL is not matched =====");
	}
	


}
