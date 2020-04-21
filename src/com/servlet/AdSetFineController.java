/*
 * Class function: implements the interface of business logic layer,
 *  and returns whether the modification is successful
 * Created by: Shan Shan
 * Creation time: April 2, 2020
 */
package com.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdSetFineDaoImp;

@Controller
//@RequestMapping("jsps")
public class AdSetFineController {
	//地址：/AdSetFine/jsps/AdSetFine.htm
	@RequestMapping("AdSetFine")
	public ModelAndView Update(HttpServletRequest req,HttpServletResponse resp) {
		
		ModelAndView mv = new ModelAndView("AdSetFine");//跳转到AdSetFine.jsp这个页面
		
		AdSetFineDaoImp fd=new AdSetFineDaoImp();
		String amount_string = req.getParameter("sys_fine");
		
		int i=fd.getfine();
		mv.addObject("i",i);		
		if(amount_string==null) {
			return mv;	
		} 
		else if(amount_string=="")
		{
			mv.addObject("isitexist",-1);
			return mv;
		}		
		int fi_amount = Integer.parseInt(amount_string);


		
		


		if(fd.reset_fine(fi_amount)==true)
			{
				mv.addObject("isitexist",1);//将该值传给前端
			}
			
		else {
				mv.addObject("isitexist",0);//将该值传给前端
			}
		return mv;
		
	}

}
