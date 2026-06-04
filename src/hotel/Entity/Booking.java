package hotel.Entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Booking {
	private int bookingId;
	private Customer customers = new Customer();
	private Room rooms = new Room();
	private LocalDateTime checkInDate;
	private LocalDateTime checkOutDate; 
	private int totalDays;
	private double totalAmount;
	private String bookingStatus;
	private String paymentStatus;
	

	public Booking(int customerId, int roomId, LocalDateTime checkInDate, LocalDateTime checkOutDate, 
			 int totalDays, double totalAmount, String bookingStatus, String paymentStatus
			) {
		super();
		this.customers.setCustomerId(customerId);
		this.rooms.setRoomId(roomId);
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.totalDays = totalDays;
		this.totalAmount = totalAmount;
		this.bookingStatus = bookingStatus;
		this.paymentStatus = paymentStatus;
		
	}


}
