import java.util.ArrayList;	

public class BidDB {
	private static ArrayList<Bid> bidList = new ArrayList<Bid>();



	public static void showMenu() {
		
		bidList.add(new Bid(001, "textbook","seller@hotmail.sg","buyer@gamil.com", 5.55));
		
		int option = 0;
		
		while(option != 4) {
			
			Helper.line(30,"=");
			System.out.println("Bids");
			Helper.line(30,"=");
			System.out.println("1. Add bids");
			System.out.println("2. Show all bids");
			System.out.println("3. Delete bids" );
			System.out.println("4. Update bids");
			System.out.println("5. Search bids");
			System.out.println("6. Exit");
			
			
			option = Helper.readInt("Choose an option > ");
			
			if(option == 1) {
				addBid();
			}else if(option == 2) {
				showAllBid();
			}else if (option == 3) {
				deleteBid();
			}else if (option == 4 ) {
				updateBid();
			}else if (option == 5){
				searchBid();
			}else if (option == 6) {
				System.out.println("Thank you for using");
			}else {
				System.out.println("Option not found!");
			}
			
			
			
		}
		
	}
	
	
	public static void addBid() {
		
		int ID = Helper.readInt("Enter bid ID > ");
		String name = Helper.readString("Enter item name > ");
		String sMail = Helper.readString("Enter seller email > ");
		String bMail = Helper.readString("Enter buyer email > ");
		double price = Helper.readDouble("Enter price of bid> ");
		
		boolean add = false;
		
		for(int i = 0; i < bidList.size(); i++) {
			if(bidList != null) {
				bidList.add(new Bid(ID, name, sMail, bMail, price));
				System.out.println("Bid added");
				add = true;
				break;
				
			}else {
				add = false;
			}
			while (add = false) {
				System.out.println("Error! Bid not added");
			}
		
		}
		
	}
	
	public static void showAllBid() {
		
		System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s \n", "bid id", "name", "seller email", "buyer email", "price($)"));
		
		String output = " ";
		
		for(int i = 0; i < bidList.size(); i++) {
			output += String .format("%-20s %-20s %-20s %-20s %.2f \n", bidList.get(i).getBidID(), bidList.get(i).getItemName(), bidList.get(i).getsEmail(),
					bidList.get(i).getbEmail(), bidList.get(i).getBidPrice());
		}
		System.out.println(output);
		
		
		
		
	}
	
	public static void deleteBid() {
		showAllBid();
		boolean del = false;
		
		int ID = Helper.readInt("Enter bid ID you wish to delete > ");
		
		for(int i = 0; i < bidList.size(); i++) {
			if(bidList.get(i).getBidID() == ID) {
				del = true;
				bidList.remove(i);
				System.out.println("Item removed");
				
				showAllBid();
				break;
			}
			
		}
		
		if(del = false) {
			System.out.println("ERROR! ID not found!");
		}
		
	}
	
	
	public static void updateBid() {
		int id = Helper.readInt("Enter bid ID > ");
		boolean update = false;
		
		for (Bid b : bidList) {
			if(b.getBidID()== id) {
				Helper.line(50, "-");
				int newID = Helper.readInt("Enter new ID > ");
				String newItem = Helper.readString("Enter new item > ");
				String newSmail = Helper.readString("Enter new seller email > ");
				String newBmail = Helper.readString("Enter new buyer email > ");
				double newPrice = Helper.readDouble("Enter new price > ");
				
				b.setBidID(newID);
				b.setItemName(newItem);
				b.setsEmail(newSmail);
				b.setbEmail(newBmail);
				b.setBidPrice(newPrice);
				System.out.println("Update successful");
				showAllBid();
				update = true;
				break;
				
			}
			
		}
		
		if(update == false) {
			System.out.println("Error! No such bid ID found!");
		}
	}
	
	
	
	public static void searchBid() {
		
		int S = Helper.readInt("Enter ID you wish to find > ");
		
		System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s \n", "bid id", "name", "seller email", "buyer email", "price($)"));
		String output = " ";
		for(Bid b : bidList) {
			if(b.getBidID() == S) {
				System.out.println(String.format("%-20d %-20s %-20s %-20s %.2f \n", b.getBidID(),b.getItemName(),b.getsEmail(),b.getbEmail(),b.getBidPrice() ));
			}
		}
		
	}

}
