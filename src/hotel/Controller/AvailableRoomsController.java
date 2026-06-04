package hotel.Controller;

import java.util.List;

import hotel.Dao.AvailableRoomsDao;
import hotel.Entity.AvailableRooms;
import hotel.View.AvailableRoomsView;

public class AvailableRoomsController {

    private AvailableRoomsDao dao;
    private AvailableRoomsView view;

    public AvailableRoomsController(
            AvailableRoomsDao dao,
            AvailableRoomsView view) {

        this.dao = dao;
        this.view = view;
    }

	public void run() {
        while (true) {
      	int choice = view.showMenu();

		switch (choice) {

            case 1:{

                List<AvailableRooms> rooms = dao.getAllAvailableRooms();

                view.displayRooms(rooms);

            }
            
            break;

            case 2:

                System.out.println("Thank You for Visit..");
                return;

            default:

                System.out.println("Invalid Choice");
            }
        }
    }
}