package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6DelectUtil {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");	
		
		//multiple attribute should be there with the select tag
		By dropdown = By.xpath("//*[@id=\"post-291\"]/div/div[2]/select");
		Select select = new Select(driver.findElement(dropdown));
		System.out.println(select.isMultiple());
		
		if(select.isMultiple()) {
			select.selectByVisibleText("Andean flamingo");
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("Lesser flamingo");	
		}
		
		deselectAllOptions(dropdown);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void deselectAllOptions(By locator) {
		WebElement element= getElement(locator);
		Select select = new Select(element);
		if(select.isMultiple()) {
			
			select.deselectAll();
		}else {
			System.out.println("Selected drop down is not a multi select option");
		}
		
	}
	
	

}
