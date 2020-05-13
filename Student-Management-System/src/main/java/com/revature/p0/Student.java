package com.revature.p0;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable{
// We'll enter the basic fields for our students. 
	private String firstName;
	private String lastName;
	private int Year;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costPerClass = 500;
	private static int id = 20;
	
	
	// have the students enter the information into our system and the scanner will read it. 
	public Student() {// Greeting and get info from the user. 
		Scanner in = new Scanner(System.in);
		System.out.println("Hello student! Please enter your first name: ");
		this.firstName = in.nextLine();// scan the first name. 
		
		System.out.println("Thank you! Please enter your last name: ");
		this.lastName = in.nextLine(); // scan the last name. 
		
		System.out.println("Please enter your grade level: \n1- Freshman \n2- Sophomore \n3- Junior \n4- Senior");
		this.Year = in.nextInt();
		
		setstudentID();
		
	}		
	
	// Make a log in screen. 


	// generate an ID number. 

	private void setstudentID() {
		id++;
		// grade level and ID. 
		this.studentID = Year + ""+ id;
	
	}
	
	//Enroll in various courses. Create a method with a loop for enrolling in courses. 
	public void enroll() {
		
		// put into a loop so it repeats the process until the user quits with X. 
	do {	
		System.out.println("Enter the courses that you would like to enroll in:  (Type X to quit) ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.equals("x")) {
			courses = courses + "\n  " + course;
			tuitionBalance += costPerClass;	
		}
		else {
			
			break;
		}
	} while (1 != 0);
	
	}		
	
	// method for the student to pay tuition. 
	public void seeBalance() {
		System.out.println("Your current tuition balance is $" +tuitionBalance);
	}
	public void payTuition() {
		seeBalance();
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("You've paid $" + payment);
		if (tuitionBalance < 0) {
			System.out.println("Warning: tuition cannot be negative!");
		} 
		if (tuitionBalance > 0) {
		seeBalance();
		}
	}
	// show status- 
	public String showInfo() {
		return "Name: " + firstName + " " + lastName +
				"\nStudent ID: " + Year + id +
				"\nCourses Enrolled: "+ courses + 
				"\nTuition Balance: $ " + tuitionBalance;
	}
	
	
	public static void writeToFile(Student stu1) throws FileNotFoundException, IOException{
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("member.txt"));
		
		objectOutputStream.writeObject(stu1);
	}
	public static void readFile() {
		
	}
		}
