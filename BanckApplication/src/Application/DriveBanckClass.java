package Application;

/*
 * It is a main class of Bank application 
 * to execute main method 
 */
public class DriveBanckClass {

	// Create BanckAccount object and call showMenu method
	public static void main(String[] args) {

		BanckAccount bankobj = new BanckAccount();
		bankobj.showMenu();
	}
}

