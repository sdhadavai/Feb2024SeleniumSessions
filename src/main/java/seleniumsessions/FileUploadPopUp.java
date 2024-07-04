package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type=file then only Selenium will handle
		driver.findElement(By.name("upfile")).sendKeys("D:\\TestFileForUpload.png");
		
		//1. AutoIT - tool: works for windows only for plan script, will not work in Jenkins,AWS,pipeline, on cloud, in headless mode
		//2. Sikuli - lib: works on resolution images, need to take screenshots
		//3. Robot class: works only for windows
		
		
		//cookies pop up
		//adv pop up
		//browser window pop up
		
		
		
	}

}
