package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = " system";
		String password = "mindgate123";
		String driver = "oracle.jdbc.driver.OracleDriver";
		int resultcount=0;
		String sqlquery="";
		Connection connection;
	PreparedStatement preparedStatement;
		ResultSet resultset;
		System.out.println("get all details ");
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, user, password);
			preparedStatement=connection.prepareStatement(sqlquery);
			sqlquery="SELECT * FROM employee_details";
			resultset=preparedStatement.executeQuery();
			while(resultset.next()) {
				System.out.println(resultset.getInt("employee_id"));
				System.out.println(resultset.getString("name"));
				System.out.println(resultset.getDouble("salary"));
			System.out.println("-".repeat(50));
			}
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("E"
					+ "xception");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	
	System.out.println("DELETE EXAMPLE");
		try {
			Class.forName(driver);
		connection=DriverManager.getConnection(url, user, password);
	sqlquery="DELETE employee_details where employee_id=?";
		preparedStatement=connection.prepareStatement(sqlquery);
		preparedStatement.setInt(1, 1);
		resultcount=preparedStatement.executeUpdate();
		connection.close();
		if(resultcount>0)
			System.out.println("delete successful");
	else
		System.out.println("delete failed");
			
		} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("UPDATE DETAILS ");
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, user, password);
			sqlquery="UPDATE employee_details SET name=?,salary=? WHERE employee_id=?";
			preparedStatement=connection.prepareStatement(sqlquery);
			
			preparedStatement.setString(1, "priyanka");
			preparedStatement.setDouble(2, 4000);
			preparedStatement.setInt(3, 21);
			resultcount=preparedStatement.executeUpdate();
			connection.close();
			if(resultcount> 0)
				System.out.println("Update Successful");
			else
				System.out.println("Update Failed");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("Insert Example");
		try {
				Class.forName(driver);
				connection=DriverManager.getConnection(url, user, password);
				sqlquery="INSERT INTO employee_details(name,salary) VALUES(?,?)";
				preparedStatement=connection.prepareStatement(sqlquery);
				preparedStatement.setString(1, "aruna");
				preparedStatement.setDouble(2, 1000);
				
				resultcount=preparedStatement.executeUpdate();
				connection.close();
				if(resultcount>0) {
					System.out.println("Record insert successfully");
				}
				else
				{
				System.out.println("failed to insert");
				}
				} catch (SQLException | ClassNotFoundException e) {
			
			
			e.printStackTrace();
		}
		

	}
}
