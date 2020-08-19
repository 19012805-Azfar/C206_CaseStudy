import java.util.ArrayList;

public class UserDB {
	private static ArrayList<User> userList = new ArrayList<>();
	
	public static void showMenu() {
		userList.add(new User("jon",123456,"jon@rp.edu.sg","jon1234","Admin"));
		int option = 0;
		while (option != 4) {
			Helper.line(30, "=");
			System.out.println("Manage Users");
			Helper.line(30, "=");
			System.out.println("1. Add student");
			System.out.println("2. Show all students");
			System.out.println("3. Delete student");
			System.out.println("4. Exit");
			
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

		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getId() == id) {
				add = false;
				break;
			}
		}

		if (add == false) {
			System.out.println("Error! A student with that ID already exists!");
		}
		else {
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

}
