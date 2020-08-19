import static org.junit.Assert.*;

import java.util.ArrayList;
public class C206_CaseStudy_test {
	private static ArrayList<User> userList = new ArrayList<>();
	private User user1;
	
	public void setUp() throws Exception {
		user1  = new User("jon",123456,"jon1234");
	}
	
	public void showUser() {
		assertNotNull("Test if there is valid user arraylist to retrieve item from", userList);
		
		assertEquals("Test that the retrieved user is empty?","",userList);
		
	}
	
	public void addUserTest() {

	assertNotNull("Check if there is valid user arraylist to add to", userList);
	UserDB.addUser();
	
	assertEquals("Check that user arraylist size is 1", 1, userList.size());
	assertSame("Check that user is added", user1, userList.get(0));
	}
	
	public void delUserTest() {
		assertNull("Check if user arraylist is empty",userList = null);
	}
	public void tearDown() throws Exception {
		user1 = null;
		userList = null;
	}
}
