package com.revature.p0.dao;

import java.io.IOException;

import com.revature.p0.Student;

public interface StudentDAO {
	
	public boolean saveStudent(Student stu1) throws IOException;
	
	public Student getStudent(String Student);

}
