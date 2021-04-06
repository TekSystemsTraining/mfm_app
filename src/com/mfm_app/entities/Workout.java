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
	
	@Column(name = "exercises_completed")
	private String[] exercises_completed;

	public Workout() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Workout(int id, Date date_of_workout, Double total_weight_lifted, String[] exercises_completed) {
		super();
		this.id = id;
		this.date_of_workout = date_of_workout;
		this.total_weight_lifted = total_weight_lifted;
		this.exercises_completed = exercises_completed;
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

	public String[] getExercises_completed() {
		return exercises_completed;
	}

	public void setExercises_completed(String[] exercises_completed) {
		this.exercises_completed = exercises_completed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date_of_workout == null) ? 0 : date_of_workout.hashCode());
		result = prime * result + Arrays.hashCode(exercises_completed);
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
		if (!Arrays.equals(exercises_completed, other.exercises_completed))
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
				+ total_weight_lifted + ", exercises_completed=" + Arrays.toString(exercises_completed) + "]";
	}
	
	
}
