import java.util.ArrayList;

public class UserDB {
	private static ArrayList<User> userList = new ArrayList<>();
	
	public static void showMenu() {
		userList.add(new User("jon",123456,"jon@rp.edu.sg","jon1234","Admin"));
		userList.add(new User("bob",223446,"bob@rp.edu.sg","bob1234"));
		userList.add(new User("bonny",133756,"bonny@rp.edu.sg","bonny1234"));
		userList.add(new User("jordan",433526,"jordan@rp.edu.sg","jordan1234","Admin"));
		int option = 0;
		while (option != 6) {
			Helper.line(30, "=");
			System.out.println("Manage Users");
			Helper.line(30, "=");
			System.out.println("1. Add student");
			System.out.println("2. Show all students");
			System.out.println("3. Delete student");
			System.out.println("4. Update student");
			System.out.println("5. Search student");
			System.out.println("6. Exit");
			
			option = Helper.readInt("Select option > ");
			
			if(option==1) {
				addUser();
			}
			else if (option == 2) {
				showUsers();
			}
			else if (option == 3) {
				delUser();
			}
			else if (option == 4) {
				updateUser();
			}
			else if (option == 5) {
				searchUser();
			}
			else if (option == 6) {
				System.out.println("Exit success");
			}
			else {
				System.out.println("Error, please select another option");
			}
		}

	}



	public static void addUser() {
		String name = Helper.readString("Enter student name: ");
		int id = Helper.readInt("Enter student id: ");
		String email = Helper.readString("Enter student email: ");
		String password = Helper.readString("Enter password: ");

		boolean add = true;

		for (User u : userList) {
			if (u.getId() == id) {
				add = false;
				System.out.println("Error! A student with that ID already exists!");
				break;
			}
		}

		if (add == true) {
			userList.add(new User(name, id, email,password));
			System.out.println("User successfully added!");
		}
	}
	
	public static void showUsers() {
		System.out.println(String.format("%-20s %-20s %-20s %-20s\n", "Student Name", "Student ID","Student Email","Role"));
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i).toString());
		}
	}

	public static void delUser() {
		showUsers();
		boolean delete = false;
		int id = Helper.readInt("Enter student id: ");
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getId() == id) {
				userList.remove(i);
				System.out.println("Student successfully deleted!\n");
				delete = true;
				System.out.println("Updated Student List\n");
				showUsers();
				break;
			}
		}

		if (delete == false) {
			System.out.println("Error! Student not in found!");
		}
	}
	

	private static void updateUser() {
		
		String name = Helper.readString("Enter student name: ");
		String password = Helper.readString("Enter password: ");
		
		boolean found = false;
		
		for (User u : userList) {
			if (u.getName().equalsIgnoreCase(name) && u.getPassword().equals(password)) {
				String newName = Helper.readString("Enter new student name: ");
				String newPassword = Helper.readString("Enter new password: ");
				u.setName(newName);
				u.setPassword(newPassword);
				System.out.println("Name and Password updated successfully!");
				found = true;
				break;
			}
		}
			if(found == false)
				System.out.println("Error! Username or password is wrong or account does not exist");

	}
	
	private static void searchUser() {
		String search = Helper.readString("Enter user email: ");
		System.out.println(String.format("%-20s %-20s %-20s %-20s\n", "Student Name", "Student ID","Student Email","Role"));
		for (User u : userList) {
			if (u.getEmail().contains(search)) {
				System.out.println(u.toString());
			}
		}
	}
	
}
