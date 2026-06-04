package hotel.Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import hotel.DBUtil.DBUtil;
import hotel.Entity.Booking;
import hotel.Entity.Customer;

public class CustomerDao {
	
	// insert

    public int addCustomer(Customer customer) {

        int i = 0;

        try {

			Connection con = DBUtil.getConnection();

            String sql = "insert into customers(first_name,last_name,gender,phone,email,id_proof_type,id_proof_number,address) values(?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, customer.getFirstName());
            ps.setString(2, customer.getLastName());
            ps.setString(3, customer.getGender());
            ps.setString(4, customer.getPhone());
            ps.setString(5, customer.getEmail());
            ps.setString(6, customer.getIdProofType());
            ps.setString(7, customer.getIdProofNumber());
            ps.setString(8, customer.getAddress());

            i = ps.executeUpdate();

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return i ;
    }
 // read
 	public List<Customer> getUpdate() {

 		List<Customer> list = new ArrayList<>();

 		try {
 			Connection con = DBUtil.getConnection();

 			String sql = "select * from customers";
 			PreparedStatement ps = con.prepareStatement(sql);

 			ResultSet rs = ps.executeQuery();

 			while (rs.next()) {

 				Customer pt = new Customer();

 				pt.setCustomerId(rs.getInt("customer_id"));
 				pt.setFirstName(rs.getString("first_name"));
 				pt.setLastName(rs.getString("last_name"));
 				pt.setGender(rs.getString("gender"));
 				pt.setPhone(rs.getString("phone"));
 				pt.setEmail(rs.getString("email"));
 				pt.setIdProofType(rs.getString("id_proof_type"));
 				pt.setIdProofNumber(rs.getString("id_proof_number"));
 				pt.setAddress(rs.getString("address"));
 				
 				list.add(pt);
 			}

 		} catch (Exception e) {
 			e.printStackTrace();
 		}

 		return list;
 	}

 	// delete
 	public boolean deleteCustomer(int customerId) {

 		try {
 			Connection con = DBUtil.getConnection();

 			String sql = "delete from customers where customer_id=?";
 			PreparedStatement ps = con.prepareStatement(sql);

 			ps.setInt(1, customerId);

 			return ps.executeUpdate() > 0;

 		} catch (Exception e) {
 			e.printStackTrace();
 		}

 		return false;
 	}

 	// update
 	public boolean updateCustomer(Customer customer) {

 		try {
 			Connection con = DBUtil.getConnection();

 			String sql = "update customers set first_name=?, last_name=?, gender=?, phone=?, email=?,id_proof_type=?,id_proof_number=?,address=? where customer_id=?";

 			PreparedStatement ps = con.prepareStatement(sql);
 			ps.setString(1, customer.getFirstName());
 			ps.setString(2, customer.getLastName());
 			ps.setString(3, customer.getGender());
 			ps.setString(4, customer.getPhone());
 			ps.setString(5, customer.getEmail());
 			ps.setString(6, customer.getIdProofType());
 			ps.setString(7, customer.getIdProofNumber());
 			ps.setString(8, customer.getAddress());
 			ps.setInt(9, customer.getCustomerId());
 			return ps.executeUpdate() > 0;

 		} catch (Exception e) {
 			e.printStackTrace();
 		}

 		return false;
 	}


 }


