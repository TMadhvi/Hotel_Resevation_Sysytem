package hotel.View;

import java.time.LocalDate;
import java.util.Scanner;

public class CustomerView {

	private Scanner sc = new Scanner (System.in);

	public int showMenu() {
		System.out.println("Enter 1 for add Customer");
		System.out.println("Enter 2 for update Customer");
		System.out.println("Enter 3 for delete Customer");
		System.out.println("Enter 4 for read all");
		System.out.println("Enter 5 for Exit.....");
		return sc.nextInt();
		
	}
	public int getCustomerId() {
		System.out.println("Enter Customer Id : ");
		return sc.nextInt();
	}
	public String getCustomerFirstName() {
		sc.nextLine();
		System.out.println("Enter Customer First Name : ");
		return sc.nextLine();
	}
	public String getCustomerLastName() {
		System.out.println("Enter Customer Last Name : ");
		return sc.nextLine();
	}
	public String getCustomerGender() {
		System.out.println("Enter Customer Gender : ");
		
		return sc.nextLine();
	}
	
	
	public String getCustomerPhone() {
		sc.nextLine();
		System.out.println("Enter Customer Phone : ");
		return sc.nextLine();
		
	}
	public String getCustomerEmail() {
		sc.nextLine();
		System.out.println("Enter Customer Email : ");
		return sc.nextLine();
	}
	public String getCustomerIdProofType() {
		sc.nextLine();
		System.out.println("Enter Customer IdProofType : ");
		return sc.nextLine();
	}
	public String getCustomerIdProofNumber() {
		sc.nextLine();
		System.out.println("Enter Customer IdProofNumber : ");
		return sc.nextLine();
	}
	public String getCustomerAddress() {
		System.out.println("Enter Customer Address : ");
		return sc.nextLine();
	}
	
	
	
}
