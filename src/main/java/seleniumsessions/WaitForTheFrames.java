package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTheFrames {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.cssSelector("img[title='Vehicle-Registration-Forms-and-Examples']")).click();
		By frameLotacotr = By.xpath("//iframe[contains(@id,'frame-one')]");
		waitForFrame(frameLotacotr,10);
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Srinvas");
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.tagName("h3")).getText();
		System.out.println(text);
		
	}
	
	/**
	 * An expectation for checking whether the given frame is available to switch to. 
	 *If the frame is available it switches the given driver to the specified frame.
	 * @param frameLocator
	 * @param timeout
	 */
	public static void waitForFrame(By frameLocator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));

	}
	
	public static void waitForFrameByIndex(int frameIndex, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));

	}
	public static void waitForFrameByIndex(String frameIdOrName, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIdOrName));

	}
	
	public static void waitForFrameByIndex(WebElement frameElement, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));

	}
	

}
