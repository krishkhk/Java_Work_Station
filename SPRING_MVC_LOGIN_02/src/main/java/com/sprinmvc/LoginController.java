package com.sprinmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/link")

	public String verifyUnamePaswd(HttpServletRequest request, Model model) {

		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		String msg = "";
		if (name.equals("krishna") && pwd.equals("hari@123")) {
			msg = " Valid Data";
			model.addAttribute("msg", msg);
		} else {
			msg = "Undefined Data";
			model.addAttribute("msg", msg);
		}

		return "result.jsp";

	}
}
