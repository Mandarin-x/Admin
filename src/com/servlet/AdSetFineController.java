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
public class AdSetFineController {
	//��ַ��/AdSetFine/jsps/AdSetFine.htm
	@RequestMapping("AdSetFine")
	public ModelAndView Update(HttpServletRequest req,HttpServletResponse resp) {
		
		ModelAndView mv = new ModelAndView("AdSetFine");//��ת��AdSetFine.jsp���ҳ��
		
		String amount_string = req.getParameter("sys_fine");

		if(amount_string==null) {
			return mv;	
		} 
		else if(amount_string=="")
		{
			mv.addObject("isitexist",-1);
			return mv;
		}
		
		int fi_amount = Integer.parseInt(amount_string);

		AdSetFineDaoImp fd=new AdSetFineDaoImp();

		if(fd.reset_fine(fi_amount)==true)
			{
				mv.addObject("isitexist",1);//����ֵ����ǰ��
			}
			
		else {
				mv.addObject("isitexist",0);//����ֵ����ǰ��
			}
		return mv;
		
	}

}
