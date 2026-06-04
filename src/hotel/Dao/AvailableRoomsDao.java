package hotel.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import hotel.DBUtil.DBUtil;
import hotel.Entity.AvailableRooms;

public class AvailableRoomsDao {

    public List<AvailableRooms> getAllAvailableRooms() {

        List<AvailableRooms> list = new ArrayList<>();

        try {

            Connection con = DBUtil.getConnection();

            String sql = "select * from available_rooms";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                AvailableRooms room = new AvailableRooms();

                room.setRoomId(rs.getInt("room_id"));
                room.setRoomNumber(rs.getString("room_number"));
                room.setRoomType(rs.getString("room_type"));
                room.setPricePerDay(rs.getDouble("price_per_day"));
                room.setCapacity(rs.getInt("capacity"));
                room.setFloorNumber(rs.getInt("floor_number"));
                room.setDescription(rs.getString("description"));

                list.add(room);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}