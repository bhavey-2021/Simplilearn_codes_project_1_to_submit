package locker.back;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class MainMenu {
	  private String productName = "Welcome to LockMe!";
	  private String developerName = "Developer: Bhavey Malhotra";
	  int choice;
	  String u_N;
	  String u_n;
	public  String  unn;
	    Scanner sc=new Scanner(System.in);
	   
	    
	    public MainMenu()
	    {   
	        File myFile=new File("userpass.txt"); 		
		}
	    
	    public void introduction() throws IOException
	    {
	    	System.out.println(productName);
	        System.out.println(developerName);
	    	display();
	    }
	    public void display() throws IOException {
	    	System.out.println("Main Menu");
	        System.out.println("1. Show Current Files");
	        System.out.println("2. Register");
	        System.out.println("3. Login");
	        System.out.println("4. Exit");
	        Scanner sc=new Scanner(System.in);
		    int choice=sc.nextInt();
		    optionPicked(choice);
		    
	    }
	   
	    public void optionPicked(int choice) throws IOException {
	    

	        while(choice!= 4) {
	        	
	            this.options(choice);
	           
	        }
	        if(choice==4)
	        {
	        	System.exit(7);
	        }
	    }
	    public void options(int selected) throws IOException
	    {
	    	
	    	switch(selected)
	    	{
	    	case 1: // Show Files in Directory
                  	viewData();
                    display();
                    break;
	    	case 2:
	    		registration();
	    		display();
	    		break;
	    	case 3:
	    		login();
	    		display();
	    		
	    	break;
	    		
	    		
	    	 default:
	                System.out.println("Invalid Option");
	                display();
	                break;

	    }
	    
	    
}
	   
   }