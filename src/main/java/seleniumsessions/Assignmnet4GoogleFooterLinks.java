package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmnet4GoogleFooterLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[6]/div[2]"));
		for(WebElement e : list) {
			System.out.println(e.getText());
		}

	}

}
