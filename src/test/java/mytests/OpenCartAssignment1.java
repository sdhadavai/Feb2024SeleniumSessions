package mytests;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenCartAssignment1 extends BaseTest{
	
	
	@Parameters({"email","password"})
	@Test
	public void login(String email, String password) {
		
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	@DataProvider
	
	public Object[][] serchData(){
		return new Object[][] {
			{"macbook", "MacBook Pro", "1"},
			{"macbook", "MacBook Air", "2"},
			{"imac", "iMac", "3"},
			{"samsung", "Samsung SyncMaster 941BW", "5"}
		};
	}
	
	@Test(dataProvider="serchData")
	public void search(String searchItem, String requiedItem, String qty) {
		driver.findElement(By.name("search")).sendKeys(searchItem);
		driver.findElement(By.xpath("//button[@type='button']/i[@class='fa fa-search']")).click();
		driver.findElement(By.linkText(""+requiedItem+"")).click();
		driver.findElement(By.id("input-quantity")).sendKeys(qty);
		driver.findElement(By.name("search")).clear();
		
		
	}

}
