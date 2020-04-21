/*
 * Class function: realize query page Jump, receive and return front-end data
 * Author: Wangkexin
 * Date: 4 16, 2020
 */

package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.AdRecoverLibrarianDao;
import com.dao.AdRecoverLibrarianDaoImpl;


@Controller
public class AdRecoverController {

	AdRecoverLibrarianDao te = new AdRecoverLibrarianDaoImpl();
	

	
	
	/* request Address: /Admin/AdDeleteLi.htm */
	@RequestMapping("AdRecover")
	public ModelAndView recover(HttpServletRequest re, HttpServletResponse res) throws IOException, ServletException {
		
		ModelAndView recover = new ModelAndView("AdRecover");
		String id = re.getParameter("id");
		boolean i = te.RecoverLi(id);
		recover.addObject("flag", i);
		return recover;
	}

}
