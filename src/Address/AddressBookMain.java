package Address;
import java.util.*;

public class AddressBookMain {
	public String FIRST_NAME, LAST_NAME, EMAIL;
	public String ADDRESS, CITY, STATE;
	public int ZIP;
	public String PHONE_NUMBER;

	public AddressBookMain() {

	}

	public AddressBookMain(String FirstName, String LastName, String Email, String Address, String city, String state,
			int zip, String phoneNo) {
		FIRST_NAME = FirstName;
		LAST_NAME = LastName;
		EMAIL = Email;
		ADDRESS = Address;
		CITY = city;
		STATE = state;
		ZIP = zip;
		PHONE_NUMBER = phoneNo;
	}
	public String toString() {
		return FIRST_NAME+" "+LAST_NAME+" "+EMAIL+" "+ADDRESS+" "+CITY+" "+STATE+" "+ZIP+" "+PHONE_NUMBER;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		Scanner sc = new Scanner(System.in);
		ArrayList<AddressBookMain> contact = new ArrayList<AddressBookMain>();
		AddressBookMain contact1 = new AddressBookMain("Kirti", "Kumar", "krtkumar08@gmail.com",
				"Sikar Rajasthan", "Sikar", "Rajasthan", 332315, "8837898455");
		AddressBookMain contact2 = new AddressBookMain("Deepak", "Fenin", "Fenin07@gmail.com", "Jaipur Rajasthan",
				"Jaipur", "Rajasthan", 332329, "8198028341");
		contact.add(contact1);
		contact.add(contact2);
		System.out.println("The contact details of 1st person is: " + contact1);
		System.out.println("The contact details of 2nd person is: " + contact2);
		System.out.println("Enter the first name of the candidate to delete the details: ");
		String name = sc.nextLine();
		int found = 0;
		for(int i=0;i<contact.size();i++) {
			if(contact.get(i).FIRST_NAME.equals(name)) {
				found=1;
				contact.remove(i);
				System.out.println("Successfully deleted");
			}
		}
		sc.close();
		if (found == 0) {
			System.out.println("Cannot found the user");
		} else {
			System.out.println("The contacts in address book are:");
			for(int i=0;i<contact.size();i++) {
				System.out.println("The contact details of "+contact.get(i).FIRST_NAME+" are: "+contact.get(i));
			}
		}
	}
}
