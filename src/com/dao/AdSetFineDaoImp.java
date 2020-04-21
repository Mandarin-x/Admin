/*
*Class function: modify the default return period in the database
*Created by: Shan Shan
*Creation time: April 2, 2020
 */
package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.util.DBconn;

public class AdSetFineDaoImp implements AdSetFineDao{
	
	private static final Logger logger = LogManager.getLogger(AdSetFineDaoImp.class);
	
	public String Adid() {
			
			String sql = "select * from admin_ where ad_state=1 ";
			String admin = new String();
			try {
	            	DBconn.init();
	            	ResultSet rs = DBconn.selectSql(sql);
	            	while(rs.next()) {
	            		admin = rs.getString("ad_id");
	            	}
				} catch (SQLException e) {
					e.printStackTrace();
				}
	            return admin;
		}	
	
	
	
	/*修改罚金*/
	public boolean reset_fine(int new_fine) {
		boolean flag=false;
		DBconn.init();
		
		String sql ="update systems set sys_fine="+new_fine;
		System.out.println(sql);
		int i =DBconn.addUpdDel(sql);
		if(i>0){
			flag = true;
			String admin = Adid();
			logger.info("[ADMIN]ID:"+admin+"new fine is "+new_fine);
		}	
		DBconn.closeConn();
		return flag;
	}
	
	/*查询当前fine*/
	public int getfine() {
		
		int fine = 0;
		String sql = "select * from systems" ;
		
		try {
			DBconn.init();
			ResultSet rs = DBconn.selectSql(sql);
			while(rs.next()) {
				fine = rs.getInt("sys_fine");
			}
			DBconn.closeConn();
			return fine;
		} catch (SQLException e) {
			e.printStackTrace();
			return fine;
		}
	}
}

