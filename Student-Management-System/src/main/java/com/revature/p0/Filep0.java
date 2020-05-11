package com.revature.p0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Filep0 {

	public static void main(String[] args) throws Exception{
		

		File f = new File("members.txt");
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream (fos);
		dos.writeUTF("Content");
		
		
		
		
		
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		System.out.println(str);
				
	}

}
