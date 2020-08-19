import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private static ArrayList<User> userList;
	private User user1;
	private Item item1;
	private static ArrayList<Item> itemList;

	@Before
	public void setUp() throws Exception {
		user1 = new User("jon", 123456, "jon@rp.edu.sg","jon1234");
		userList = new ArrayList<>();
		item1 = new Item(1, "Toothbrush", "It is for brushing teeth", 5, "19-8-2020", "30-8-2020", 1);
		itemList = new ArrayList<>();
	}
	
	@Test
	public void showUser() {
		assertNotNull("Test if there is valid user arraylist to display users", userList);
		userList.add(user1);
		assertEquals(1, userList.size());
		String output = String.format("%-20s %-20s %-20s %-20s\n", "jon","123456","jon@rp.edu.sg","User");
		
		assertEquals("",output,userList.get(0).toString());
	}
	@Test
	public void showItem() {
		assertNotNull("Test if there is valid item arraylist to display items", itemList);
		itemList.add(item1);
		assertEquals(1,itemList.size());
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "1","Toothbrush","For brushing teeth","5", "19-8-2020", "30-8-2020", "1", "Item");
	}
	@Test
	public void addUserTest() {

		assertNotNull("Check if there is valid user arraylist to add to", userList);
		userList.add(user1);
		assertEquals("Check that user arraylist size is 1", 1, userList.size());
		assertSame("Check that user is added", user1, userList.get(0));
	}
	@Test
	public void addItemTest() {
		assertNotNull("Check if there is valid item arraylist to add to", itemList);
		itemList.add(item1);
		assertEquals("Check that user arraylist size is 1", 1, itemList.size());
		assertSame("Check that item is added", item1, itemList.get(0));
	}
	
	@Test
	public void delUserTest() {
		userList.add(user1);
		assertEquals("Check that user arraylist size is 1", 1, userList.size());
		assertNotNull("Check if there is valid user arraylist to delete from",userList);
		userList.remove(0);
		assertEquals("Test that no students are in the list",0, userList.size());
	}
	@Test
	public void delItemTest() {
		itemList.add(item1);
		assertEquals("Check that item arraylist size is 1", 1, itemList.size());
		assertNotNull("Check if there is valid item arraylist to delete from",itemList);
		itemList.remove(0);
		assertEquals("Test that no items are in the list",0, itemList.size());
	}

	@After
	public void tearDown() throws Exception {
		user1 = null;
		userList = null;
		item1 = null;
		itemList = null;
		
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

}
