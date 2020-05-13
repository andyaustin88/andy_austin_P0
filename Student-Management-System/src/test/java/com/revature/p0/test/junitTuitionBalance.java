package com.revature.p0.test;

import static org.junit.Assert.*;


import org.junit.Test;

import com.revature.p0.Tuition;

public class junitTuitionBalance {

	@Test
	public void junittutionbalancetest() {
		Tuition junit = new Tuition();
		int result = junit.subtract(200, 100);
		assertEquals(100, result); 	
	}

}
