package com.mfm_app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfm_app.entities.User;
import com.mfm_app.entities.Workout;
import com.mfm_app.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository ur;
	
	@Autowired
	WorkoutService workout_service;

	public User add_user(User user) {
		
		try {
			ur.save(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return login_user(user.getUsername(), user.getPassword());
	}

	public User login_user(String username, String password) {
		User return_user = null;
		try {
			return_user = ur.getUserByUsername(username);
			System.out.println("Returned user: " + return_user);

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (return_user.getPassword().equals(password)) {
			return return_user;
		}
		return null;

	}

	public User update_user(User user, Long wId) {
		Workout update_workout = workout_service.get_workout_by_id(wId);		
		System.out.println("Uservice workout" + update_workout);
		user.getWorkouts_completed().add(update_workout);
		user.increase_total_weight_lifted(update_workout.getTotal_weight_lifted());
		user.increase_total_workouts();		
		ur.save(user);
		return user;
	}
	
	public List<User> get_all_users(){
		return ur.findAll();
	}

	public boolean update_user_bodyparts(List<String> exercises) {
		Boolean return_value = false;

		return return_value;
	}
}
