package JavaTutorials;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3036/emp", "root", "root");
		
		Statement s  = con.createStatement();
		
		 ResultSet rs = s.executeQuery("select * from emp");
		 
		 while(rs.next()) {
			 
			 rs.getString(1);
			 
		 }

	}

}
