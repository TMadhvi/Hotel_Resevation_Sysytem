package hotel.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import hotel.DBUtil.DBUtil;
import hotel.Entity.Room;

public class RoomDao {
	
	// insert
	
	public int addRoom(Room room) {
		int i = 0;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "insert into rooms(room_number,room_type,price_per_day,capacity,floor_number,room_status,description) values(?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, room.getRoomNumber());
			ps.setString(2, room.getRoomType());
			ps.setDouble(3, room.getPricePerDay());
			ps.setInt(4, room.getCapacity());
			ps.setInt(5, room.getFloorNumber());
			ps.setString(6, room.getRoomStatus());
			ps.setString(7, room.getDescription());
			i = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		  return i ;
		
	}
	//read
	public List<Room> getAllRooms() {

	    List<Room> list = new ArrayList<>();

	    try {
	        Connection con = DBUtil.getConnection();

	        String sql = "select * from rooms";
	        PreparedStatement ps = con.prepareStatement(sql);

	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {

	            Room room = new Room();

	            room.setRoomId(rs.getInt("room_id"));
	            room.setRoomNumber(rs.getString("room_number"));
	            room.setRoomType(rs.getString("room_type"));
	            room.setPricePerDay(rs.getDouble("price_per_day"));
	            room.setCapacity(rs.getInt("capacity"));
	            room.setFloorNumber(rs.getInt("floor_number"));
	            room.setRoomStatus(rs.getString("room_status"));
	            room.setDescription(rs.getString("description"));

	            list.add(room);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return list;
	}
//delete
	public boolean deleteRoom(int roomId) {

	    try {
	        Connection con = DBUtil.getConnection();

	        String sql = "delete from rooms where room_id=?";
	        PreparedStatement ps = con.prepareStatement(sql);

	        ps.setInt(1, roomId);

	        return ps.executeUpdate() > 0;

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return false;
	}
	//update
	public boolean updateRoom(Room room) {

	    try {
	        Connection con = DBUtil.getConnection();

	        String sql =
	        "update rooms set room_number=?, room_type=?, price_per_day=?, capacity=?, floor_number=?, room_status=?, description=? where room_id=?";

	        PreparedStatement ps = con.prepareStatement(sql);

	        ps.setString(1, room.getRoomNumber());
	        ps.setString(2, room.getRoomType());
	        ps.setDouble(3, room.getPricePerDay());
	        ps.setInt(4, room.getCapacity());
	        ps.setInt(5, room.getFloorNumber());
	        ps.setString(6, room.getRoomStatus());
	        ps.setString(7, room.getDescription());
	        ps.setInt(8, room.getRoomId());

	        return ps.executeUpdate() > 0;

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return false;
	}

}
