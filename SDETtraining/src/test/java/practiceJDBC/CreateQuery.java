package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class CreateQuery {
	
	public static void main(String[] args) throws SQLException {
		//step 1a:Load the driver
		Driver dr = new Driver();
		//step1b:Register the driver
		DriverManager.registerDriver(dr);
		//step 2:establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		//Step 3:create the statement
		Statement st = con.createStatement();
		
		//create query
		//step 4:write the statement
		int result = st.executeUpdate("CREATE TABLE STUDENT (SNAME VARCHAR(20) NOT NULL, SID INT, PHONE INT NOT NULL, PRIMARY KEY(SID))");
		//step 5:process the statement
		if(result==0)
			System.out.println("table created successfully");
		else
			System.out.println("not created");
		
	    //step 6:close the connection
		con.close();
		
		
		
		
	}

}
