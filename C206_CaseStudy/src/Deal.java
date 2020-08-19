
//Created by Azfar
public class Deal {
	private int dealID;
	private String itemName;
	private String sellerEmail;
	private String buyerEmail;
	private double transPrice;
	private String closeDate;
	public Deal(int dealID, String itemName, String sellerEmail, String buyerEmail, double transPrice, String closeDate) {
		this.dealID = dealID;
		this.itemName = itemName;
		this.sellerEmail = sellerEmail;
		this.buyerEmail = buyerEmail;
		this.transPrice = transPrice;
		this.closeDate = closeDate;
	}
	
	public int getDealID() {
		return dealID;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public String getSellerEmail() {
		return sellerEmail;
	}
	
	public String getBuyerEmail() {
		return buyerEmail;
	}
	
	public double getTransPrice() {
		return transPrice;
	}
	
	public String getCloseDate() {
		return closeDate;
	}
	
	public String toString() {
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s\n", dealID, itemName, sellerEmail,  buyerEmail,  transPrice, closeDate);
		return output;
	}

}
