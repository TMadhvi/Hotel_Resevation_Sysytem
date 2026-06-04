package hotel.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import hotel.Dao.RoomDao;
import hotel.Entity.Room;
import hotel.View.RoomView;

public class RoomController {

	private RoomDao dao;
	private RoomView view;

	public RoomController(RoomDao dao, RoomView view) {
		this.dao = dao;
		this.view = view;
	}

	public void run() {
		while (true) {
			int choice = view.showMenu();

			switch (choice) {

			// ADD
			case 1: {

				String roomNumber = view.getRoomNumber();
				String roomType = view.getRoomType();
				Double pricePerDay = view.getPricePerDay();
				int capacity = view.getCapacity();
				int floorNumber = view.getFloorNumber();
				String roomStatus = view.getRoomStatus();
				String description = view.getDescription();

				Room rm = new Room(roomNumber, roomType, pricePerDay, capacity, floorNumber, roomStatus, description);
				System.out.println(rm);

				int i = dao.addRoom(rm);
				System.out.println(i != 0 ? "Success..\n" : "Something went wrong..\n");
			}

				break;
				//update
			case 2 : {

				int roomId = view.getRoomid();
				String roomNumber = view.getRoomNumber();
				String roomType = view.getRoomType();
				double pricePerDay = view.getPricePerDay();
				int capacity = view.getCapacity();
				int floorNumber = view.getFloorNumber();
				String roomStatus = view.getRoomStatus();
				String description = view.getDescription();
				Room room = new Room(roomNumber, roomType, pricePerDay,
						capacity, floorNumber, roomStatus, description);
				room.setRoomId(roomId);
				boolean check = dao.updateRoom(room);

				if(check) {
					
					System.out.println("Room Updated Successfully");
				}
				else {
					
					System.out.println("Room Not Updated");
				}
			}
			break;
			//delete
			case 3 :{
				
				int roomId = view.getRoomid();
				if(dao.deleteRoom(roomId))
					System.out.println("Room Deleted Successfully...");
				else
					System.out.println("Something went wrong...");
				
				break;
			}
			// READ ALL
				
			case 4: {
				
				List<Room> list = dao.getAllRooms();
				
				for (Room room : list) {
					
					System.out.println(room);
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










