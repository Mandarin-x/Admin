/*
 * Class function£ºSave librarian information
 * Author: Zhou Yi
 * Date: March 26, 2020
 */

package com.entity;

public class Librarian {

	private String id;
	private String password;
	private int state;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString(){
		return "[id: "+ id +", password: "+password+", state:"+state+"]";
	}
}
