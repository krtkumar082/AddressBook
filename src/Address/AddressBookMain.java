package Address;

public class AddressBookMain {
	public static String FIRST_NAME, LAST_NAME, EMAIL;
	public static String ADDRESS, CITY, STATE;
	public static long ZIP;
	public static String PHONE_NUMBER;

	public AddressBookMain(String FirstName, String LastName, String Email, String Address, String city, String state,
			long zip, String phoneNo) {
		FIRST_NAME = FirstName;
		LAST_NAME = LastName;
		EMAIL = Email;
		ADDRESS = Address;
		CITY = city;
		STATE = state;
		ZIP = zip;
		PHONE_NUMBER = phoneNo;
	}

	@Override
	public String toString() {
		return FIRST_NAME + " " + LAST_NAME + " " + EMAIL + " " + ADDRESS + " " + CITY + " " + STATE + " " + ZIP + " "
				+ PHONE_NUMBER;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		AddressBookMain contact = new AddressBookMain("Kirti", "Kumar", "krtkumar08@gmail.com",
				"Sikar Rajasthan", "Sikar", "Rajasthan", 332315, "8837898455");
		System.out.println(contact);
	}
}
