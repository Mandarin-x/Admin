package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.dao.AdminDao;
import com.dao.AdminDaoImpl;
import com.entity.Admin;

@Controller
public class AdminController {

	private static final Logger logger = LogManager.getLogger(AdminController.class.getName());
	
	@RequestMapping("/login")
	@ResponseBody
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("login");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println("id: "+id+" pwd:"+pwd);
		AdminDao adminDaoImpl = new AdminDaoImpl();
		List<Admin> list = new ArrayList<Admin>();
		list = adminDaoImpl.getAllAdmin();
		
		boolean rs = adminDaoImpl.login(id, pwd);
		logger.info("id: "+id+" pwd: "+pwd);
		//JSONObject json = new JSONObject();
		if(rs == true) {
			//json.put("result", "success"); 
			mv.addObject("list", list);
			mv.setViewName("success");
		}else {
			//json.put("result", "error");
			mv.setViewName("error");
		}
		return mv;
	}
	
	@RequestMapping("/logout")
	@ResponseBody
	public ModelAndView logout(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("logout");
		String id =request.getParameter("id");
		AdminDao adminDaoImpl = new AdminDaoImpl();
		boolean rs = adminDaoImpl.logout(id);
		logger.info("id: "+id);
		//JSONObject json = new JSONObject();
		if(rs == true) {
			//json.put("result", "success"); 
			mv.setViewName("login");
			
		}else {
			//json.put("result", "error");
			mv.setViewName("error");
		}
		return mv;
	}
	
	@RequestMapping("/ChangePwd")
	@ResponseBody
	public ModelAndView ChangePwd(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView mv = new ModelAndView("ChangePwd");
		String id =request.getParameter("id");
		String pwd1 = request.getParameter("pwd1");
		String pwd2 = request.getParameter("pwd2");
		AdminDao adminDaoImpl = new AdminDaoImpl();
		logger.info("id: "+id+" pwd1: "+pwd1+" pwd2: "+pwd2);
		//JSONObject json = new JSONObject();
		if (pwd1.equals(pwd2)) {
			boolean rs = adminDaoImpl.changePwd(id, pwd1);
			if(rs == true) {
				//json.put("result", "success"); 
				mv.setViewName("login");
			}else {
				//json.put("result", "error");
				mv.setViewName("error");
			}
		}else {
			//json.put("result", "password different");
			mv.setViewName("pwdDifferente");
		}
		return mv;
		
	}
	
}
