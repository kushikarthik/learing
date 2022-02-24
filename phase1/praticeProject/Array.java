package com.project.email;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	
	ArrayList <String> email = new ArrayList<String>();
	email.add("karthik@gmail.com");
	email.add("sai@gmail.com");
	email.add("gopi@gmail.com");
	email.add("yashu@gmail.com");
	email.add("sahithi@gmai.com");
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter email id" );
	  String b = sc.nextLine();
	     if (email.contains(b))
	  {
		  System.out.println( " email is valid " +b);
	  }
	  else
	  {
	    System.out.println( " email is invalid " +b);
	  }
	}
}
	
