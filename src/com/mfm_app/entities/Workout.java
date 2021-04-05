package com.mfm_app.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Workouts")
public class Workout {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "date")
	private Date date_of_workout;
	
	@Column(name = "total_weight_lifted")
	private Double total_weight_lifted;
	
	@Column(name = "exercises_completed")
	@OneToMany(targetEntity=Exercise.class)
	private List<Exercise> exercises_completed;
}
