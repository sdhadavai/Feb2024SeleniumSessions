package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsException {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElement(By.id("input-email11"));//NSE
		
		List<WebElement> list = driver.findElements(By.xpath("//a[@class='list-group-item1']"));
		System.out.println(list.size());//0
		
	}

}
