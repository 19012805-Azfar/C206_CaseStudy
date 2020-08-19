import java.util.ArrayList;
//Created by Azfar
public class DealDB {
private static ArrayList<Deal> dealList = new ArrayList<>();
	
	public static void showMenu() {
		dealList.add(new Deal(1234,"AirPods","jack12@gmail.com","bobby34@gmail.com",300.00,"27-8-2020"));
		int option = 0;
		while (option != 4) {
			Helper.line(30, "=");
			System.out.println("Manage Deals");
			Helper.line(30, "=");
			System.out.println("1. Add Deals");
			System.out.println("2. Show all Deals");
			System.out.println("3. Delete Deals");
			System.out.println("4. Exit");
			
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
				System.out.println("Exit success");
			}
			else {
				System.out.println("Error, please select another option");
			}
		}

	}





public static void addDeals() {
	int dealID = Helper.readInt("Enter new Deal ID > ");
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
	int dealID = Helper.readInt("Enter Deal ID > ");
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

}
