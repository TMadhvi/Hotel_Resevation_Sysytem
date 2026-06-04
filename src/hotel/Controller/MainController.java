package hotel.Controller;
	import java.util.Scanner;

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
// cancalation time kyu de jab paid hai toh
	
	public class MainController {

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	while (true) {

	    		System.out.println("\n===== HOTEL MANAGEMENT SYSTEM =====");

				System.out.println("1. ROOMS DETAILS");
				System.out.println("2. CUSTOMERS DETAILS");
				System.out.println("3. BOOKINGS DETAILS");
				System.out.println("4. PAYMENT DETAILS");
				System.out.println("5. BOOKING HISTORY DETAILS");
				System.out.println("6. AVAILABLE ROOMS DEATILS");
				System.out.println("7. EXIT");

	    		System.out.print("Enter Choice : ");

	    		int choice = sc.nextInt();
	    		switch (choice) {


	    		case 1: {  // room

	    			RoomDao dao = new RoomDao();
	    			RoomView view = new RoomView();
	    			
	    			RoomController controller =
	    					new RoomController(dao, view);
	    			
	    			controller.run();
	    			
	    			break;
	    		}

	    		case 2: { // customer
	    			
	    			CustomerDao dao = new CustomerDao();
	    			CustomerView view = new CustomerView();
	    			
	    			CustomerController controller =
	    					new CustomerController(dao, view);
	    			
	    			controller.run();
	    			
	    			break;
	    		}
	           
	    		case 3: {    //booking
	    			
	    			BookingDao dao = new BookingDao();
	    			BookingView view = new BookingView();
	    			
	    			BookingController controller =
	    					new BookingController(dao, view);
	    			
	    			controller.run();
	    			
	    			break;
	    		}

	    		case 4: {    //payment
	    			
	    			PaymentDao dao = new PaymentDao();
	    			PaymentView view = new PaymentView();
	    			
	    			PaymentController controller =
	    					new PaymentController(dao, view);
	    			
	    			controller.run();
	    			
	    			break;
	    		}
	    		case 5 : { // Booking history 
	    			BookingHistoryDao dao = new BookingHistoryDao();
	    			BookingHistoryView view = new BookingHistoryView();
	    			
	    			BookingHistoryController controller = new BookingHistoryController(dao,view);
	    			
	    		  controller.run();
	    		
	    		
	    		break;
	    		}
	    		case 6 : { // AvailableRooms
	    			
	    			AvailableRoomsDao dao = new AvailableRoomsDao();
	    			AvailableRoomsView view = new AvailableRoomsView();
	    			AvailableRoomsController controller = new AvailableRoomsController(dao,view);
	    			controller.run();
	    		
	    		break;
	    		}
	    		//exit
	    		
	    		case 7 : 
	    			System.out.println("Successfully Exit Thankyou");
	    			System.exit(0);
	    		default:
	    			
	    			System.out.println("Invalid Choice");
	    			
	    		}
	    	}
	    }
	}
	
	
	           




	

