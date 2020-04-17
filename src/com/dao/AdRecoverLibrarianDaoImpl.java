package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.entity.Require;
import com.util.DBconn;

public class AdRecoverLibrarianDaoImpl implements AdRecoverLibrarianDao {
	private static final Logger logger = LogManager.getLogger(AdSearchAndManageLibrarianDaoImpl.class);
	
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


	public boolean RecoverLi(String id) {
		boolean flag = false;
		String password = findPassword(id);
		DBconn.init();
		String sql="update li_require set password='"+password+"',state=1 where id='"+id+"'";
		int i = DBconn.addUpdDel(sql);
		if(i>0){
			flag = true;
			String admin = Adid();
			logger.info("[ADMIN]ID:" + admin + "   " + "recover the librarian '" + id +"' successfully.");
		}else {
			String admin = Adid();
			logger.info("[ADMIN]ID:" + admin + "   " + "recover the librarian '" + id +"' failed.");
		}
		DBconn.closeConn();
		return flag;
	}
	
	public String findPassword(String id) {

		String sql = "select li_password from librarian where li_id='"+id+"'";
		String password = new String();
		try {
            	DBconn.init();
            	ResultSet rs = DBconn.selectSql(sql);
            	while(rs.next()) {
            		password = rs.getString("li_password");
            	}
			} catch (SQLException e) {
				e.printStackTrace();
			}
            return password;
		
	}
	
	public List<Require> QueryAllRe() {
		
		List<Require> requires = new ArrayList<Require>();
		
		String sql = "select * from li_require where state = 0" ;
		
		try {
			DBconn.init();
			ResultSet rs = DBconn.selectSql(sql);
			while(rs.next()) {
				Require Re = new Require();
				Re.setId(rs.getString("id"));
				Re.setPassword(rs.getString("password"));
				Re.setState(rs.getInt("state"));
				requires.add(Re);
			}
			DBconn.closeConn();
			return requires;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}


