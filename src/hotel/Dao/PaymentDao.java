package hotel.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import hotel.DBUtil.DBUtil;
import hotel.Entity.Booking;
import hotel.Entity.Payment;
import hotel.Entity.Room;

public class PaymentDao {

	// INSERT

	public int addPayment(Payment payment) {

		int i = 0;

		try {

			Connection con = DBUtil.getConnection();

			String sql = "insert into payments(booking_id,payment_amount,payment_mode,payment_status,transaction_id,payment_date) values(?,?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, payment.getBookings().getBookingId());
			ps.setDouble(2, payment.getPaymentAmount());
			ps.setString(3, payment.getPaymentMode());
			ps.setString(4, payment.getPaymentStatus());
			ps.setString(5, payment.getTransactionId());
			ps.setTimestamp(6, Timestamp.valueOf(payment.getPaymentDate()));

			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

	// read
	public List<Payment> getUpdate() {

		List<Payment> list = new ArrayList<>();

		try {
			Connection con = DBUtil.getConnection();

			String sql = "select * from payments";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Payment pt = new Payment();

				pt.setPaymentId(rs.getInt("payment_id"));
				Payment p = new Payment();
				Booking b = new Booking();
				b.setBookingId(rs.getInt("booking_id"));
				pt.setBookings(b);
				pt.setPaymentAmount(rs.getDouble("payment_amount"));
				pt.setPaymentMode(rs.getString("payment_mode"));
				pt.setTransactionId(rs.getString("transaction_id"));
				pt.setPaymentStatus(rs.getString("payment_status"));
				pt.setPaymentDate(rs.getTimestamp("payment_date").toLocalDateTime());

				list.add(pt);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	// delete
	public boolean deletePayment(int paymentId) {

		try {
			Connection con = DBUtil.getConnection();

			String sql = "delete from payments where payment_id=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, paymentId);

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	// update
	public boolean updatePayment(Payment payment) {

		try {
			Connection con = DBUtil.getConnection();

			String sql = "update payments set Booking_id=?, payment_amount=?, payment_mode=?, transaction_id=?, payment_status=?, payment_date=? where payment_id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, payment.getBookings().getBookingId());
			ps.setDouble(2, payment.getPaymentAmount());
			ps.setString(3, payment.getPaymentMode());
			ps.setString(4, payment.getTransactionId());
			ps.setString(5, payment.getPaymentStatus());
			ps.setTimestamp(6, Timestamp.valueOf(payment.getPaymentDate()));
			ps.setInt(7, payment.getPaymentId());
			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}


}
