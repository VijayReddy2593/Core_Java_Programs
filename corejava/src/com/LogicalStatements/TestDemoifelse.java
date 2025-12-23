package com.LogicalStatements;

import java.util.Scanner;

public class TestDemoifelse {
	 static double bonus;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		

		System.out.println("Enter your monthly salary:");
		double salary = sc.nextDouble();

		System.out.println("Enter your experience in years:");
		int exp = sc.nextInt();
	    
		//double bonus;
		 if(exp<2 && exp>=1) {
			 
		    bonus=salary*5/100;
		 }
		else if(exp>=2 && exp<5) {
			
			bonus=salary*10/100;
			
		}
		else if(exp>=5 && exp<10) {
			
			bonus=salary*15/100;
		}
		else if(exp>=10) {
			
			bonus=salary*20/100;
		}
		else {
			System.out.println("No bonus is given due to no experience");
		
		}
		double total_salary=salary+bonus;
	   System.out.println("************Employee details**********");
		System.out.println("Emp name= "+name);
		System.out.println("Emp experience= "+exp);
		System.out.println("Emp salary= "+salary);
		System.out.println("Emp Bonus= "+ bonus);
		System.out.println("Emp total salary= "+total_salary);
	}

}
