package com.springboot.thymelef.demo.model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/user")
	public String index()
	{
		return "index";
		
	}
	@RequestMapping(value="/save",method =RequestMethod.POST)
	public ModelAndView save(@ModelAttribute User user) {
		
		ModelAndView modelView=new ModelAndView();
		
		modelView.setViewName("details");
		modelView.addObject("user",user);
		
		return modelView;
		
		
		
	}

}
