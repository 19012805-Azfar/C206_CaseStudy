
public class User {
	private String name;
	private int id;
	private String email;
	private String password;
	

	public User(String name, int id, String email, String password) {
		this.name = name;
		this.id = id;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public String toString() {
		String output = String.format("%-20s %-20s %-20s\n", name, id,email);
		return output;
	}
	
}
