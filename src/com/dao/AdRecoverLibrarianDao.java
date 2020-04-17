
package com.dao;

import java.util.List;

import com.entity.Require;

public interface AdRecoverLibrarianDao {
	public List<Require> QueryAllRe();
	public boolean RecoverLi(String id);
}

