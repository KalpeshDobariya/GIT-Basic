package Hello;

public class OrderDetails {
	String Name;
	String Address;
	String MobileNumber;
	String PaymentInfo;
	String Items;
	 
	public static void main(String args[]) {
	
		OrderDetails User1 = new OrderDetails();
		User1.Name = "Kalpesh Dobariya";
		User1.MobileNumber = "9375922000";
		User1.Address = "Motavarachha";
		User1.Items = "Vadapav";
		System.out.println ("User Name is : " + User1.Name);
		System.out.println ("User Address is : " + User1.Address);
		
		OrderDetails User2 = new OrderDetails();
		User2.Name = "Kirti Navadiya";
		User2.Address = "Opera House";
		User2.MobileNumber = "7567198362";
		User2.Items = "Dabeli";
		System.out.println ("User Name is : " + User2.Name);
		System.out.println ("User Address is : " + User2.Address);
		
	}

}
