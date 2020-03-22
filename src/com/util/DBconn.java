package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconn {

	static Connection conn = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	
	static String url = "jdbc:mysql://localhost:3306/library?useSSL=false";
	static String username = "root";
	static String password = "980924";
	
	public static void getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("connection error");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static int sqlOperation(String str) {
		int i = 0;
		try {
			ps = conn.prepareStatement(str);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return i;
	}
	
	public static ResultSet select(String str) {
		try {
			ps = conn.prepareStatement(str);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return rs;
	}
	
	public static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
}
