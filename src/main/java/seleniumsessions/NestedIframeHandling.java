package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//browser
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1");//f1
		driver.findElement(By.id("inp_val")).sendKeys("test");
		
		driver.switchTo().frame("pact2"); //f2
		driver.findElement(By.id("jex")).sendKeys("automation");
		
		driver.switchTo().frame("pact3"); //f3
		driver.findElement(By.id("glaf")).sendKeys("1M subscriber");
		
		//NoSuchFrameExcepton if we want to move from page to frame 2/3 directly
		
		// Page --> F1: Yes
		//F1 -> F2: Yes
		//F2 -->F3: Yes
		//Page -->F2:Yes
		//Page -->F3:Yes
		//Page -->F1-->F2-->F3:Yes
		
		//driver.switchTo().parentFrame();
		//driver.findElement(By.id("jex")).sendKeys(" Selenium");
		
		//driver.switchTo().parentFrame();
		//driver.findElement(By.id("inp_val")).sendKeys(" is love");
		
		//driver.switchTo().parentFrame();//page
		//String header =driver.findElement(By.tagName("h3")).getText();
		//System.out.println(header);
		
		//F3-->F2-->F1-->Page
		//F1-->Page
		//F2-->F1
		
		//Page-->NSFE
		
		//F3 -- defaultContent() --> Page
		driver.switchTo().defaultContent();
		//driver.findElement(By.id("inp_val")).sendKeys(" CICD");		
		String header =driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);
				
		//F1 -- DC --> Page
		//F1 -- PF -->Page
		
		//F2 -- DC -->Page
		
		
		
		
		

	}

}
