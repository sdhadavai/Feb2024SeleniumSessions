package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {
		

		
		//sync concept
		//sel script <-------------> app
		//Thread.sleep(10000);//10 secs -- Static wait/hard wait  from Java
		
		//dynamic wait:
		//10 secs -->element found in 2 sec then 8 seconds will be cancelled
		//10 secs -->element found in 0 sec then 10 seconds will be cancelled
		//10 secs -->element found in 8 sec then 2 seconds will be cancelled
		//10 secs -->element found in 12 sec then we get exception
		
		//1. Implicitly Wait
			//global wait: it will be applied for all the web elements by default
		//2. Explicit Wait
			//2.1 WebDriverWait
			//2.2 FluentWait
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //sel4.x
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("sri@gmail.com");//10 sec: if found in 2 secs then 8 secs cancelled
		driver.findElement(By.id("input-pasword")).sendKeys("sri@123");//10 sec
		driver.findElement(By.xpath("//input[@type='submit']")).click();//10 sec: if found in 12 sec then NSE exception
		//e4, e5 --- e10: 10 secs for all 10 elements
		
		//home page: 15 sec
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//15 scs
		// e11,e12,e13: //15 secs
		
		//login page: 10 secs
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Reg page: 5 sec
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//nullify wait=10
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		//imp wait can not be used for web elements: url, title alerts
	}

}
