package com.dao;

import java.util.List;

import com.entity.Admin;

public interface AdminDao {

	public boolean login(String id, String pwd);
	public boolean logout(String id);
	public boolean changePwd(String id, String pwd);
	public List<Admin> getAllAdmin();
}
