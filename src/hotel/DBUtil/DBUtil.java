package hotel.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
private static final String  DRIVER = "com.mysql.cj.jdbc.Driver";	
private static final String URL= "jdbc:mysql://localhost:3306/hotel_reservation_system";	
private static final String USERNAME = "root";	
private static final String  PASSWORD = "madhvi1320";	

public static Connection getConnection() {
	
	Connection con = null;
	
	try {
		Class.forName(DRIVER);
		con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	} catch (ClassNotFoundException | SQLException  e) {
		e.printStackTrace();
	}
	
	return con;
	
}

}
