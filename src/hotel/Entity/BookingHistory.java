package hotel.Entity;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingHistory {

    private int historyId;
    private Booking booking = new Booking();
    private String actionType;
    private LocalDateTime actionTime;
    private String remarks;
    
	public BookingHistory(int booking, String actionType, LocalDateTime actionTime, String remarks) {
		super();
		this.booking.setBookingId(booking);
		this.actionType = actionType;
		this.actionTime = actionTime;
		this.remarks = remarks;
	}

	
    
    
}