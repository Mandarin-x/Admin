/*
 * Class function: realize query page Jump, receive and return front-end data
 * Author: Zhou Yi
 * Date: March 26, 2020
 */

package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.AdSearchAndManageLibrarianDao;
import com.dao.AdSearchAndManageLibrarianDaoImpl;
import com.entity.Librarian;
import com.entity.Require;

@Controller
public class AdSearchandManageController {

	AdSearchAndManageLibrarianDao te = new AdSearchAndManageLibrarianDaoImpl();
	
	/* request Address: /Admin/AdDisplayLi.htm */
	@RequestMapping("AdDisplayLi")
	public ModelAndView searchall(HttpServletRequest re, HttpServletResponse res) throws ServletException, IOException {
		
		ModelAndView mv = new ModelAndView("AdDisplayLi");
		
		
		List<Librarian> list = te.QueryAllLi();

		mv.addObject("list", list);
		
		
		return mv;
	}
	
	/* request Address: /Admin/AdDeleteLi.htm */
	@RequestMapping("AdDeleteLi")
	public ModelAndView del(HttpServletRequest re, HttpServletResponse res) throws IOException, ServletException {
		
		ModelAndView del = new ModelAndView("AdDeleteLi");
		
		String id = re.getParameter("id");
		boolean i = te.DelLi(id);
		
		del.addObject("flag",i);
		return del;
	}
	
	/* request Address: /Admin/AdDisplayRe.htm */
	@RequestMapping("AdDisplayRe")
	public ModelAndView displayre(HttpServletRequest re, HttpServletResponse res) throws ServletException, IOException {
		
		ModelAndView mv = new ModelAndView("AdDisplayRe");
		
		
		List<Require > list = te.QueryAllRe();

		mv.addObject("list", list);
		
		
		return mv;
	}
	
	/* request Address: /Admin/AdEditLire.htm */
	@RequestMapping("AdEditLire")
	public ModelAndView edit(HttpServletRequest re, HttpServletResponse res){
		
		ModelAndView edit = new ModelAndView("AdEditLire");
		
		String id = re.getParameter("id");
		String password = re.getParameter("password");

		int i = te.EditLi(id, password);
		edit.addObject("i",i);
	
		return edit;
	
	}
	


}
