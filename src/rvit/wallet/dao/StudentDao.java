package rvit.wallet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {
	//static Connection connection = null;// static variable

	
	public StudentDao() {
		super();
		//connection = DbUtility.getDBConnection(); 
	}
	public static void addNewStudent( int id, String studentName) {
		Connection connection = DbUtility.getDBConnection(); 
		PreparedStatement preparedStatement=null;
		int result=0;
		if(connection != null) {
			try {
				preparedStatement = connection.prepareStatement("insert into student values(?,?)");
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, studentName);
				result = preparedStatement.executeUpdate();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
			if(result>0) {
				System.out.println("success");
				
			}
			else 
				System.out.println("fail");
		}
	}
	public static void main(String[] args) {
		Connection connection = DbUtility.getDBConnection(); 
		PreparedStatement preparedStatement=null;
		int result=0;
		if(connection != null) {
			try {
				preparedStatement = connection.prepareStatement("insert into student values(?,?)");
				preparedStatement.setInt(1, 1);
				preparedStatement.setString(2, "rvit");
				result = preparedStatement.executeUpdate();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
			if(result>0) {
				System.out.println("success");
				
			}
			else 
				System.out.println("fail");
		}
		
		addNewStudent(2, "India");
		
	}

}
