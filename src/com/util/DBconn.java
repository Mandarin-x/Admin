package com.util;
 
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
 

public class DBconn {
//	static String url = "jdbc:mysql://localhost:3307/mandarin?serverTimezone=GMT&useunicude=true&characterEncoding=utf8"; 
//	static String username = "root"; 
//	static String password = "1111"; 
	
	static String url = "jdbc:mysql://cdb-p25iqzcy.cd.tencentcdb.com:10124/hhh"; 
	static String username = "root"; 
	static String password = "abc+123456"; 
	static Connection  conn = null;
	static ResultSet rs = null;
	static PreparedStatement ps =null;
	public static void init(){
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("[SQL]�ɹ�");
		} catch (Exception e) {
			System.out.println("init [SQL���������ʼ��ʧ�ܣ�]");
			e.printStackTrace();
		}
	}
	public static int addUpdDel(String sql){
		int i = 0;
		try {
			PreparedStatement ps =  conn.prepareStatement(sql);
			i =  ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("sql���ݿ���ɾ���쳣");
			e.printStackTrace();
		}
		
		return i;
	}
	public static ResultSet selectSql(String sql){
		try {
			ps =  conn.prepareStatement(sql);
			rs =  ps.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("sql���ݿ��ѯ�쳣");
			e.printStackTrace();
		}
		return rs;
	}
	public static void closeConn(){
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("sql���ݿ�ر��쳣");
			e.printStackTrace();
		}
	}
}