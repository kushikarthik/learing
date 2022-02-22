package Createcalculator;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		int num1,num2;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("choose the operator");
		 System.out.println("Additon-a: Subtraction-b: Multiplication-m: Division-d:");
		 char ch=sc.next().charAt(0);
		 System.out.println("enter value of num1:");
		 num1=sc.nextInt();
		 System.out.println("enter value of num2:");
		 num2=sc.nextInt();
		 switch (ch) {
		 case 'a':
		 System.out.println("addition of two number is:"+(num1+num2));
		 break;
		 case 'b':
		 System.out.println("substraction of two number is:"+(num1-num2));
	     break;
		 case 'm':
		 System.out.println("mulplication of two number is:"+(num1*num2));
	     break;
		 case 'd':
		 System.out.println("division of two number is:"+(num1/num2));
	     break;
	     default:
	    	 System.out.println("invalid");
	    	 break;
		 }
	}

}
