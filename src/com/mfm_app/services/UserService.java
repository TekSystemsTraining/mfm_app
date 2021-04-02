package com.mfm_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfm_app.entities.User;
import com.mfm_app.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository ur;
	
	public boolean add_user(User user) {
		boolean return_value =false;
		try {
			ur.save(user);

			return_value = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return return_value;
	}
	
	public User login_user(String username, String password) {
		User return_user = null;
		try {
			return_user = ur.getUserByUsername(username);
			System.out.println("Returned user: " + return_user);

		}catch(Exception e) {
			e.printStackTrace();
		}
		if(return_user.getPassword().equals(password)) {
			return return_user;
		}	
		return null;
		
	}
}
