package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJSAlert {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		By jsAlert = By.xpath("//button[text()='Click for JS Alert']");
		//driver.findElement(jsAlert).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		alertSendKeys(5, "Automation");
		

	}
	
	public static Alert waitForJSAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	public static String getAlertText(int timeout) {
		Alert alert = waitForJSAlert(timeout);
		String text = alert.getText();
		alert.accept();
		return text;
		
	}
	public static void acceptAlert(int timeout) {
		waitForJSAlert(timeout).accept();
		
	}
	
	public static void dismissAlert(int timeout) {
		waitForJSAlert(timeout).dismiss();
		
	}
	
	public static void alertSendKeys(int timeout, String value) {
		Alert alert = waitForJSAlert(timeout);
		alert.sendKeys(value);
		alert.accept();
		
	}

}
