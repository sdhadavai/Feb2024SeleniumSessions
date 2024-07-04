package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5FooterLinksOfOpenCart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		List<WebElement> list = driver.findElements(By.xpath("/html/body/footer/div"));
		for(WebElement e : list) {
			System.out.println(e.getText());
		}

	}

}
