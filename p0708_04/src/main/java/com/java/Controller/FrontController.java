package com.java.Controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FrontController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/member")
	public String member() {
		return "/member";
	}
	
	@RequestMapping("/doMember")
	public ModelAndView doForm(HttpServletRequest request) {
		System.out.println("id : "+ request.getParameter("id"));
		System.out.println("pw : "+ request.getParameter("pw"));
		System.out.println("name : "+ request.getParameter("name"));
		System.out.println("phone : "+ request.getParameter("phone"));
		System.out.println("gender : "+ request.getParameter("gender"));
		String[] hobby = request.getParameterValues("hobby");
		String hobbys = "";
		for(int i=0;i<hobby.length;i++) {
			if(i==0) hobbys += ""+hobby[i];
			else hobbys += ","+hobby[i];
		}
		System.out.println("hobbys: " +hobbys);
		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id",request.getParameter("id"));
		mv.addObject("pw",request.getParameter("pw"));
		mv.addObject("name",request.getParameter("name"));
		mv.addObject("phone",request.getParameter("phone"));
		mv.addObject("gender",request.getParameter("gender"));
		mv.addObject("hobby",hobbys);
		
		mv.setViewName("doMember");
		
		return mv;
	}
	
	@RequestMapping("/memUpdate") //회원정보수정
	public ModelAndView memUpdate(HttpServletRequest request) {
		System.out.println("id : "+ request.getParameter("id"));
		System.out.println("pw : "+ request.getParameter("pw"));
		System.out.println("name : "+ request.getParameter("name"));
		System.out.println("phone : "+ request.getParameter("phone"));
		System.out.println("gender : "+ request.getParameter("gender"));
		String[] hobby = request.getParameterValues("hobby");
		String hobbys = "";
		for(int i=0;i<hobby.length;i++) {
			if(i==0) hobbys += ""+hobby[i];
			else hobbys += ","+hobby[i];
		}
		System.out.println("hobbys: " +hobbys);
		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id",request.getParameter("id"));
		mv.addObject("pw",request.getParameter("pw"));
		mv.addObject("name",request.getParameter("name"));
		mv.addObject("phone",request.getParameter("phone"));
		mv.addObject("gender",request.getParameter("gender"));
		mv.addObject("hobby",hobbys);
		
		mv.setViewName("memUpdate");
		
		return mv;
	}
	
}
