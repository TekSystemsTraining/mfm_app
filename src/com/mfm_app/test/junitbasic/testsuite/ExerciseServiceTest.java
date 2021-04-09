package com.mfm_app.test.junitbasic.testsuite;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

import com.mfm_app.entities.Exercise;
import com.mfm_app.services.ExerciseService;


public class ExerciseServiceTest {

	ExerciseService es = new ExerciseService();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testGetAllExercises() {
		String[] exercises = es.get_all_exercises();
		List<String> list = new ArrayList<>(Arrays.asList(exercises));
		String expectedName = "bench press";
		
		
		Assert.assertTrue(list.contains(expectedName));
	}
	
//	void testGetStudentByEmail() {
//		//given 
//		Student testStudent = new Student();
//		String expectedName = "Sonnnie Bowden";
//		testStudent = student_service.getStudentByEmail("sbowden1@yellowbook.com");
//		//When
//		String actual_name= testStudent.getsName();
//		
//		//then
//		System.out.println("Test start");
//		Assert.assertEquals(expectedName, actual_name);
//		System.out.println("test done");
}
