package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCRMWebTable {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/ ");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		//selectUserName("neha sharma");
		//System.out.println(getCompanyName("neha sharma"));
		//selectMultipleUserName("Pooja Khatiyan");
		selectUserName("Pooja Khatiyan", 2);
		

		
	}
	
	public static void selectUserName(String userName) {
		
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox']")).click();
		
	}
	//(//a[text()='Pooja Khatiyan']/parent::td/preceding-sibling::td/child::input[@type='checkbox'])[2]
	public static void selectUserName(String userName, int index) {
		if(index>0) {
		driver.findElement(By.xpath("(//a[text()='"+userName+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox'])["+index+"]")).click();
		}
	}
	public static void selectLastUserName(String userName) {
		
		driver.findElement(By.xpath("(//a[text()='"+userName+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox'])[last()]")).click();
		
	}
	
	public static String getCompanyName(String userName) {
				return driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td/child::a[@context='company']")).getText();
		
	}
	
	public static void selectMultipleUserName(String userName) {
		List<WebElement> userCheckList = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox']"));
		for(WebElement e : userCheckList) {
			e.click();
		}
}

}
