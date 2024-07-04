package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
			driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
			WebElement sourceElement = driver.findElement(By.id("draggable"));
			WebElement tagetElement = driver.findElement(By.id("droppable"));
			
			Actions act = new Actions(driver);
			
			/*
			 * act .clickAndHold(sourceElement) .moveToElement(tagetElement)
			 * .release().perform();
			 */
			
			act.dragAndDrop(sourceElement, tagetElement).perform();
			
			//perform(): Internally calls build();
			
					
	}
	
	public static void doDragAndDrop(By sourceLocator, By tagetLocator) {
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement tagetElement = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(sourceElement, tagetElement).perform();
		
	}
			

}
