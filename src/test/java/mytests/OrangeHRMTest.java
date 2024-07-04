package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest{
	

	
	@Test(description = "checking login page title...", priority=1)
	public void orangeHRMTitleTest() {
		String actTitle = driver.getTitle();
		System.out.println("Page title is: " + actTitle);
		Assert.assertEquals(actTitle, "30-Day Advanced Free Trial | OrangeHRM","====== Title is not matched =======");
	}
	
	@Test(description = "cheking login page URL...", priority=2)
	public void orangeHRMURLTest() {
		String actURL = driver.getCurrentUrl();
		System.out.println("Page URL is: " + actURL);
		Assert.assertTrue(actURL.contains("30-day-free-trial"), "==== URL is not matched =====");
	}
	


}



