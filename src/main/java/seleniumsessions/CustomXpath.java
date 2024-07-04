package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//xpath: address of the element in the HTML DOM
		
		//1. absolute xpath
		//email field: /html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input
		
		//2. relative/custom xpath
			//formula
			//xpath axes: relationship:parent, child, siblings
			//functions
			
		//formula
		//htmltag[@attributeName='attributeValue']
		//input[@id='input-email']
		//input[@name='email']
		//input[@placeholder='E-Mail Address']
		//input --6 --FEs
		//input[@id]
		//input[@placeholder]
		
		//2 or more attrbutes
		//htmltag[@attr1='value' and @attr2='value' and @attr3='value']
		//input[@id='input-firstname' and @type='text' and @name='firstname']
		//input[@id='input-firstname' and @type='text' and @name]
		//input[@id and @type and @name]
		
		//htmltag[@attr1='value' or @attr2='value or @attr3='value']
		//input[@type='text' or @name='search' or @type='email']
		
		//*[@attr='value']
		//*[@type='text'] --3
		//input[@type='text'] --3 better performance
		
		//text() in xpath
		//htmltag[text()='value']
		//h1[text()='Register Account']
		//legend[text()='Your Personal Details']
		//a[text()='My Account']
		
		//contains()
		//contains with attribute:
		//htmltag[contains(@attr,'value')]
		//input[contains(@id,'email')]
		//input[contains(@id,'input')]
		//input[contains(@placeholder,'E-Mail')]
		
		//htmltag[contains(@attr1,'value') and @attr2='value']
		//input[contains(@placeholder,'E-Mail') and @name='email']
		
		//htmltag[contains(@attr1,'value') and contains(@attr2,'value')]
		//input[contains(@placeholder,'E-Mail') and contains(@name,'email')]
		
		//dynamic elemnets with dynamic attributes
		//<input id=firstname_12345/>
		//<input id=firstname_5343/>
		//<input id=firstname_65422/>
		//input[contains(@id,'firstname_')]
		//contains() with text()
		//htmltag[contains(text(),'value')]
		//h2[contains(text(),'New')]
		//p[contains(text(),'keep track')]
		//a[contains(text(),'Conditions')]
		//a[contains(text(),'Address') and @class='list-group-item']
		
		//starts-with():
		//htmltag[starts-with(@attr,'value')]
		//input[starts-with(@id,'firstname_')]
		//input[starts-with(@placeholder,'E-Mail')]
		//input[starts-with(@placeholder,'E-Mail') and contains(@id,'email')]
		
		//starts-with() with text()
		//htmltag[startswith(text(),'value')]
		//p[starts-with(text(),'By creating an')]
		
		//ends-wist(): is not avalable
		
		//indexing in xpath
		//  (//a[text()='Forgotten Password'])[2]
		//   (//input[@id])[4]
		
		//position()
		// (//input[@id])[position()=1]
		// (//input[@id])[1]
		
		//last()
		//   (//input[@id])[last()]
		// (//input[@id])[last()-3]
		// (//input[@id])[last()-last()+2]
		
		//help link in amazon site
		//((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]

		//text with space case:
		//label[normalize-space()='Yes']
		//label[normalize-space()='No']
		
		//(//a[text()='Rakesh King']/parent::td/following-sibling::td)[last()-1]/a --> to get emailid
		//a[text()='Rakesh King']/parent::td/following-sibling::td/a[contains(@href,'mialto:')]
		//input[@id='input-email']/preceding-sibling::label
		//input[@id='input-email']/preceding::label
		//input[@id='input-email']/preceding::p
		//input[@id='input-email']/following::p
		
	}

}
