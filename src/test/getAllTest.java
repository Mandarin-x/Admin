package test;

import java.util.ArrayList;
import java.util.List;

import com.controller.AdminController;
import com.dao.AdminDao;
import com.dao.AdminDaoImpl;
import com.entity.Admin;

public class getAllTest {

	public static void main(String[] args) {
		AdminDao ad = new AdminDaoImpl();
		AdminController ac = new AdminController();
		List<Admin> list = ad.getAllAdmin();
		for(int i = 0;i < list.size() ; i++) {
			System.out.println(list.get(i).getID()+" "+list.get(i).getPwd()+" "+list.get(i).getState());
		}
		
			
	}
	
}
