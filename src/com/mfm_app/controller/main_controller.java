package com.mfm_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class main_controller {
	
	@RequestMapping({"/", "/landing_page"})
	public ModelAndView welcome() {
		ModelAndView mav = new ModelAndView("landing_page");
		return mav;
	}
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	@RequestMapping("/profile_page")
	public ModelAndView profile_page() {
		ModelAndView mav = new ModelAndView("profile_page");
		return mav;
	}
	
	@RequestMapping("/workout")
	public ModelAndView workout() {
		ModelAndView mav = new ModelAndView("workout");
		return mav;
	}
	
	@RequestMapping("/leaderboard")
	public ModelAndView leaderboard() {
		ModelAndView mav = new ModelAndView("leaderboard");
		return mav;
	}

	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}
}
