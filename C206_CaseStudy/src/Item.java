public class Item {
	
	private int id;
	private String name;
	private String description;
	private int minimum_bid_price;
	private String start;
	private String end;
	private int bid_increment;
	public Item(int id, String name, String description, int minimum_bid_price, String start, String end, int bid_increment) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.minimum_bid_price = minimum_bid_price;
		this.start = start;
		this.end = end;
		this.bid_increment = bid_increment;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getMinimum_bid_price() {
		return minimum_bid_price;
	}
	public void setMinimum_bid_price(int minimum_bid_price) {
		this.minimum_bid_price = minimum_bid_price;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public int getBid_increment() {
		return bid_increment;
	}
	public String toString() {
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", id, name, description, minimum_bid_price, start, end, bid_increment);
		return output;
	}
	
}
