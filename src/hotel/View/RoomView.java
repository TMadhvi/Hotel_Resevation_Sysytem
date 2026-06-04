package hotel.View;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import hotel.Entity.Room;

public class RoomView {
	
	private Scanner sc = new Scanner (System.in);

	public int showMenu() {
		System.out.println("Enter 1 for add Room");
		System.out.println("Enter 2 for update Room");
		System.out.println("Enter 3 for delete Room");
		System.out.println("Enter 4 for read all");
		System.out.println("Enter 5 for Exit.....");
		return sc.nextInt();
		
	}                    
   
	public int getRoomid() {
		System.out.println("Enter Room Id");   
		return sc.nextInt();
	}
	  
	
	public String getRoomNumber() {
		sc.nextLine();
		System.out.println("Enter Room Number");
		return sc.nextLine();
		
	}
	public String getRoomType() {
		System.out.println("Enter Room Type");
		return sc.nextLine();
		
	}
	public double getPricePerDay() {
		sc.nextLine();
		System.out.println("Enter Room Price/day");
		return sc.nextDouble();
		
	}
	public int getCapacity() {
		sc.nextLine();
		System.out.println("Enter Room Capacity");
		return sc.nextInt();
		
	}
	public int getFloorNumber() {
		sc.nextLine();
		System.out.println("Enter Room Floor Number");
		return sc.nextInt();
		
	}
	public String getRoomStatus() {
		sc.nextLine();
		System.out.println("Enter Room Status");
		return sc.nextLine();
		
	}
	public String getDescription() {
		System.out.println("Enter Description");
		return sc.nextLine();
		
	}
	public LocalDateTime getCreatedAt() {
		System.out.println("Enter  year : ");
		int year = sc.nextInt();
		System.out.println("Enter Month Number :");
		int month = sc.nextInt();
		System.out.println("Enter dt :");
		int dt = sc.nextInt();
		System.out.println("Enter hour :");
		int hour = sc.nextInt();
		System.out.println("Enter min :");
		int min = sc.nextInt();
		System.out.println("Enter sec");
		int sec = sc.nextInt();
		
		return LocalDateTime.of(year, month,dt, hour, min, sec);
	}





}
