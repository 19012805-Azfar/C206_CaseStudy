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
	private static ArrayList<Deal> dealList;
	private Deal deal1;
	private double transPrice;
	

	@Before
	public void setUp() throws Exception {
		user1 = new User("jon", 123456, "jon@rp.edu.sg","jon1234");
		userList = new ArrayList<>();
		item1 = new Item(1, "Toothbrush", "For brushing teeth", 5, "19-8-2020", "30-8-2020", 1);
		itemList = new ArrayList<>();
		deal1 = new Deal("1234A","AirPods","jack12@gmail.com","bobby34@gmail.com",300.00,"27-8-2020");
		dealList = new ArrayList<>();
	}
	
	@Test
	public void showUser() {
		assertNotNull("Test if there is valid user arraylist to display users", userList);
		userList.add(user1);
		assertEquals(1, userList.size());
		String output = String.format("%-20s %-20d %-20s %-20s\n", "jon",123456,"jon@rp.edu.sg","User");
		
		assertEquals("Test output is equal to toString()",output,userList.get(0).toString());
	}
	@Test
	public void showItem() {
		assertNotNull("Test if there is valid item arraylist to display items", itemList);
		itemList.add(item1);
		assertEquals(1,itemList.size());
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "1","Toothbrush","For brushing teeth","5", "19-8-2020", "30-8-2020", "1", "Item");
		
		}
	@Test
	public void showDeals() {
		assertNotNull("Test if there is valid user arraylist to display deals", dealList);
		dealList.add(deal1);
		assertEquals(1, dealList.size());
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s\n", "1234A","AirPods","jack12@gmail.com","bobby34@gmail.com",300.00,"27-8-2020");
		
		assertEquals("",output,dealList.get(0).toString());
	
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
	public void addDealTest() {

		assertNotNull("Check if there is valid deal arraylist to add to", dealList);
		dealList.add(deal1);
		assertEquals("Check that deal arraylist size is 1", 1, dealList.size());
		assertSame("Check that deal is added", deal1, dealList.get(0));
	
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
	@Test
	public void delDealTest() {
		dealList.add(deal1);
		assertEquals("Check that deal arraylist size is 1", 1, dealList.size());
		assertNotNull("Check if there is valid deal arraylist to delete from",dealList);
		dealList.remove(0);
		assertEquals("Test that no deals are in the list",0, dealList.size());
	}
	
	@Test
	public void updateUser() {
		assertNotNull(userList);
		userList.add(user1);
		userList.get(0).setName("name");
		userList.get(0).setPassword("password");
		assertEquals("Test name was updated successfully","name",userList.get(0).getName());
		assertEquals("Test password was updated successfully","password",userList.get(0).getPassword());
	}
	
	@Test
	public void searchUser() {
		userList.add(user1);
		String email = "jon";
		assertTrue("Test email in list contains variable email", userList.get(0).getEmail().contains(email));
		String output = String.format("%-20s %-20d %-20s %-20s\n", "jon", 123456, "jon@rp.edu.sg","User");
		assertEquals("Test output is same as toString", output, userList.get(0).toString());
	}
	
	@Test
	public void updateDeals() {
		assertNotNull(dealList);
		dealList.add(deal1);
		dealList.get(0).setTransPrice(transPrice);
		dealList.get(0).setCloseDate("dd-mm-yyyy");
		assertEquals("Test transPrice was updated successfully","transPrice",dealList.get(0).getTransPrice());
		assertEquals("Test closeDate was updated successfully","dd-mm-yyyy",dealList.get(0).getCloseDate());
	}
	
	@Test
	public void searchDeals() {
		dealList.add(deal1);
		String dealID = "123AB";
		String sellerEmail = "Mike";
		String buyerEmail = "Tyson";
		assertTrue("Test dealID in list contains variable dealID", dealList.get(0).getDealID().contains(dealID));
		assertTrue("Test sellerEmail in list contains variable email", dealList.get(0).getSellerEmail().contains(sellerEmail));
		assertTrue("Test BuyerEmail in list contains variable email", dealList.get(0).getBuyerEmail().contains(buyerEmail));
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s\n", "1234A","AirPods","jack12@gmail.com","bobby34@gmail.com",300.00,"27-8-2020");
		assertEquals("Test output is same as toString", output, dealList.get(0).toString());
	}
	
	@After
	public void tearDown() throws Exception {
		user1 = null;
		userList = null;
		item1 = null;
		itemList = null;
		deal1 = null;
		dealList = null;
		
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

}
