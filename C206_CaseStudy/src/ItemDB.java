import java.util.ArrayList;

public class ItemDB {
private static ArrayList<Item> itemList = new ArrayList<>();
	
	public static void showMenu() {
		itemList.add(new Item(1, "Toothbrush","Used to brush teeth", 5, "19-8-2020", "30-8-2020", 1));
		
		int option = 0;
		while (option != 4) {
			Helper.line(30, "=");
			System.out.println("Manage Users");
			Helper.line(30, "=");
			System.out.println("1. Add Item");
			System.out.println("2. Show all Item");
			System.out.println("3. Delete Item");
			System.out.println("4. Exit");
			
			option = Helper.readInt("Select option > ");
			
			if(option==1) {
				addItem();
			}
			else if (option == 2) {
				showItems();
			}
			else if (option == 3) {
				delItem();
			}
			else if (option == 4) {
				System.out.println("Exit success");
			}
			else {
				System.out.println("Error! please select another option!");
			}
		}

	}

	public static void addItem() {
		int id = 1;
		String name = Helper.readString("Enter Item name: ");
		String des = Helper.readString("Enter Item Description: ");
		int min = Helper.readInt("Enter minimum cost of item : ");
		String start = Helper.readString("Enter start date(dd-mm-yyyy): ");
		String end = Helper.readString("Enter end date(dd-mm-yyyy): ");
		int bidIncrement = Helper.readInt("Enter bid increment: ");
		
		boolean add = false;

		for (int i = 0; i < itemList.size(); i++) {
			id = id + 1;
			if (itemList.get(i).getId() == id) {
				add = false;
				break;
			}
			else {
				add = true;
			}
			
		}

		if (add == false) {
			System.out.println("Error! An item with that id already exists!");
		}
		else if(add == true) {
			
			itemList.add(new Item(id, name, des, min, start, end, bidIncrement));
			System.out.println("Item successfully added!");
		}

	}

	public static void showItems() {
		System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "Item ID", "Item Name", "Item Description", "Minimum Cost", "Start Date", "End Date", "Bid Increment"));
		
		for (int i = 0; i < itemList.size(); i++) {
			System.out.println(itemList.get(i).toString());
		}
	}
	public static void delItem() {
		showItems();
		boolean delete = false;
		int ID = Helper.readInt("Enter Item ID: ");
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getId() == ID) {
				delete = true;
				itemList.remove(i);
				System.out.println("Item successfully deleted!");
				
				showItems();
				break;
			}
		}

		if (delete == false) {
			System.out.println("Error! Item not in found!");
		}
	}

}


