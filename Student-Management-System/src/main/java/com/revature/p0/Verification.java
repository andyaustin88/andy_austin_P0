package com.revature.p0;

import java.io.File;
import java.util.Scanner;

public class Verification {

	private static Scanner x;
	
	public static void main(String[] args) {
		
		
		String username = "AndrewSaah";
		String password = "198810";
		String filepath = "members.txt";
		
		verifyLogin(username, password, filepath);

	}
	public static void verifyLogin(String username, String password, String filepath)
	{
		boolean found = false;
		String tempUsername = "";
		String tempPassword = "";
		
		try 
		{
			x = new Scanner(new File(filepath));
			x.useDelimiter("[,\n]");
			
			while(x.hasNext() && !found) 
			{
				tempUsername = x.next();
				tempPassword = x.next();
				
				if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().contentEquals(password.trim())); 
				{
					found = true;
				}
			}
			x.close();
			System.out.println("Logging in...");
			System.out.println("\nWelcome to Student Management System!");
		}
		catch (Exception e)
		{
			System.out.println("Error!");
		}
	}
}
