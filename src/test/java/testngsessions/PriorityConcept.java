package testngsessions;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	@Test(priority = 1, description ="search test")
	public void searchTest() {
		System.out.println("search test");
	}

	// 5
	@Test(priority = 5)
	public void addToCartTest() {
		System.out.println("add to cart test");
	}

	// 8
	@Test(priority = 2)
	public void checkOutTest() {
		System.out.println("checkout test");
	}
	
	@Test(priority = 4)
	public void paymentTest() {
		System.out.println("payment test");
	}
	
	@Test(priority = 3)
	public void orderTest() {
		System.out.println("order test");
	}


}
