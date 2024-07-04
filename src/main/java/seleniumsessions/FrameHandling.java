package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");//page
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		WebElement ele= driver.findElement(By.name("main"));
		driver.switchTo().frame(ele);

		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		
	}

}
