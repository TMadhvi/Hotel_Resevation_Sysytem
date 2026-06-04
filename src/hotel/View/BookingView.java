package hotel.View;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class BookingView {

	private Scanner sc = new Scanner(System.in);

	public int showMenu() {
		System.out.println("Enter 1 for add Booking");
		System.out.println("Enter 2 for update Booking");
		System.out.println("Enter 3 for delete Booking");
		System.out.println("Enter 4 for read all");
		System.out.println("Enter 5 for Exit.....");
		return sc.nextInt();

	}

	public int getBookingid() {
		System.out.println("Enter Booking Id");
		return sc.nextInt();
	}

	public int getCustomerid() {
		sc.nextLine();
		System.out.println("Enter Customer Id");
		return sc.nextInt();
	}

	public int getRoomId() {
		sc.nextLine();
		System.out.println("Enter Room Id");
		return sc.nextInt();
	}

	public LocalDateTime getCheckInDate() {
		System.out.println("Enter In  year : ");
		int year = sc.nextInt();
		System.out.println("Enter Month Number :");
		int month = sc.nextInt();
		System.out.println("Enter    Date :");
		int dt = sc.nextInt();
		System.out.println("Enter In  Hour : ");
		int hour = sc.nextInt();
		System.out.println("Enter min :");
		int min = sc.nextInt();
		System.out.println("Entersec :");
		int sec = sc.nextInt();
		return LocalDateTime.of(year, month, dt,hour,min,sec);
	}
	

	public LocalDateTime getCheckOutDate() {
		System.out.println("Enter out  year :  ");
		int year = sc.nextInt();
		System.out.println("Enter Month Number :");
		int month = sc.nextInt();
		System.out.println("Enter Date :");
		int dt = sc.nextInt();
		System.out.println("Enter out  Hour : ");
		int hour = sc.nextInt();
		System.out.println("Enter min :");
		int min = sc.nextInt();
		System.out.println("Enter sec :");
		int sec = sc.nextInt();
        return LocalDateTime.of(year, month, dt, hour, min,sec);		
	}



	public int getTotalDays() {
		sc.nextLine();
		System.out.println("Enter Total Days");
		return sc.nextInt();
	}

	public double getTotalAmount() {
		sc.nextLine();
		System.out.println("Enter Total Amount");
		return sc.nextDouble();

	}

	public String getBookingStatus() {
		sc.nextLine();
		System.out.println("Enter Booking Status");
		return sc.nextLine();

	}

	public String getPaymentStatus() {
		sc.nextLine();
		System.out.println("Enter Payment Status");
		return sc.nextLine();
	}

}
