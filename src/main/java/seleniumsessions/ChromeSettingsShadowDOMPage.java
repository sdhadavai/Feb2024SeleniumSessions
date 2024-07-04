package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSettingsShadowDOMPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("chrome://settings/");
		
		String jsScript = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement search = (WebElement)js.executeScript(jsScript);
		search.sendKeys("notification");

	}

}
