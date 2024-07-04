package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.cssSelector("img[title='Vehicle-Registration-Forms-and-Examples']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Srinvas");
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.tagName("h3")).getText();
		System.out.println(text);

	}

}
