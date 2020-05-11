package com.revature.p0.test;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.p0.Student;
import com.revature.p0.exception.TuitionLessThanZeroException;


public class UserTest {

	
	private Student student;
	private static final int MIN_TUITION = 0;
	
	
	@BeforeClass 
	public static void setUpBeforeClass() throws Exception {
		
	}
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}
	
	@Before
	public void setUp() throws Exception {
		student = new Student();
		student.enroll();
	}
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void enroll(){
		//Don't even know where to begin here. Need to go over this part again. 
		
	}
	@Test(expected = TuitionLessThanZeroException.class)
	public void testTuitionShowingNegative() throws TuitionShowingNegativeException {
		student.seeBalance();
	}

	

// make it so that students can not have a negative tuition. 
}

