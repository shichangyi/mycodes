package com.test.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.domain.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/login")
	public ModelAndView login1(User user) {
		System.out.println("用户正在登录.............");
		System.out.println("用户名:" + user.getUsername());
		System.out.println("密    码:" + user.getPassword());
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "登录成功啦");
		mv.addObject("user", user);
		mv.setViewName("message");
		return mv;
	}
}
