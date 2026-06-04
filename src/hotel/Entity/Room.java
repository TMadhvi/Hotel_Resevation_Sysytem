package hotel.Entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Room {

    private int roomId;
    private String roomNumber;
    private String roomType;
    private double pricePerDay;
    private int capacity;
    private int floorNumber;
    private String roomStatus;
    private String description;
	public Room(String roomNumber, String roomType, double pricePerDay, int capacity, int floorNumber,
			String roomStatus, String description) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.pricePerDay = pricePerDay;
		this.capacity = capacity;
		this.floorNumber = floorNumber;
		this.roomStatus = roomStatus;
		this.description = description;
		 
	}


}
