package com.servlet;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.AdRegisterDaoImpl;

@Controller
public class AdregisterLiController {
	private static final Logger logger = LogManager.getLogger(AdminController.class.getName());
	
	//request address : /Admin3/ad-jsp/login.jsp
	@RequestMapping("/RegisterLi")
//	@ResponseBody
	public ModelAndView RegisterLi(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("AdRegister");
		
		String id = request.getParameter("id");
		String qus = request.getParameter("qus");
		String ans = request.getParameter("ans");
		if(id==null) {
			return mv;	
		} 
		System.out.println("id: "+id+" qus:"+qus+" ans:"+ans);
		AdRegisterDaoImpl te = new AdRegisterDaoImpl();
		boolean flag = te.register(id, qus, ans);
		if(flag) {
			logger.info("id: "+id+" qus:"+qus+" ans:"+ans+" Success");
		}
		else {
			logger.info("id: "+id+" qus:"+qus+" ans:"+ans+" Fail");
		}
		mv.addObject("flag", flag);
		
		//JSONObject json = new JSONObject();
		
		return mv;
	}

}
