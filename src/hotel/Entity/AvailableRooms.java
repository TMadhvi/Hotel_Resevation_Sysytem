package hotel.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AvailableRooms {

    private int roomId;
    private String roomNumber;
    private String roomType;
    private double pricePerDay;
    private int capacity;
    private int floorNumber;
    private String description;
	public AvailableRooms(String roomNumber, String roomType, double pricePerDay, int capacity, int floorNumber,
			 String description) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.pricePerDay = pricePerDay;
		this.capacity = capacity;
		this.floorNumber = floorNumber;
		this.description = description;
	}
    
    

}