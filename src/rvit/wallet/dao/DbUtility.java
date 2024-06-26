package rvit.wallet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtility {
	
	public static Connection getDBConnection() {
		Connection connection=null;
		try {
			connection =DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/rvit","root","root");
			System.out.println("Connction success!");
			System.out.println(connection);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
//		 success
//		System.out.println("Connction success!");
//		System.out.println(connection);
		return connection;
	}
	

}
