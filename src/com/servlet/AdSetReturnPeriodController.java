/*
 * Class function: implements the interface of business logic layer,
 *  and returns whether the modification is successful
 * Created by: Shan Shan
 * Creation time: April 2, 2020
 */
package com.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.AdSetReturnPeriodDaoImp;


//Spring��ע�⣻@Controller�ͱ�ʾ����һ��servlet

@Controller
//@RequestMapping("jsps")
public class AdSetReturnPeriodController {
	//������������ַ:/AdSetReturnPeriod/jsps/AdSetReturnPeriod.htm
	@RequestMapping("AdSetReturnPeriod")
	public ModelAndView Update(HttpServletRequest req,HttpServletResponse resp) {
		
		ModelAndView mv = new ModelAndView("AdSetReturnPeriod");//��ת��AdSetReturnPeriod.jsp���ҳ��

		AdSetReturnPeriodDaoImp sd = new AdSetReturnPeriodDaoImp();
		String returntime_string = req.getParameter("returntime");//��ȡ�µĻ���ʱ��
		
		int i=sd.gettime();
		mv.addObject("i",i);
		if(returntime_string==null) {
			return mv;	
		} 
		else if(returntime_string=="")
		{
			mv.addObject("isitexist",-1);
			return mv;
		}
		int returntime = Integer.parseInt(returntime_string); 

		if(sd.update(returntime)){
				mv.addObject("isitexist",1);//����ֵ����ǰ��

		}else{
				mv.addObject("isitexist",0);
			}
		System.out.println("------------------------------------");
		
		return mv;
	}
}
