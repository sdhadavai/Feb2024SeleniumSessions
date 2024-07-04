package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {

	public static WebDriver driver;

	public static void main(String[] args) {
		// create a WebElement  + perform action(Click, sendKeys,getText, isEnabled ...)
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	/*	String header = driver.findElement(By.tagName("h2")).getText();//get the first h2 tag text
		System.out.println(header);
		
		String forgotLink = driver.findElement(By.linkText("Forgotten Password")).getText();
		System.out.println(forgotLink);
		
		String para = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]")).getText();
		System.out.println(para);*/
		
		
		By header = By.tagName("h2");
		By forgotPwd = By.linkText("Forgotten Password");
		By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		
		ElementUtil elUtil = new ElementUtil(driver);
		String h = elUtil.doGetText(header);
		System.out.println(h);
		System.out.println(elUtil.doGetText(para));
		
		
		
	}
}
