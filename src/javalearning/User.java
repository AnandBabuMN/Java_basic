package javalearning;

import java.io.File;
import java.io.IOException;

public class User {
	String userName = "Anand";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		 User user = new User();
//	        File file = new File("C:\\Admin");
//	        if(!file.exists()){
//	            file.mkdir();
//	            System.out.println("Central Work space created Successfully"); 
//	            File file1 = new File("C:\\Admin\\" +user.userName);
//		        file1.mkdir();
//		        System.out.println("Folder inside Admin created");
//	        }
		String path = System.getProperty("user.dir");
	
		File file = new File(path + "//file1.txt");
		file.createNewFile();
		System.out.println("File created"+file);
	        
	        
	        
	       

	}

}
