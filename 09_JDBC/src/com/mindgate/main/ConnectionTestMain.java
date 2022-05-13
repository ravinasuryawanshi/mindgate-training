package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTestMain {
	public static void main(String[] args) {
		System.out.println("Main start");
		try {
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mindgate123");
				System.out.println("Connetcion success");
				connection.close();
		}catch (ClassNotFoundException | SQLException e) {
				
			System.out.println("Fail to load driver");
			System.out.println(e.getMessage());
			e.printStackTrace();
			}
			System.out.println("main End");
	}
}
