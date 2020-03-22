package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.entity.Admin;
import com.util.DBconn;

public class AdminDaoImpl implements AdminDao{
	
	
	@Override
	public boolean login(String id, String pwd) {
		boolean flag = false;
		Admin admin = new Admin();
		try {
			DBconn.getConnection();
			ResultSet rs = DBconn.select("select * from admin_ where ad_id='"+ id +"' and ad_password='"+pwd+"'");
			while(rs.next()) {
				admin.setID(rs.getString("ad_id"));
				admin.setPwd(rs.getString("ad_password"));
				admin.setState(rs.getInt("ad_state"));
				if (0 == rs.getInt("ad_state")) {
					int i = DBconn.sqlOperation("update admin_ set ad_state=1 where ad_id='"+id+"'");
					if (i>0) {
						admin.setState(rs.getInt("ad_state"));
						flag = true;
					}
				}else {
					flag = false;
				}
				
			}
			DBconn.closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public boolean logout(String id) {
		boolean flag = false;
		
		try {
			DBconn.getConnection();
			ResultSet rs = DBconn.select("select * from admin_ where ad_id='"+ id +"'");
			
			while(rs.next()) {
				if (1 == rs.getInt("ad_state")) {
					
					int i = DBconn.sqlOperation("update admin_ set ad_state=0 where ad_id='"+id+"'");
					if(i>0) {
						flag = true;
					}
				}else {
					flag = false;
				}
			}
			
			DBconn.closeConnection();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return flag;
	}

	@Override
	public boolean changePwd(String id, String pwd) {
		
		boolean flag = false;
		DBconn.getConnection();
		String str = "update admin_ set ad_password='"+pwd+"' where ad_id='"+id+"'";
		//System.out.println(str);  ��ʾupdate���
		int i = DBconn.sqlOperation(str);
		if(i>0) {
			flag = true;
		}
		DBconn.closeConnection();
		return flag;
	}

	@Override
	public List<Admin> getAllAdmin() {
		List<Admin> list = new ArrayList<Admin>();
		try {
			DBconn.getConnection();
			ResultSet rs = DBconn.select("select * from admin_");
			while(rs.next()) {
				Admin ad = new Admin();
				ad.setID(rs.getString("ad_id"));
				ad.setPwd(rs.getString("ad_password"));
				ad.setState(rs.getInt("ad_state"));
				list.add(ad);
			}
			DBconn.closeConnection();
			return list;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return null;
	}

}
