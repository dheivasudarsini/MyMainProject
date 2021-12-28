package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class UpdateQuery {

	public static void main(String[] args) throws SQLException {
	
		Driver dr = new Driver();
		
		DriverManager.registerDriver(dr);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root","root");
		
		Statement st = con.createStatement();
		
		int result = st.executeUpdate("update student set SNAME='dheiva' where SID = 1111");
		
		if (result==0) {
			
			System.out.println("updated done");
		}
		else {
			
			System.out.println("not updated");
		}
		con.close();
	}

}
