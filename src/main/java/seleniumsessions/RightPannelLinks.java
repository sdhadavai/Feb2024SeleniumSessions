package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightPannelLinks {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> rightLinksList = driver.findElements(By.xpath("//a[@class='list-group-item']"));
		
		for(WebElement e: rightLinksList) {
			System.out.println(e.getText());
		}
		
	}
}
