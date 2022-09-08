package com.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeController {
	
	@RequestMapping("/loadForm")
	
	public String loadForm(Model model) {
		Employee emp=new Employee();
		model.addAttribute("emp",emp);
	return "employe.jsp";
		
	}
	@RequestMapping("/insert")
	public String handleForm(@ModelAttribute("emp")Employee emp) {
		return "result.jsp";
	}
}


