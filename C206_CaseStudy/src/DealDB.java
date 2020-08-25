import java.util.ArrayList;
//Created by Azfar
public class DealDB {
private static ArrayList<Deal> dealList = new ArrayList<>();
	
	public static void showMenu() {
		dealList.add(new Deal("1234A","AirPods","jack12@gmail.com","bobby34@gmail.com",300.00,"27-08-2020"));
		dealList.add(new Deal("1678C","France Home Kit","john75@gmail.com","mike345@gmail.com",75.00,"23-10-2020"));
		dealList.add(new Deal("1456F","Fujifilm Instax Mini Camera","kelly88@gmail.com","peter02@gmail.com",50.00,"15-11-2020"));
		dealList.add(new Deal("1789Z","Mini Projector","dame00@gmail.com","kobe24@gmail.com",85.00,"7-12-2020"));
		
		int option = 0;
		while (option != 4) {
			Helper.line(30, "=");
			System.out.println("Manage Deals");
			Helper.line(30, "=");
			System.out.println("1. Add Deals");
			System.out.println("2. Show all Deals");
			System.out.println("3. Delete Deals");
			System.out.println("4. Update Deals ");
			System.out.println("5. Search Deals");
			System.out.println("6. Exit from Deals");
			
			option = Helper.readInt("Select option > ");
			
			if(option==1) {
				addDeals();
			}
			else if (option == 2) {
				showDeals();
			}
			else if (option == 3) {
				delDeals();
			}
			else if (option == 4) {
				updateDeals();
			}
			else if (option == 5) {
				searchDeals();
			}
			else if (option == 6) {
				System.out.println("Thank you for using Manage Deals program");
			} else {
				System.out.println("Error, please select another option");
			}
		}

	}





public static void addDeals() {
	String dealID = Helper.readString("Enter new Deal ID > ");
	String itemName = Helper.readString("Enter new item name > ");
	String sellerEmail = Helper.readString("Enter seller email > ");
	String buyerEmail = Helper.readString("Enter buyer email > ");
	double transPrice = Helper.readDouble("Enter transaction price > $ ");
	String closeDate = Helper.readString("Enter close date (in dd-mm-yyyy format) > ");

	boolean add = true;

	for (int i = 0; i < dealList.size(); i++) {
		if (dealList.get(i).getDealID() == dealID) {
			add = false;
			break;
		}
	}

	if (add == false) {
		System.out.println("Error! A deal with that ID already exists!");
	}
	else {
		dealList.add(new Deal( dealID, itemName, sellerEmail,  buyerEmail,  transPrice, closeDate));
		System.out.println("deal successfully added!");
	}

}

public static void showDeals() {
	System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Deal ID", "Item name", "seller email", "buyer email", "transaction price", "close date"));
	for (int i = 0; i < dealList.size(); i++) {
		System.out.println(dealList.get(i).toString());
	}
}

public static void delDeals() {
	showDeals();
	boolean delete = false;
	String dealID = Helper.readString("Enter Deal ID > ");
	for (int i = 0; i < dealList.size(); i++) {
		if (dealList.get(i).getDealID() == dealID) {
			dealList.remove(i);
			System.out.println("deal successfully deleted!\n");
			delete = true;
			System.out.println("Updated deal List\n");
			showDeals();
			break;
		}
	}

	if (delete == false) {
		System.out.println("Error! deal not in found!");
	}
}

public static void updateDeals() {
	String dealID = Helper.readString("Enter Deal ID > ");

	boolean found = false;

	for (Deal d : dealList) {
		if (d.getDealID().equals(dealID)) {
			Helper.line(30, "-");
			double newTransPrice = Helper.readDouble("Enter new transaction price > $ ");
			String newCloseDate = Helper.readString("Enter new close date (in dd-mm-yyyy format) > ");
			Helper.line(30, "-");
			d.setTransPrice(newTransPrice);
			d.setCloseDate(newCloseDate);
			System.out.println("Deal price and Close date updated successfully!");
			found = true;
			break;
		}
	}
	if (found == false)
		System.out.println("Error! deal ID is wrong!");
}



private static void searchDeals() { 
	String dealID = Helper.readString("Enter Deal ID > ");
	String sellerEmail = Helper.readString("Enter seller email > ");
	String buyerEmail = Helper.readString("Enter buyer email > ");
	System.out.println(String.format("%-20s %-20s %-20s %-20s\n", "Student Name", "Student ID", "Student Email", "Role"));
	for (Deal d : dealList) {
		if (d.getDealID().contains(dealID) || d.getBuyerEmail().contains(buyerEmail) || d.getSellerEmail().contains(sellerEmail)) {
			System.out.println(d.toString());
		}
	}
}

}




