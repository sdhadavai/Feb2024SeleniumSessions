package seleniumsessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSizeConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//driver.manage().window().fullscreen();
		
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().window().minimize();//sel 4x
		
		//specific size
		Dimension dim = new Dimension(430, 932);//IPhone Pro Max size
		driver.manage().window().setSize(dim);

	}

}
