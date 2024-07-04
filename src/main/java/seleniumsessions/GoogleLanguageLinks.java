package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		List<WebElement> langList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(langList.size());
		for(WebElement e : langList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("తెలుగు")) {
				e.click();
			}
		}
	}
	
	

}
