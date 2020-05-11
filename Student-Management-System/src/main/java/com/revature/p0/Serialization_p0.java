package com.revature.p0;


import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization_p0 {

	public static void main(String[] args) throws Exception {
	
			Save obj = new Save();
			String AndrewSaah = null;
			obj.i = AndrewSaah;
			
			File f = new File("members.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream dos = new ObjectOutputStream (fos);
			
			
			
			
	}

}
