package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertQuery {

	public static void main(String[] args) throws SQLException {
		
		Driver dr = new Driver();
		
		DriverManager.registerDriver(dr);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		
		Statement st = con.createStatement();
		
		int result = st.executeUpdate("insert into student values('abcd',1111,12398745),('efgh',2222,11111111),('ijkl',3333,22222222),('mnop',4444,33333333),('qrst',5555,444444444)");
		
		if (result==0) {
			
			System.out.println("row inserted successfully");
		}
	   
		else {
			
			System.out.println("not inserted");
		}
		
		con.close();
	}

}
