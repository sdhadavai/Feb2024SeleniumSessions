package testngsessions;

import org.testng.annotations.Test;

public class CRUDTest {
	
	public int addUser() {
		return 123;
	}
	
	public String getUser(int uid) {
		return "User Info for" + uid;
	}
	
	public String updateUser(int uid) {
		return "update user Info for" + uid;
	}
	
	public void deleteUser(int uid) {
		System.out.println("User is deleted");
	}
	
	@Test
	public void addUserTest() {
		int uid = addUser();
	}
	
	@Test
	public void getUserTest() {
		int uid = addUser();
		String userInfo = getUser(uid);
		System.out.println(userInfo);
	}
	
	@Test
	public void updateUserTest() {
		int uid = addUser();
		updateUser(uid);
		getUser(uid);
		
	}
	
	@Test
	public void deleteUserTest() {
		int uid = addUser();
		deleteUser(uid);
		getUser(uid);
	}

}
