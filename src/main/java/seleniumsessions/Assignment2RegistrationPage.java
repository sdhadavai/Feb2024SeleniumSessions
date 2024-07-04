package seleniumsessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment2RegistrationPage {
	
	public static Properties prop;
	public static WebDriver driver;
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("./src/main/java/config/config.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BrowserUtil bUtil = new BrowserUtil();
		driver = bUtil.launchBrowser(prop.getProperty("browser"));
		bUtil.launchURL(prop.getProperty("url2"));
		System.out.println("Page title is: " + bUtil.getPageTitle());
		
		//Registration page
		By fName = By.id("input-firstname");
		By lName = By.name("lastname");
		By email = By.xpath("//*[@id='input-email']");
		By telephone = By.xpath("//input[@id='input-telephone']");
		By pwd = By.id("input-password");
		By confirmPwd = By.id("input-confirm");
		ElementUtil eUtil = new ElementUtil(driver);
		
		eUtil.doSendKeys(fName, "Srinvas");
		eUtil.doSendKeys(lName, "Dhadavai");
		eUtil.doSendKeys(email, "sri@test.com");
		eUtil.doSendKeys(telephone, "98987389334");
		eUtil.doSendKeys(pwd, "test@1234");
		eUtil.doSendKeys(confirmPwd, "test@1234");
		



	}

}
