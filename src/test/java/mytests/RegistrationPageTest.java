package mytests;

import java.util.UUID;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseTest {
	
	public String getRandomEmailId() {
		return "opencart" + System.currentTimeMillis() + "@openmail.com";
		
		//return "opencart" + UUID.randomUUID() + "@openmail.com";
	}
	
	

	@DataProvider
	public Object[][] getRegTestData() {
		return new Object[][] { 
			{ "sri1", "Automation", "1234567890", "sri@123" },
			{ "sri2", "Automation", "1234567890", "sri@123" },
			{ "sri3", "Automation", "1234567890", "sri@123" }

		};
	}

	@Test(dataProvider="getRegTestData")
	public void registrationTest(String fName, String lName, String telephone, String password) {
		driver.findElement(By.id("input-firstname")).sendKeys(fName);
		driver.findElement(By.id("input-lastname")).sendKeys(lName);
		driver.findElement(By.id("input-email")).sendKeys(getRandomEmailId());
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(password);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String text = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Your Account Has Been Created!");
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Register")).click();

	}

}
