
public class User {
	private String name;
	private int id;
	private String password;
	public User(String name, int id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	
	public String toString() {
		String output = String.format("%-20s %-20s\n", name, id);
		return output;
	}
	
}
