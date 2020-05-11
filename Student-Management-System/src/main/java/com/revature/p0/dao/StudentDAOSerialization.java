package com.revature.p0.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.revature.p0.Student;


public class StudentDAOSerialization implements StudentDAO{
	
	public boolean saveStudent(Student stu1) throws IOException {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
	try {
		fos = new FileOutputStream(stu1.showInfo());
		oos = new ObjectOutputStream(fos);
		oos.writeObject(stu1);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		return (Boolean) null;
	} finally {
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
			return (Boolean) null;
		}
		
		try {
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	return true;
	}

	public Student getStudent(String Student) {
		// TODO Auto-generated method stub
		return null;
	}	
	


}
