package com.mfm_app.entities;

import java.util.Arrays;
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
	
	@Column(name = "exercise_one_completed")
	private String exercise_one_completed;
	
	@Column(name = "exercise_two_completed")
	private String exercise_two_completed;
	
	@Column(name = "exercise_three_completed")
	private String exercise_three_completed;

	public Workout() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Workout(int id, Date date_of_workout, Double total_weight_lifted, String exercise_one_completed,
			String exercise_two_completed, String exercise_three_completed) {
		super();
		this.id = id;
		this.date_of_workout = date_of_workout;
		this.total_weight_lifted = total_weight_lifted;
		this.exercise_one_completed = exercise_one_completed;
		this.exercise_two_completed = exercise_two_completed;
		this.exercise_three_completed = exercise_three_completed;
	}



	public String getExercise_one_completed() {
		return exercise_one_completed;
	}



	public void setExercise_one_completed(String exercise_one_completed) {
		this.exercise_one_completed = exercise_one_completed;
	}



	public String getExercise_two_completed() {
		return exercise_two_completed;
	}



	public void setExercise_two_completed(String exercise_two_completed) {
		this.exercise_two_completed = exercise_two_completed;
	}



	public String getExercise_three_completed() {
		return exercise_three_completed;
	}



	public void setExercise_three_completed(String exercise_three_completed) {
		this.exercise_three_completed = exercise_three_completed;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate_of_workout() {
		return date_of_workout;
	}

	public void setDate_of_workout(Date date_of_workout) {
		this.date_of_workout = date_of_workout;
	}

	public Double getTotal_weight_lifted() {
		return total_weight_lifted;
	}

	public void setTotal_weight_lifted(Double total_weight_lifted) {
		this.total_weight_lifted = total_weight_lifted;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date_of_workout == null) ? 0 : date_of_workout.hashCode());
		result = prime * result + ((exercise_one_completed == null) ? 0 : exercise_one_completed.hashCode());
		result = prime * result + ((exercise_three_completed == null) ? 0 : exercise_three_completed.hashCode());
		result = prime * result + ((exercise_two_completed == null) ? 0 : exercise_two_completed.hashCode());
		result = prime * result + id;
		result = prime * result + ((total_weight_lifted == null) ? 0 : total_weight_lifted.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Workout other = (Workout) obj;
		if (date_of_workout == null) {
			if (other.date_of_workout != null)
				return false;
		} else if (!date_of_workout.equals(other.date_of_workout))
			return false;
		if (exercise_one_completed == null) {
			if (other.exercise_one_completed != null)
				return false;
		} else if (!exercise_one_completed.equals(other.exercise_one_completed))
			return false;
		if (exercise_three_completed == null) {
			if (other.exercise_three_completed != null)
				return false;
		} else if (!exercise_three_completed.equals(other.exercise_three_completed))
			return false;
		if (exercise_two_completed == null) {
			if (other.exercise_two_completed != null)
				return false;
		} else if (!exercise_two_completed.equals(other.exercise_two_completed))
			return false;
		if (id != other.id)
			return false;
		if (total_weight_lifted == null) {
			if (other.total_weight_lifted != null)
				return false;
		} else if (!total_weight_lifted.equals(other.total_weight_lifted))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Workout [id=" + id + ", date_of_workout=" + date_of_workout + ", total_weight_lifted="
				+ total_weight_lifted + ", exercise_one_completed=" + exercise_one_completed
				+ ", exercise_two_completed=" + exercise_two_completed + ", exercise_three_completed="
				+ exercise_three_completed + "]";
	}
	
}
