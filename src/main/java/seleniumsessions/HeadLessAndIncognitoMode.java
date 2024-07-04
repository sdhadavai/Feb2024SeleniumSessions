package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessAndIncognitoMode {

	public static void main(String[] args) {

		// Headless mode:
		// no browser - browser is not displayed on monitor
		// faster
		// not recommended (No user experience)
		// when to use? --> headless based OS (Linux, docker, VM)
		// for simple and small test cases --> Yes
		// it might not work with complex html components
		// it will take screenshots
		// Actions classes will work in latest Selenum

		// ChromesOptioms class responsibility of headless mode

		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		fo.addArguments("--incognito");
		
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("-headless");
		fo.addArguments("--inprivate");

		WebDriver driver = new ChromeDriver(co);
		//WebDriver driver = new FirefoxDriver(fo);
		//WebDriver driver = new EdgeDriver(eo);

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//driver.quit();

	}

}
