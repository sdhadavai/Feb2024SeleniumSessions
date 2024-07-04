package testngsessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	@Test(invocationCount = 3)
	public void addUserTest() {
		System.out.println("Adding user test");;
	}

}
