package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//Automation Steps
		//open the browser
		WebDriver driver = new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		driver.get("https://google.com");
		
		//get the tittle
		String title =driver.getTitle();
		System.out.println("The page title is: "+ title);
		if(title.equals("Google")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is not correct");
		}
		
		//get url
		String url = driver.getCurrentUrl();
		System.out.println("Page url:" + url);
		
		//validation/check point
		if(url.contains("google.com")) {
			System.out.println("URL is correct");
		}else {
			System.out.println("URL is not correct");
		}
		
		//close the browser
		driver.quit();

	}

}
