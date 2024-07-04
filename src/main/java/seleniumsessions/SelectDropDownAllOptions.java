package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {
	
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/contact-sales/");
		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");
		
		List<String> countryList = getDropDownOptionsTextList(country);
		System.out.println(countryList);
		
		List<String> employeeList = getDropDownOptionsTextList(employee);
		System.out.println(employeeList);
		
		System.out.println(getDropDownOptionsCount(country));
		System.out.println(getDropDownOptionsCount(employee));
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(driver.findElement(locator));
		return select.getOptions().size();
	}
	
	public static List<String> getDropDownOptionsTextList(By locator) {
		Select select = new Select(driver.findElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsTextList = new ArrayList<>();
		for(WebElement e: optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}

}
