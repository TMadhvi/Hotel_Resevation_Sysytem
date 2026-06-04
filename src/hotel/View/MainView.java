package hotel.View;

import java.util.Scanner;

public class MainView {
	

	private Scanner sc = new Scanner (System.in);

	public int showMenu() {
		System.out.println("Enter 1 for Room");
		System.out.println("Enter 2 for  Customer");
		System.out.println("Enter 3 for Booking");
		System.out.println("Enter 4 for Payment");
		System.out.println("Enter 5 for Booking History");
		System.out.println("Enter 6 for Available Rooms");
		System.out.println("Enter 7 for Exit....");

		return sc.nextInt();
		
	}
 


}
