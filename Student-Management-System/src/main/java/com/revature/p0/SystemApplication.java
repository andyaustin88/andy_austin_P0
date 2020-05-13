package com.revature.p0;

import java.util.Scanner;

public class SystemApplication {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String username;
		String password;
		do {
		
		
		System.out.print("Enter your username: ");
		username = input.nextLine();
		
		
		System.out.print("Enter your password: ");
		password = input.nextLine();
		
		if (username.equals("andyaustin88") && (password.equals("Tigger"))) {
			System.out.println("Welcome to Student Management System!");
		}else {
			System.out.println("Access Denied: Incorrect Username or password.");
			
		}
		} 
		while (!username.equals("andyaustin88") && !password.equals("Tigger"));	
		
		Student stu1 = new Student();
		stu1.enroll();
		stu1.payTuition();
		System.out.println(stu1.showInfo());
		
		input.close();
	
		// Create some sign in feature for authentication. 
// arrange student files. What classes will they be enrolled in? 
	
	}
 // For database. Create a certain number of students and arrange them according to their classes and information. 
}
