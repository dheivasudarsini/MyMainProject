package fileUtilities;

import java.sql.SQLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import genericFileUtilities.DBUtility;
public class DBUtilitymethods {
	

	
	
	DBUtility ref = new DBUtility();
	@BeforeTest
	public void connect() throws SQLException {
		
		ref.connecttoDB();
	}
	
	
	public void execute() throws SQLException {
		
		ref.executeQuerytoGetData("select * from student", "dheiva", 1);
	}
	
	
	public void executeUpdate() throws SQLException{
		
		ref.executeUpdate("insert into student values('sesa',4444,1234587)");
	}
	
	@AfterTest
	public void close() throws SQLException {
		
		ref.closeConnection();
	}

}
