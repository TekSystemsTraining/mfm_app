package com.mfm_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfm_app.entities.Workout;
import com.mfm_app.repo.WorkoutRepository;

@Service
public class WorkoutService {
	
	@Autowired
	WorkoutRepository wr;

	public int add_workout(Workout workout)
	{
		int return_value = 0;
		try {
			wr.save(workout);
			System.out.println("workout Id" + workout.getId());
			return_value = workout.getId();
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return return_value;
	}
	
	public Workout get_workout_by_id(int id) {
		return wr.getWorkoutById(id);
	}
}
