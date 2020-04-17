/*
 * Class function: update the deposit in the database
 * Author: Zhou Yi
 * Date: March 26, 2020
 */

package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.entity.Librarian;
import com.entity.Require;
import com.util.DBconn;

public class AdSearchAndManageLibrarianDaoImpl implements AdSearchAndManageLibrarianDao {

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
	 * Query all accounts
	 */

	public List<Librarian> QueryAllLi() {
		
		List<Librarian> librarians = new ArrayList<Librarian>();
		
		String sql = "select * from librarian" ;
		
		try {
			DBconn.init();
			ResultSet rs = DBconn.selectSql(sql);
			while(rs.next()) {
				Librarian Li = new Librarian();
				Li.setId(rs.getString("li_id"));
				Li.setPassword(rs.getString("li_password"));
				Li.setState(rs.getInt("li_state"));
				librarians.add(Li);
			}
			DBconn.closeConn();
			return librarians;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	/*
	 * Delete account with id
	 */

	public boolean DelLi(String id) {

		boolean flag = false;
		DBconn.init();
		String sql="delete from librarian where li_id='"+id+"'";
		int i = DBconn.addUpdDel(sql);
		if(i>0){
			flag = true;
			String admin = Adid();
			logger.info("[ADMIN]ID:" + admin + "   " + "delete the librarian '" + id +"' successfully.");
		}else {
			String admin = Adid();
			logger.info("[ADMIN]ID:" + admin + "   " + "delete the librarian '" + id +"' failed.");
		}
		DBconn.closeConn();
		return flag;
	}

	
	/*
	 * Query requirement
	 */

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

	/*
	 * attach account and require
	 */

	public Require QueryRe(String id) {
		
		Require re = new Require();
		String sql = "select * from li_require where id='"+id+"'";
		
		try {
			DBconn.init();
			ResultSet rs = DBconn.selectSql(sql);
			while(rs.next()) {
				re.setId(rs.getString("id"));
				re.setPassword(rs.getString("password"));
				re.setState(rs.getInt("state"));
			}
			DBconn.closeConn();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (re.getPassword()==null) {
			re.setState(2);
		}
		return re;
	}
	
	/*
	 * Edit account information
	 */

	public int EditLi(String id, String password) {

		AdSearchAndManageLibrarianDao te = new AdSearchAndManageLibrarianDaoImpl();
		int flag = 0;
		Require require = te.QueryRe(id);
		int i = 0;
		DBconn.init();
		String sql="update librarian set li_password ='"+password+"' where li_id ='"+id+"'";
		
		if (require.getState()==0) {
			if(require.getPassword()==password ) {
				i = DBconn.addUpdDel(sql);
			}else {
				flag = -2;
			}
		}else {
			flag = -1;
		}
	
		if(i>0){
			flag = 1;
			String sql1="update li_require set state = 1 where id ='"+id+"'";
			DBconn.addUpdDel(sql1);
			String admin = Adid();
			logger.info("[ADMIN]ID:" + admin + "   " + "edit the librarian '" + id +"' successfully.");
		}else {
			String admin = Adid();
			logger.info("[ADMIN]ID:" + admin + "   " + "edit the librarian '" + id +"' failed.");
		}
		DBconn.closeConn();
		return flag;
	}


}
