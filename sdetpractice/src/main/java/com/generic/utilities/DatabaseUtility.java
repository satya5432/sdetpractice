package com.generic.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class DatabaseUtility {
	Connection con=null;
	public void connectToDB() throws SQLException
	{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection(IpathConstant.DBURL, IpathConstant.DBUSERNAME, IpathConstant.DBPASSWORD);
	}
	public void executeAndgetData(String query1, int colIndex, String expData) throws SQLException
	{
	Statement state = con.createStatement();
	
		ResultSet result = state.executeQuery(query1);
		boolean flag=false;
		while(result.next()) {
			String actual=result.getString(colIndex);
			if(actual.contains(expData))
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("--data is verified");
			
			
		}
		else {
			System.out.println("data is not present");
		}
			
		}
	public void closeDB() throws SQLException
	{
		con.close();
		
	}
}
