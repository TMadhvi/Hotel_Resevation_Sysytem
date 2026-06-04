package hotel.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import hotel.DBUtil.DBUtil;
import hotel.Entity.Booking;
import hotel.Entity.BookingHistory;

public class BookingHistoryDao {

    public int addHistory(BookingHistory h) {

        int i = 0;

        try {

            Connection con = DBUtil.getConnection();

            String sql = "INSERT INTO booking_history(booking_id, action_type, action_time, remarks) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, h.getBooking().getBookingId());
            ps.setString(2, h.getActionType());
            ps.setObject(3, LocalDateTime.now());
            ps.setString(4, h.getRemarks());

            i = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return i;
    }
    
    //read

    public List<BookingHistory> getAllBookingHistory() {

        List<BookingHistory> list = new ArrayList<>();

        try {

            Connection con = DBUtil.getConnection();

            String sql = "select * from booking_history";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
            	
            	BookingHistory  book = new BookingHistory();

            	book.setHistoryId(rs.getInt("history_id"));

            	Booking b = new Booking();
            	b.setBookingId(rs.getInt("booking_id"));
            	book.setBooking(b);

            	book.setActionType(rs.getString("action_type"));
            	book.setActionTime(rs.getTimestamp("action_time").toLocalDateTime());
            	book.setRemarks(rs.getString("remarks"));

            	list.add(book);
            }
            
        } catch(Exception e) {
        	e.printStackTrace();
        }
        
        return list;
    }
}
            	
            	