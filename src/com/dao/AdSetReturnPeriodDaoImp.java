/*
*Class function: modify the default return period in the database
*Created by: Shan Shan
*Creation time: April 2, 2020
 */
package com.dao;	 

import com.util.DBconn;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class AdSetReturnPeriodDaoImp implements AdSetReturnPeriodDao{
	private static final Logger logger = LogManager.getLogger(AdSetReturnPeriodDaoImp.class);
	
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

	public boolean update(int returntime) {
		 
		boolean flag = false;

		DBconn.init();
		String sql ="update systems set sys_return_time="+returntime;
		System.out.println(sql);
		int i =DBconn.addUpdDel(sql);
		String admin = Adid();
		if(i>0){
			flag = true;

			logger.info("[ADMIN]ID:"+admin+"update successfully,the new return time is "+returntime);
			DBconn.closeConn();
			return flag;
		}
		DBconn.closeConn();
		logger.info("[ADMIN]ID:"+admin+"update failed");
		return flag;
	}
	
	/*≤È—Øµ±«∞period*/
	public int gettime() {
		
		int time = 0;
		String sql = "select * from systems" ;
		
		try {
			DBconn.init();
			ResultSet rs = DBconn.selectSql(sql);
			while(rs.next()) {
				time = rs.getInt("sys_return_time");
			}
			DBconn.closeConn();
			return time;
		} catch (SQLException e) {
			e.printStackTrace();
			return time;
		}
	}

}

