
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;
		while (option != 4) {
			Helper.line(30, "=");
			System.out.println("Choose one");
			Helper.line(30, "=");
			System.out.println("1. Users");
			System.out.println("2. Item");
			System.out.println("3. Item");
			System.out.println("4. Exit");
			
			option = Helper.readInt("Select option > ");
			
			if (option == 1) {
				UserDB.showMenu();
			}
			else if (option == 2) {
				ItemDB.showMenu();
			}
			else {
				System.out.println("End");
				break;
			}
	
		
		
	}

}

}