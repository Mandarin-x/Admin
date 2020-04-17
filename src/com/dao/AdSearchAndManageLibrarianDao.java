/*
 * Class function: query, delete and update the database
 * Author: Zhou Yi
 * Date: March 26, 2020
 */

package com.dao;

import java.util.List;

import com.entity.Librarian;
import com.entity.Require;

public interface AdSearchAndManageLibrarianDao {

	public List<Require> QueryAllRe();
	public Require QueryRe(String id);
	public List<Librarian> QueryAllLi();
	public boolean DelLi(String id);
	public int EditLi(String id, String password);
	public String Adid(); 
}
