package hotel.View;

import java.time.LocalDateTime;
import java.util.Scanner;

public class PaymentView {
	
	private Scanner sc = new Scanner (System.in);

	public int showMenu() {                                           
		System.out.println("Enter 1 for add Payment");
		System.out.println("Enter 2 for update Payment");
		System.out.println("Enter 3 for delete Payment");
		System.out.println("Enter 4 for read all");
		System.out.println("Enter 5 for Exit.....");
		return sc.nextInt();

	}                    
   
	public int getPaymentId() {
		System.out.println("Enter Payment Id");   
		return sc.nextInt();
	}
	  
	public int getBookingId() {
		sc.nextLine();
		System.out.println("Enter Booking Id");   
		return sc.nextInt();
	}
	  
	
	public double getPaymentAmount() {
		sc.nextLine();
		System.out.println("Enter Payment Amount");
		return sc.nextDouble();	
	}
	
	public String getPaymentMode() {
		sc.nextLine();
		System.out.println("Enter Payment mode");
		return sc.nextLine();
		
	}
	public String getTranscationId() {
		System.out.println("Enter Transcation Id");
		return sc.nextLine();
		
	}
	public String getPaymentStatus() {
		sc.nextLine();
		System.out.println("Enter Payment Status");
		return sc.nextLine();
		
	}
	
	public LocalDateTime getPaymentDate() {
		System.out.println("Enter year :");
		int year = sc.nextInt();
		System.out.println("Enter Month Number :");
		int month = sc.nextInt();
		System.out.println("Enter  Date : ");
		int dt = sc.nextInt();
		System.out.println("Enter hour :");
		int hour = sc.nextInt();
		System.out.println("Enter min :");
		int min = sc.nextInt();
		System.out.println("Enter sec");
		int sec = sc.nextInt();
		
		return LocalDateTime.of( year, month, dt, hour, min, sec);
	}






}
