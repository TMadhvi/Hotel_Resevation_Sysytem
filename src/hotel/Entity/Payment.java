package hotel.Entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment {
	private int paymentId;
	private Booking bookings = new Booking();
	private double paymentAmount;
	private String paymentMode;
	private String transactionId;
	private String paymentStatus;
	private LocalDateTime paymentDate;
	public Payment(int bookingId, double paymentAmount, String paymentMode, String transactionId,
			String paymentStatus, LocalDateTime paymentDate) {
		super();
		this.bookings.setBookingId(bookingId);
		this.paymentAmount = paymentAmount;
		this.paymentMode = paymentMode;
		this.transactionId = transactionId;
		this.paymentStatus = paymentStatus;
		this.paymentDate = paymentDate;
	}

	
}
