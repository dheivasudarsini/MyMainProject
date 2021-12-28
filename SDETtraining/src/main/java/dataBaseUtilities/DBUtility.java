package dataBaseUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

import genericFileUtilities.IPathConstants;

public class DBUtility {
	
	Connection con = null;
	
	public void connecttoDB() throws SQLException {
		
		Driver d = new Driver();
		
		DriverManager.registerDriver(d);
		
		con = DriverManager.getConnection(IPathConstants.DBPath,IPathConstants.DBun,IPathConstants.DBpwd);
		
	}
	
	public void executeQuerytoGetData(String Query, String expres, int columnIndex) throws SQLException {
		
		ResultSet result = con.createStatement().executeQuery(Query);
		
		boolean flag = false;
		
		while(result.next()) {
			
			String actualres = result.getString(columnIndex);
			
			if(expres.equalsIgnoreCase(actualres)) {
				flag = true;
				break;
			}
		}
		
		if(flag == true)
		{
			System.out.println("query executed");
			
		}
		else {
			
			System.out.println("query not executed");
		}
	}
	
	public void executeUpdate(String Query) throws SQLException {
		
		int result = con.createStatement().executeUpdate(Query);
		if (result>=1){
			
		
			System.out.println("row affected");
		
		}
		if(result==0){
			
			System.out.println("not affected");
		}
	}
	public void closeConnection() throws SQLException {
		
		con.close();
		System.out.println("database connection closed successfully");
	}
}
