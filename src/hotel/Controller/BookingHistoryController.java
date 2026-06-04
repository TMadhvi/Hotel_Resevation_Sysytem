package hotel.Controller;

import java.time.LocalDateTime;
import java.util.List;

import hotel.Dao.BookingHistoryDao;
import hotel.Entity.AvailableRooms;
import hotel.Entity.Booking;
import hotel.Entity.BookingHistory;
import hotel.View.BookingHistoryView;

public class BookingHistoryController {

    private BookingHistoryDao dao;
    private BookingHistoryView view;

	public BookingHistoryController(BookingHistoryDao dao, BookingHistoryView view) {
		super();
		this.dao = dao;
		this.view = view;
	}
	public void run() {
        while (true) {
      	int choice = view.showMenu();

		switch (choice) {

                case 1: {

                    int bookingId = view.getBookingId();
                    String action = view.getActionType();
                    String remarks = view.getRemarks();

                    Booking b = new Booking();
                    b.setBookingId(bookingId);

                    BookingHistory h = new BookingHistory();
                    h.setBooking(b);
                    h.setActionType(action);
                    h.setActionTime(LocalDateTime.now());
                    h.setRemarks(remarks);

                    int i = dao.addHistory(h);

                    System.out.println(i != 0 ? "History Added" : "Failed");

                    break;
                }case 2 : {

                    List<BookingHistory>book = dao.getAllBookingHistory();

                    view.displayBookingHistory(book);
                }
                break;
                case 3:{
                	System.out.println("ThankYou for VISIT....");
                	return;
                	}
                	
                       default:
	    			
	    			System.out.println("Invalid Choice");
	    			
                }

                }
		
            }
        }
   
