package hotel;

import java.util.Scanner;

import hotel.Controller.AvailableRoomsController;
import hotel.Controller.BookingController;
import hotel.Controller.BookingHistoryController;
import hotel.Controller.CustomerController;
import hotel.Controller.PaymentController;
import hotel.Controller.RoomController;
import hotel.Dao.AvailableRoomsDao;
import hotel.Dao.BookingDao;
import hotel.Dao.BookingHistoryDao;
import hotel.Dao.CustomerDao;
import hotel.Dao.PaymentDao;
import hotel.Dao.RoomDao;
import hotel.View.AvailableRoomsView;
import hotel.View.BookingHistoryView;
import hotel.View.BookingView;
import hotel.View.CustomerView;
import hotel.View.PaymentView;
import hotel.View.RoomView;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n======== Hotel_Reservation_System ============");

			System.out.println("1. ROOMS DETAILS");
			System.out.println("2. CUSTOMERS DETAILS");
			System.out.println("3. BOOKINGS DETAILS");
			System.out.println("4. PAYMENT DETAILS");
			System.out.println("5. BOOKING HISTORY DETAILS");
			System.out.println("6. AVAILABLE ROOMS DEATILS");
			System.out.println("7. EXIT");

			System.out.println(" ENTER CHOICE   :  ");
			int choice = sc.nextInt();
			switch (choice) {

			// Rooms
			case 1: {
				RoomDao Dao = new RoomDao();
				RoomView view = new RoomView();
				RoomController controller = new RoomController(Dao, view);
				controller.run();
				break;
			}
			// Customer
			case 2: {
				CustomerDao Dao = new CustomerDao();
				CustomerView view = new CustomerView();
				CustomerController controller = new CustomerController(Dao, view);
				controller.run();
				break;

			}
			// Booking
			case 3: {
				BookingDao Dao = new BookingDao();
				BookingView view = new BookingView();
				BookingController controller = new BookingController(Dao, view);
				controller.run();

				break;
			}
			// payments
			case 4: {
				PaymentDao Dao = new PaymentDao();
				PaymentView view = new PaymentView();
				PaymentController controller = new PaymentController(Dao, view);
				controller.run();
				break;
			}
			//BOOKING HISTORY DETAILS
			case 5 : {
				BookingHistoryDao Dao = new BookingHistoryDao();
				BookingHistoryView view = new BookingHistoryView();
				BookingHistoryController controller = new BookingHistoryController(Dao, view);
				break;
				
			}
			//AVAILABLE ROOMS DEATILS
			case 6 : {
				AvailableRoomsDao Dao = new AvailableRoomsDao();
				AvailableRoomsView view = new AvailableRoomsView();
				AvailableRoomsController controller = new AvailableRoomsController(Dao,view);
				break;
			}
			// Exit
			case 7: {
				System.out.println("ThankYou");
				System.exit(0);
			}
			default:
				System.out.println("Invalid Choice");

			}

		}
	}

}
