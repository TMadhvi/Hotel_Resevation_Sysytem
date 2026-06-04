package hotel.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import hotel.Dao.BookingDao;
import hotel.Entity.Booking;
import hotel.Entity.Payment;
import hotel.View.BookingView;

public class BookingController {
	
	private BookingDao dao;
	private BookingView view;
	public BookingController(BookingDao dao, BookingView view) {
		super();
		this.dao = dao;
		this.view = view;
	}
	public void run() {
	
		while(true) {
			int choice = view.showMenu();
			switch(choice) {
			
			//add
			case 1: {

			    int customerId = view.getCustomerid();
			    int roomId = view.getRoomId();
			    LocalDateTime checkInDate = view.getCheckInDate();
			    LocalDateTime checkOutDate = view.getCheckOutDate();
			    int totalDays = view.getTotalDays();
			    double totalAmount = view.getTotalAmount();
			    String bookingStatus = view.getBookingStatus();
			    System.out.println(bookingStatus);
			    String paymentStatus = view.getPaymentStatus();
			    Booking bk = new Booking(customerId,roomId,checkInDate,checkOutDate,totalDays,totalAmount,bookingStatus,paymentStatus);


			    System.out.println(bk);
			    int i = dao.bookRoom(bk);
			  
			    System.out.println(i != 0 ? "Booking Added Successfully" : "Booking Not Added");

			    break;
			       }
			case 2: {    // update
				int bookingId = view.getBookingid();
				LocalDateTime checkInDate = view.getCheckInDate();
				LocalDateTime checkOutDate = view.getCheckOutDate();
				
				double amount = view.getTotalAmount();
	            
				Booking booking = new Booking();

				booking.setBookingId(bookingId);
				booking.setCheckInDate(checkInDate);
				booking.setCheckOutDate(checkOutDate);
				booking.setTotalAmount(amount);


				boolean check = dao.updateBooking(booking);

				if (check) {
				    System.out.println("Booking Updated Successfully");
				} else {
				    System.out.println("Something went wrong....");
				}
			}
			break;
			//delete
			case 3 :{
				
				int BookingId = view.getBookingid();
				if(dao.deleteBooking(BookingId)) {
					System.out.println("Booking Deleted Successfully...");
				}else {
					System.out.println("Something went wrong...");
				}
				break;
			}
			// READ ALL
				
			case 4: {
				
				List<Booking> list = dao.getUpdate();
				
				for (Booking booking : list) {
					
					System.out.println(booking);
				}
			}
			
			break;
			
			case 5:
				System.out.println("ThankYou.....");
				return;
				
			default:
				System.out.println("Invalid Choice");
				
			}
		
		}
  
		    	}
			 
		   
	  
}

