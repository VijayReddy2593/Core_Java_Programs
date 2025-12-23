package com.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		File f=new File("C:\\raw data\\vijay2.text");
		
		if(f.exists()) {
			System.out.println("File already exists");
		}else {
			f.createNewFile();
			System.out.println("File Created successfully");
		}
		
		System.out.println("Writing into the file");
		FileWriter fw=new FileWriter("C:\\raw data\\vijay2.text");
		fw.write("1. What happens if we don't close a file?\r\n"
				
				+ "Memory leak, file corruption, data not saved properly.\r\n"
				+ "\r\n"
				+ "2. Why FileReader throws FileNotFoundException?\r\n"
				
				+ "Because file may not exist → compiler forces handling.\r\n"
				+ "\r\n"
				+ "3. Can FileInputStream read both text & binary files?\r\n"
				
				+ "YES. It reads bytes, so it works for all file types.\r\n"
				+ "\r\n"
				+ "4. What is EOF?\r\n"
				
				+ "End Of File — no more data to read.\r\n"
				+ "\r\n"
				+ "5. How do you handle IOException?\r\n"
				
				+ "Using try-catch or throws.\r\n"
				+ "\r\n"
				+ "6. Difference between FileWriter and BufferedWriter.\r\n"
				
				+ "FileWriter → writes directly\r\n"
			
				+ "BufferedWriter → faster, writes in chunks, supports newLine()\r\n"
				+ "\r\n"
				+ "7. What is flush()?\r\n"
				
				+ "Forces writing of remaining data to file.\r\n"
				+ "\r\n"
				+ "8. How do you append without deleting data?");
        fw.close();
        
        System.out.println("Writing completed");
        
        System.out.println("Reading from the file");
        FileReader fr=new FileReader("C:\\raw data\\vijay2.text");
        int ch;
        while((ch=fr.read())!=-1) {
        	System.out.print((char)ch);
        	Thread.sleep(50);
        }
	}

}
