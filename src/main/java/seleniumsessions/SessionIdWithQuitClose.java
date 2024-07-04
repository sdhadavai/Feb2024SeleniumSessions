package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionIdWithQuitClose {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//sid:123
		driver.get("https://google.com");
		//get the tittle
		String title =driver.getTitle();
		System.out.println("The page title is: "+ title);
		//driver.quit();
		//System.out.println(driver.getTitle());//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		driver.close();
		driver = new ChromeDriver();//sid:456
		driver.get("https://google.com");
		System.out.println(driver.getTitle());////NoSuchSessionException: invalid session id
	}

}
