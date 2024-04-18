package datadrivertesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class nonselectqueryTest {

	public static void main(String[] args) throws SQLException {
		 //step1:Resister driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		//step2:get connection for database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/easydigitalbanking", "root", "root");
		
		
		//step3:Create statement
		Statement state = con.createStatement();
		String query = "insert into rmg values('rahul','API',3),('rahul2','api',4);";
		//step4:Execute statement
		int result = state.executeUpdate(query);
		
		//while(result.next()) {
			//System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
		//}
		//close database connection
		con.close();
	}
	}


