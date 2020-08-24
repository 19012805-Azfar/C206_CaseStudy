
public class User {
	private String name;
	private int id;
	private String email;
	private String password;
	private String role;

	public User(String name, int id, String email, String password) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.password = password;
		role = "User";
	}
	public User(String name, int id, String email, String password,String role) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public String getRole() {
		return role;
	}
	
	public String toString() {
		String output = String.format("%-20s %-20d %-20s %-20s\n", name, id,email,role);
		return output;
	}
	
}
