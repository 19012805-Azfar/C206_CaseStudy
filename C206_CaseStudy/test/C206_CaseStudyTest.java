import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private static ArrayList<User> userList;
	private User user1;

	@Before
	public void setUp() throws Exception {
		user1 = new User("jon", 123456, "jon@rp.edu.sg","jon1234");
		userList = new ArrayList<>();
	}
	
	@Test
	public void showUser() {
		assertNotNull("Test if there is valid user arraylist to display users", userList);
		userList.add(user1);
		assertEquals(1, userList.size());
		String output = String.format("%-20s %-20s %-20s %-20s\n", "jon","123456","jon@rp.edu.sg","User");
		
		assertEquals("Test that user can be displayed from list",output,userList.get(0).toString());
	}
	@Test
	public void addUserTest() {

		assertNotNull("Check if there is valid user arraylist to add to", userList);
		userList.add(user1);
		assertEquals("Check that user arraylist size is 1", 1, userList.size());
		assertSame("Check that user is added", user1, userList.get(0));
	}
	
	@Test
	public void delUserTest() {
		userList.add(user1);
		assertEquals("Check that user arraylist size is 1", 1, userList.size());
		assertNotNull("Check if there is valid user arraylist to delete from",userList);
		userList.remove(0);
		assertEquals("Test that no students are in the list",0, userList.size());
	}

	@After
	public void tearDown() throws Exception {
		user1 = null;
		userList = null;
		
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

}
