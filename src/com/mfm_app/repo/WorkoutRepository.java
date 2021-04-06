package com.mfm_app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mfm_app.entities.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Integer>{
	
	Workout getWorkoutById(Integer id);
	
}
