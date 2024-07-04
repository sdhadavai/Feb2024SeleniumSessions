package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBackgroundColor {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		WebElement loginBnt = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
		
		String color=loginBnt.getCssValue("backgroundColor");
		System.out.println(color);
		

	}

}
