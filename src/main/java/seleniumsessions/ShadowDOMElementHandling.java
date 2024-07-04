package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElementHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(6000);
		
		//driver.findElement(By.id("pizza")).sendKeys("Sri"); will not work as it is in Shadow DOM
		
		String jsScript = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement pizza = (WebElement)js.executeScript(jsScript);
		pizza.sendKeys("Veg Pizza");
		
		
		;
	}

}
