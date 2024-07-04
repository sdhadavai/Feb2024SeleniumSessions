package seleniumsessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Assignment1UseOfBrowserUtil {
	public static Properties prop;
	public static void main(String[] args) {

	BrowserUtil bUtil= new BrowserUtil();
	try {
		FileInputStream fis = new FileInputStream("./src/main/java/config/config.properties");
		prop = new Properties();
		prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	bUtil.launchBrowser(prop.getProperty("browser"));
	bUtil.launchURL(prop.getProperty("url1"));
	System.out.println("Page Title is: " + bUtil.getPageTitle());
	
	}
}
