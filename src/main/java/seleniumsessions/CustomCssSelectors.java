package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelectors {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		// css: (Cascaded Style Sheet) locator
		//id: #id
		//htmltag#id
		
		//  #input-email
		//  input#input-email
		
		
		//class: .className
		//htmltag.className
		
		// .form-control
		// input.form-control
		// img.img-responsive
		
		// .c1.c2.c3 .... .cn
		// .form-control.input-lg
		// input.form-control.input-lg
		// .form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email
		// input.login-email
		// input.login-password
		
		//id and className
		//htmltag#id.className or htmltag.className#id
		// input#input-email.form-control
		// input.form-control#input-email
		// input.form-control.private-form__control.login-email#username
		// input#username.form-control.private-form__control.login-email
		
		// a.list-group-item -- 13 -- FEs
		
		
		//other than Id and class attributes
		// htmltag[attr='value']
		// input[name='email'] -- cass
		//input[@name='email'] --Xpath
		// input[placeholder='E-Mail Address']
		// input[id='input-email']
		
		//two attributes
		// htmltag[attr='value'][attr2='value'][attr3='value']
		// input[id='input-email'][name='email'][placeholder='E-Mail Address']
		// No or in CSS
		
		// input[id][name='email'][placeholder='E-Mail Address']
		// input[id][name][placeholder]
		
		// a[href]
		// input[name='email']#input-email
		// input#input-email[name='email']
		// input[name='email']#input-email.form-control
		
		// input[placeholder*='E-Mail'] -- contains
		// input[placeholder^='E-Mail'] -- starts with
		// input[placeholder$='Address'] -- ends with
		
		//text in css? -- not available
		
		//parent to Child -- Yes user > symbol for direct, space for indirect and indirect
		
		// select#Form_getForm_Country > option -- direct element
		// select#Form_getForm_Country>option
		// select#Form_getForm_Country option -- direct + indirect child elements
		
		// div#content form
		// div#content form > div.form-group > input#input-email
		// nav#top > div -- direct =1
		// nav#top  div -- direct + indirect = 4
		
		//child to parent in Css is not allowed: Backward traversing in DOM is not allowed
		
		//sibling in css:
		//preceding-sibling in CSS: NA
		//following-sibling in CSS: yes use + symbol it gives only immediate sibling
		// label[for='input-email']+input#input-email
		// label[for='input-password']+input+a -- direct immediate following sibling
		// label[for='input-password']~a -- Indirect not immediate following sibling
		
		//indexing in css: yes
		// select#Form_getForm_Country > option:first-child
		// select#Form_getForm_Country > option:last-child
		// select#Form_getForm_Country > option:nth-child(6) -- starts from top
		// select#Form_getForm_Country > option:nth-last-child(2) -- starts from bottom
		// select#Form_getForm_Country > option:nth-child(odd)
		// select#Form_getForm_Country > option:nth-child(even)
		// select#Form_getForm_Country > option:nth-child(n) -- all elements from top
		// select#Form_getForm_Country > option:nth-child(n+4) -- starts from 4th option
		// select#Form_getForm_Country > option:nth-child(4n) -- multiplication of 4
		
		//odd/even in xpath
		// n%2==0 -- even else odd	
		// (//select[@id='Form_getForm_Country']/option)[position() mod 2=1] -- odd
		// (//select[@id='Form_getForm_Country']/option)[position() mod 2=0] -- even
		
		// commas in CSS
		// input#username,input#password,button#loginBtn,input#remember
		By loginFields =By.cssSelector("input#username,input#password,button#loginBtn,input#remember");
		int loginFieldsCount = driver.findElements(loginFields).size();
		if(loginFieldsCount==4) {
			System.out.println("imp elements are avaiable on the login page");
		}
		
		// union operator in xpath
		//footer//a | //footer//h5
		//footer//a | //footer//h5 | //footer//p
		
		//h5[text()='Information']/following-sibling::ul//a
		
		//not in css: 
		// input.form-control:not(input[name='search'])
		// input.form-control:not(input[name='search']):not(input#input-firstname)
		
		//1. with class name only one class name is allowed
		//invalid
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("Sri");
		//InvalidSelectorException: Compound class names not permitted
		//we should only use one class name with className
		
		
		//valid
		//driver.findElement(By.className("login-email")).sendKeys("Sri");
		
		//valid in xpath
		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("sai");
		
		//valid
		//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("sai");
		
		
		//performance
		
		//1000 ----xpath --> xpath engine in browser
		//1000 ----css
		
		

		//                  xpath vs   css
		
		//1. syntax: 		medium      easy
		//2. performance 	slow	    fast
		//3. Backward		yes			no
		//4. sibling		yes			yes -- only following sibling
		//5. text			yes			no
		//6. ancestror		yes			no
		//7. index			yes			yes -- better
		//8. startswith		yes			yes
		//9. contains   	yes			yes
		//10. endswith		no			yes
		//11. comma/union	yes			yes
		//12. and			yes			yes
		//13. or			yes			no
		//14. not			yes			yes
		//15. SVG			yes			no
		//16. ShadowDOM		no			yes
		
		
		
		
		

	}

}
