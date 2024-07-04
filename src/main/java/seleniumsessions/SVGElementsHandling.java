package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementsHandling {

	public static void main(String[] args) throws InterruptedException {
			
		//SVG: Scalar Vector Graph
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		
		//normal xpath will not work for SVG
		//svg[] will not work
		
		//Need to use local-name();
		// (//*[local-name()='svg'])[1]
		//driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).click();
		
		//chrome://settings/
		
		String value ="//*[local-name()='svg' and @id='map-svg']/*[name()='g' and @id='features']/*[name90='g' and @id='regions']//*[name()='path']";
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(6000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-inst')]")));
		List<WebElement> stateList = driver.findElements(By.xpath(value));
		System.out.println(stateList.size());
		
		for(WebElement e : stateList) {
			String stateName = e.getAttribute("name");
			System.out.println(stateName);
		}
	}
	
	//svg --> loal-name()
	//svg--> name()

}
