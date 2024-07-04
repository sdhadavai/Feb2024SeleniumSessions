package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertPopUpHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.switchTo().alert();//NoAlertPresentException: no such alert --> as there is no alert present

		//JS Alerts
		//1. alert();
		//2. prompt();
		//3. confirm()
		
		//1.Alert
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		//alert.sendKeys("Srinvas");//ElementNotInteractableException: element not interactable: User dialog does not have a text box input field.
		System.out.println(text);
		alert.accept();// clicks on OK button
		//System.out.println(alert.getText()); ////NoAlertPresentException: no such alert --> as there is no alert present
		//alert.dismiss();//remove the alert like Esc key
		
		//2. confirm
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//alert.accept();//ok
		alert.dismiss();//cancel
		
		//3 prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Srinvas");
		alert.accept();//ok
		//alert.dismiss();//cancel
		
		

	}

}
