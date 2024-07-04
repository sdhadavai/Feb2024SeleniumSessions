package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementHandling {

	public static void main(String[] args) {
		//Pseudo classes
		//:: Before
		//:: After
		//:: Has
		
		String firstNameJS = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')";
		String lastNameJS = "return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"),'::before').getPropertyValue('content')";
		String firstNameColorJS = "return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"),'::before').getPropertyValue('color')";
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String  mand_fieldText = js.executeScript(firstNameJS).toString();
		System.out.println(mand_fieldText);
		if(mand_fieldText.contains("*")) {
			System.out.println("First name is mandatory field");
		}
		String  firstNameColor = js.executeScript(firstNameColorJS).toString();
		System.out.println(firstNameColor);
		if(firstNameColor.contains("rgb(255, 0, 0)")) {
			System.out.println("First name is mandatory field with red color");
		}
		
	}

}
