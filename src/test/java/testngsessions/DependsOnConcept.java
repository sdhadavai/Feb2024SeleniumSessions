package testngsessions;

import org.testng.annotations.Test;

public class DependsOnConcept {
	
	@Test()
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void addToCartTest() {
		System.out.println("search test");
	}
	
	@Test(dependsOnMethods = "addToCartTest")
	public void orderTest() {
		System.out.println("search test");
	}
	
	//AAA pattern:Arrange, Act, Assert
	
}
