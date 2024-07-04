package seleniumsessions;

import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		//1. valid and recommended as we can switch other browser easily: local
		//WebDriver driver = new ChromeDriver();
		
		//2. with Top interface, valid not recommended but we can access only FE and FEs methords
		//SearchContext driver = new ChromeDriver();
		
		//3. valid and recommended, for feature point not recommended if any new browser not extends the RemoteWebDriver class
		//RemoteWebDriver driver = new ChromeDriver();
		
		//4.valid and recommended for remote execution (AWS, cloud, VM machine) 
		//WebDriver driver  = new RemoteWebDriver(RemoteAddress,Capabilites);
		
		//5. valid but not recommended
		//SearchContext driver = new RemoteWebDriver(RemoteAddress,Capabilites);

		//6. valid but not recommended as it will work only for Chrome and Edge
		//ChromiumDriver driver = new ChromeDriver();
		//driver = new EdgeDriver();
		//driver = new FiefoxDriver(); //FiefoxDriver cannot be resolved to a type
		
		//7. not valid as Chromium driver is protected
		//RemoteWebDriver driver = new ChromiumDriver();
	}

}
