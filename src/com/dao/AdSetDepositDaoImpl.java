/*
 * Class function: implement interface function
 * Author: Zhou Yi
 * Date: April 03, 2020
 */

package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.util.DBconn;

public class AdSetDepositDaoImpl implements AdSetDepositDao {

	/* save address: G://log/log */
	private static final Logger logger = LogManager.getLogger(AdSearchAndManageLibrarianDaoImpl.class);
	
	/*
	 * Query Admin id
	 */

	public String Adid() {
		
		String sql = "select * from admin where ad_state=1 ";
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
	
	/*
	 * Get current deposit
	 */

	public int GetDeposit() {
		
		int deposit = 0;
		String sql = "select * from systems" ;
		
		try {
			DBconn.init();
			ResultSet rs = DBconn.selectSql(sql);
			while(rs.next()) {
				deposit = rs.getInt("sys_deposit");
			}
			DBconn.closeConn();
			return deposit;
		} catch (SQLException e) {
			e.printStackTrace();
			return deposit;
		}
	}

	/*
	 * Set deposit
	 */

	public boolean SetDeposit(int deposit) {
		
		boolean flag = false;
		String sql = "update systems set sys_deposit = "+deposit;
		DBconn.init();
		int i = DBconn.addUpdDel(sql);
		if(i>0) {
			flag = true;
			String admin = Adid();
			logger.info("[ADMIN]ID:" + admin + "   " + "set the deposit as " +deposit+" successfully.");
		}else {
			String admin = Adid();
			logger.info("[ADMIN]ID:" + admin + "   " + "set the deposit as " +deposit+" failed.");
		}
		DBconn.closeConn();
		return flag;
	}

	/*
	 * Judge whether it is an integer
	 */

	public boolean isNum(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			String admin = Adid();
			logger.info("[ADMIN]ID:" + admin + "   " + "did not set the deposit as number so that fail.");
			return false;
		}
	}


}
