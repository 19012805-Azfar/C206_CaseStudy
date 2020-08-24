

public class Bid {
	

	private int bidID;
	private String itemName;
	private String sEmail;
	private String bEmail;
	private double bidPrice;
	
	public Bid(int bidID, String itemName, String sEmail, String bEmail, double bidPrice) {
		
		this.bidID = bidID;
		this.itemName = itemName;
		this.sEmail = sEmail;
		this.bEmail = bEmail;
		this.bidPrice = bidPrice;
	}

	
	public int getBidID() {
		return bidID;
	}

	
	public void setBidID(int bidID) {
		this.bidID = bidID;
	}

	
	public String getItemName() {
		return itemName;
	}

	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	
	public String getsEmail() {
		return sEmail;
	}

	
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	
	public String getbEmail() {
		return bEmail;
	}


	public void setbEmail(String bEmail) {
		this.bEmail = bEmail;
	}

	
	public double getBidPrice() {
		return bidPrice;
	}

	
	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}
	
	
	
	
	
}
