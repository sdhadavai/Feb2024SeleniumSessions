package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelemiiumSetup {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "D:\\2024\\Softwares\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

	}

}
