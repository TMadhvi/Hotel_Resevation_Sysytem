package hotel.View;

import java.util.List;
import java.util.Scanner;

import hotel.Entity.AvailableRooms;

public class AvailableRoomsView {

	private Scanner sc = new Scanner(System.in);

	public int showMenu() {

		System.out.println("1. View Available Rooms");
		System.out.println("2. Exit");

		return sc.nextInt();
	}

	public void displayRooms(List<AvailableRooms> rooms) {

		System.out.println("\n===== AVAILABLE ROOMS =====\n");

		for (AvailableRooms r : rooms) {
 
			System.out.println("Room ID       : " + r.getRoomId());
			System.out.println("Room Number   : " + r.getRoomNumber());
			System.out.println("Room Type     : " + r.getRoomType());
			System.out.println("Price/Day     : " + r.getPricePerDay());
			System.out.println("Capacity      : " + r.getCapacity());
			System.out.println("Floor Number  : " + r.getFloorNumber());
			System.out.println("Description   : " + r.getDescription());

			System.out.println("----------------------------------");
		}
	}
}