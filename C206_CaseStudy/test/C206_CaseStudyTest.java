import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private static ArrayList<User> userList = new ArrayList<>();
	private static ArrayList<Item> itemList = new ArrayList<>();
	private Item item1;
	private User user1;

	@Before
	public void setUp() throws Exception {
		user1 = new User("jon", 123456, "jon@rp.edu.sg","jon1234");
		item1 = new Item(1, "Toothbrush","Used to brush teeth", 5, "19-8-2020", "30-8-2020", 1);
	}

	public void showUser() {
		assertNotNull("Test if there is valid user arraylist to retrieve item from", userList);

		assertEquals("Test that the retrieved user is empty?", "", userList);

	}

	public void addUserTest() {

		assertNotNull("Check if there is valid user arraylist to add to", userList);
		UserDB.addUser();

		assertEquals("Check that user arraylist size is 1", 1, userList.size());
		assertSame("Check that user is added", user1, userList.get(0));
	}

	public void delUserTest() {
		assertNotNull("Check if there is valid user arraylist to delete from",userList);
		assertEquals("Check that user arraylist size is 1", 1, userList.size());
		UserDB.delUser();
		assertNull("Check if user arraylist is empty", userList);
	}
	
	public void showItems() {
		assertNotNull("Test if there is valid item arraylist to retrieve item from", itemList);
		assertEquals("Test that the retrieved item is empty?", "", itemList );
	}
	public void addItemTest() {
		assertNotNull("Check if there is valid item arraylist to add to", itemList);
		ItemDB.addItem();
		
		assertEquals("Check that item arraylist size is 1", 1, itemList.size());
		assertSame("Check that item is added", item1, itemList.get(0));
	}
	public void delItemTest() {
		assertNotNull("Check if there is valid item arraylist to delete from", itemList);
		assertEquals("Check that item arraylist size is 1", 1, itemList.size());
		ItemDB.delItem();
		assertNull("Check if item arraylist is empty", itemList);
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
