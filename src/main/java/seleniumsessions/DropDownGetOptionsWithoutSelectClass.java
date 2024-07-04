package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownGetOptionsWithoutSelectClass {
	
	//1. select  a value from dropdown without using select class methods: by index/byvalue/byvisibletext
	//2. select a value from dropdown without using select class
	
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/contact-sales/");
		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");
		//selectValueFromDropDown(country, "India");
		
		
		By countryOptions= By.xpath("//select[@id='Form_getForm_Country']/option");
		
		selectValueFromDropDownWithoutSelectClass(countryOptions, "Brazil");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//1.
	public static void selectValueFromDropDown(By locator, String optionText) {
		Select select = new Select(getElement(locator));
		List<WebElement> options = select.getOptions();
		for(WebElement e : options) {
			String text = e.getText();
			if(text.equals(optionText.trim())) {
				e.click();
				break;
			}
		}
		
	}
	
	//2
	public static void selectValueFromDropDownWithoutSelectClass(By locator, String optionText) {
		
		List<WebElement> optionsList = driver.findElements(locator);
		System.out.println(optionsList.size());
		for(WebElement e : optionsList) {
			String text= e.getText();
			if(text.equals(optionText)) {
				e.click();
				break;
			}
		}
	}

}
