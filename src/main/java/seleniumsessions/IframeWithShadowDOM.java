package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeWithShadowDOM {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//Browser -- Page -- shadowDOM(open) --iFrame --element
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(9000);
		String frameJSPath = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement  frameEle = (WebElement) js.executeScript(frameJSPath);
		driver.switchTo().frame(frameEle);
		driver.findElement(By.id("glaf")).sendKeys("sri");
		driver.findElement(By.id("close")).click();
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		//jsUtil.clickElementByJS(driver.findElement(By.id("close")));
		//jsUtil.sendKeysUsingWithId("glaf", "Learning");
		
		

	}

}
