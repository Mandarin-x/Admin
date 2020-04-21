/*
 * Class function: register li account, insert database
 * Author: Wang kexin
 * Date: March 26, 2020
 */

package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.entity.Admin;
import com.util.DBconn;

public class AdRegisterDaoImpl implements AdRegisterDao {
	public boolean register(String id, String qus, String ans) {
		boolean flag = false;
		String password = "01001";
		DBconn.init();
		String str = "INSERT INTO librarian"+ " " + "VALUES" +" (" +"'" + id +"', '" + password + "', '0', '" + qus+"', '"+ans+"')";
		int i = DBconn.addUpdDel(str);
		if(i>0) {
			flag = true;
		}
		DBconn.closeConn();
		return flag;
	}

}
