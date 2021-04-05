package com.mfm_app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mfm_app.entities.Exercise;
import com.mfm_app.entities.User;
import com.mfm_app.services.ExerciseService;
import com.mfm_app.services.UserService;

@Controller
public class main_controller {

	@Autowired
	private UserService user_service;

	@Autowired
	private ExerciseService exercise_service;

	@RequestMapping({ "/", "/landing_page" })
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
	public String profile_page() {
		return "profile_page";
	}

	@RequestMapping("/workout")
	public ModelAndView workout() {
		ModelAndView mav = new ModelAndView("workout");
		String[] all_exercises = exercise_service.get_all_exercises();
		mav.addObject("exercises", all_exercises);
		return mav;
	}

	@RequestMapping("/leaderboard")
	public ModelAndView leaderboard() {
		ModelAndView mav = new ModelAndView("leaderboard");
		return mav;
	}

	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	@RequestMapping("/registerUser")
	public ModelAndView registerUser(@ModelAttribute User user) {
		ModelAndView mav = new ModelAndView();
		User register_user = new User();
		register_user.setUsername(user.getUsername());
		register_user.setPassword(user.getPassword());

		try {
			user_service.add_user(register_user);
			mav.setViewName("profile_page");
		} catch (Exception e) {
			e.printStackTrace();
		}
		mav.addObject("user", register_user);
		return mav;
	}

	@RequestMapping("/verify_login")
	public ModelAndView verify_login(@ModelAttribute User user) {
		ModelAndView mav = new ModelAndView();
		User login_user = new User();

		try {
			login_user = user_service.login_user(user.getUsername(), user.getPassword());
			System.out.println("controller user: " + login_user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (login_user == null) {
			mav.setViewName("login");
			mav.addObject("error", "Login failed, please try again");
			return mav;
		} else {
			mav.addObject("user", login_user);
			mav.setViewName("profile_page");
			return mav;
		}
	}

}
