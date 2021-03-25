package com.mfm_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class main_controller {
	
	@RequestMapping("/")
	public ModelAndView welcome() {
		ModelAndView mav = new ModelAndView("welcome");
		return mav;
	}
	@RequestMapping("/moving_on")
	public ModelAndView moving_on() {
		ModelAndView mav = new ModelAndView("moving_on");
		return mav;
	}
	
}
