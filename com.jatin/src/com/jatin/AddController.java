package com.jatin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) 
	{
		int n=Integer.parseInt(request.getParameter("t1"));
		int n1=Integer.parseInt(request.getParameter("t2"));
		int n3=n+n1;
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result",n3);
		return mv;
	}
}
