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

}
