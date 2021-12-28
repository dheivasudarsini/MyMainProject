package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQuery {
	
	public static void main(String[] args) throws SQLException {
		//step 1a:Load the driver
		Driver dr = new Driver();
		//step1b:Register the driver
		DriverManager.registerDriver(dr);
		//step 2:establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		//Step 3:create the statement
		Statement st = con.createStatement();
	
		
		
		//select query
		
		String query =("select * from STUDENT");
		
		ResultSet result1 = st.executeQuery(query);
		
		while(result1.next())
		{
			
			System.out.println(result1.getString(1)+"\t"+result1.getString(2)+"\t"+result1.getString(3));
		}
		
		//step6:close the connection
		con.close();
		
		
		
		
	}

}
