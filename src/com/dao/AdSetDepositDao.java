/*
 * Class function: update the deposit in the database,
 *                 dudge whether it is an integer
 * Author: Zhou Yi
 * Date: April 03, 2020
 */

package com.dao;

public interface AdSetDepositDao {

	public String Adid();
	public int GetDeposit();
	public boolean SetDeposit(int deposit);
	public boolean isNum(String s);
}
