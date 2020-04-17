/*
 * Class function: set margin page Jump, receive and return front-end data
 * Author: Zhou Yi
 * Date: April 03, 2020
 */

package com.servlet;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.AdSetDepositDao;
import com.dao.AdSetDepositDaoImpl;

@Controller
public class AdSetDepositController {

	AdSetDepositDao setd = new AdSetDepositDaoImpl();
	
	/* request Address: /Admin/AdSetDepositre.htm */
	@RequestMapping("AdSetDepositre")
	public ModelAndView set(HttpServletRequest re) {
		
		ModelAndView set = new ModelAndView("AdSetDepositre");
		
		boolean i = false;
		String s= re.getParameter("deposit");
		boolean isNum = setd.isNum(s);
		if (isNum) {
			i = setd.SetDeposit(new Integer(s));
		}
		set.addObject("flag",i);
		return set;
	}

	/* request Address: /Admin/AdSetDeposit.htm */
	@RequestMapping("AdSetDeposit")
	public ModelAndView setd(HttpServletRequest re) {
		
		ModelAndView set = new ModelAndView("AdSetDeposit");
		int olddeposit = setd.GetDeposit();
		set.addObject("olddeposit", olddeposit);
		
		return set;
	}
}
