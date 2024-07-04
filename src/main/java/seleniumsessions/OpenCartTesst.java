package seleniumsessions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class OpenCartTesst {

	public static void main(String[] args) {
		
		
		//String browser = "  Edge  ";
		//ReadProperty propReader = new ReadProperty();
		//Properties prop = propReader.initPorp();
		
		//OR
		Properties prop  = new ReadProperty().initPorp();
		
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser(prop.getProperty("browser"));
		brUtil.launchURL(prop.getProperty("url"));
		
		String actTitle = brUtil.getPageTitle();
		System.out.println("Page Title: " + actTitle);
		if(actTitle.equals("Your Store")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is not correct");
		}

		String appUrl = brUtil.getPageCurrentURL();
		System.out.println("URL is: " + appUrl);
		if(appUrl.contains("opencart")) {
			System.out.println("URL is correct");
		}else {
			System.out.println("URL is not correct");
		}
		
		brUtil.quitBrowser();
		
	}

}
