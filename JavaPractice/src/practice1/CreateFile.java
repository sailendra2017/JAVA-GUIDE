package practice1;

import java.util.Locale;  
import java.util.ResourceBundle;  
/**
 * 
 * @author sailendranath.m
 * @apiNote Sailendra
 * 
 *
 */
public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * File myObj = new File("filename.txt"); if (myObj.exists()) {
		 * System.out.println("File name: " + myObj.getName());
		 * System.out.println("Absolute path: " + myObj.getAbsolutePath());
		 * System.out.println("Writeable: " + myObj.canWrite());
		 * System.out.println("Readable " + myObj.canRead());
		 * System.out.println("File size in bytes " + myObj.length()); } else {
		 * System.out.println("The file does not exist."); }
		 */
		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", Locale.US);  
		  System.out.println("Message in "+Locale.US +":"+bundle.getString("greeting"));  
		  
		  //changing the default locale to indonasian   
		  Locale.setDefault(new Locale("in", "ID"));  
		  bundle = ResourceBundle.getBundle("MessageBundle");  
		  System.out.println("Message in "+Locale.getDefault()+":"+bundle.getString("greeting"));  
		  
	}

}
