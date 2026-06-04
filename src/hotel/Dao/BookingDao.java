package hotel.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import hotel.DBUtil.DBUtil;
import hotel.Entity.Booking;
import hotel.Entity.Customer;
import hotel.Entity.Room;

public class BookingDao {
// insert
    public int bookRoom(Booking booking) {

        int i = 0;

        try {

            Connection con = DBUtil.getConnection();

            String sql = "insert into bookings(customer_id,room_id,check_in_date,check_out_date,total_days,total_amount,booking_status,payment_status) values(?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setInt(1, booking.getCustomers().getCustomerId());
            ps.setInt(2, booking.getRooms().getRoomId());
            ps.setObject(3, booking.getCheckInDate());
            ps.setObject(4, booking.getCheckOutDate());
            ps.setInt(5, booking.getTotalDays());
            ps.setDouble(6, booking.getTotalAmount());
            ps.setString(7, booking.getBookingStatus());
            ps.setString(8, booking.getPaymentStatus());
            i = ps.executeUpdate();
            

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return i ;
    }

 // read
 	public List<Booking> getUpdate() {

 		List<Booking> list = new ArrayList<>();

 		try {
 			Connection con = DBUtil.getConnection();

 			String sql = "select * from bookings";
 			PreparedStatement ps = con.prepareStatement(sql);

 			ResultSet rs = ps.executeQuery();

 			while (rs.next()) {

 				Booking B = new Booking();

 				B.setBookingId(rs.getInt("booking_id"));			
 				Customer c = new Customer();
 				c.setCustomerId(rs.getInt("customer_id"));
 				B.setCustomers(c);
 				Room r = new Room();
 				r.setRoomId(rs.getInt("room_id"));
 				B.setRooms(r);
 				B.setCheckInDate(rs.getTimestamp("check_in_date").toLocalDateTime());
 				B.setCheckOutDate(rs.getTimestamp("check_out_date").toLocalDateTime());
 				B.setTotalDays(rs.getInt("total_days"));
 				B.setTotalAmount(rs.getDouble("total_amount"));
 				B.setBookingStatus(rs.getString("booking_status"));
 				B.setPaymentStatus(rs.getString("payment_status"));

 				list.add(B);
 			}

 		} catch (Exception e) {
 			e.printStackTrace();
 		}

 		return list;
 	}

 	// delete
 	public boolean deleteBooking(int bookingId) {

 		try {
 			Connection con = DBUtil.getConnection();

 			String sql = "delete from bookings where booking_id=?";
 			PreparedStatement ps = con.prepareStatement(sql);

 			ps.setInt(1, bookingId);

 			return ps.executeUpdate() > 0;

 		} catch (Exception e) {
 			e.printStackTrace();
 		}

 		return false;
 	}

 	// update
 	public boolean updateBooking(Booking booking) {

 		try {
 			Connection con = DBUtil.getConnection();

 			String sql = "update bookings set check_in_date=?,check_out_date=?,total_amount=? where booking_id=?";

 			PreparedStatement ps = con.prepareStatement(sql);
 			ps.setTimestamp(1,Timestamp.valueOf(booking.getCheckInDate()));
 			ps.setTimestamp(2, Timestamp.valueOf(booking.getCheckOutDate()));
 			ps.setDouble(3, booking.getTotalAmount());
 			ps.setInt(4, booking.getBookingId());

 			return ps.executeUpdate() > 0;

 		} catch (Exception e) {
 			e.printStackTrace();
 		}

 		return false;
 	}


}
    
