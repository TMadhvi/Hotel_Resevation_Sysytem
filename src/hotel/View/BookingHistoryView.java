package hotel.View;

import java.util.List;
import java.util.Scanner;

import hotel.Entity.BookingHistory;

public class BookingHistoryView {

    Scanner sc = new Scanner(System.in);

    public int showMenu() {
        System.out.println("1. Add History");
        System.out.println("2. Read History");
        System.out.println("3. Exit....");
        return sc.nextInt();
    }

    public int getBookingId() {
        System.out.println("Enter Booking ID:");
        return sc.nextInt();
    }

    public String getActionType() {
    	sc.nextLine();
        System.out.println("Enter Action (BOOKED/CANCELLED/UPDATED):");
        return sc.next();
    }

    public String getRemarks() {
        System.out.println("Enter Remarks:");
        return sc.next();
    }
    
    public void displayBookingHistory(List<BookingHistory> list) {

        for (BookingHistory b : list) {

            System.out.println("History ID : " + b.getHistoryId());
            System.out.println("Booking ID : " + b.getBooking().getBookingId());
            System.out.println("Action Type : " + b.getActionType());
            System.out.println("Action Time : " + b.getActionTime());
            System.out.println("Remarks : " + b.getRemarks());
            System.out.println("----------------------------");
        }
    }
}
