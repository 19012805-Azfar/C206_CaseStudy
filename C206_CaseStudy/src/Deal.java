
//Created by Azfar
public class Deal {
	private String dealID;
	private String itemName;
	private String sellerEmail;
	private String buyerEmail;
	private double transPrice;
	private String closeDate;
	public Deal(String dealID, String itemName, String sellerEmail, String buyerEmail, double transPrice, String closeDate) {
		this.dealID = dealID;
		this.itemName = itemName;
		this.sellerEmail = sellerEmail;
		this.buyerEmail = buyerEmail;
		this.transPrice = transPrice;
		this.closeDate = closeDate;
	}
	
	public String getDealID() {
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
	
	public void setTransPrice(double transPrice) {
		this.transPrice = transPrice;
	}
	public void setDealID(String dealID) {
		this.dealID = dealID;
	}
	
	public String getCloseDate() {
		return closeDate;
	}
	
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
	
	public String toString() {
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s\n", dealID, itemName, sellerEmail,  buyerEmail,  transPrice, closeDate);
		return output;
	}

}
