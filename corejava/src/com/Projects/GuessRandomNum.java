package com.Projects;

import java.util.Scanner;

public class GuessRandomNum {

	

	public static void main(String[] args) {
		
		int random=(int)(Math.random()*10);
		Scanner sc=new Scanner(System.in);
		String s="yes";
		do {
		int count=1;
		System.out.println(random);
		while(count<=3) {
		System.out.println("Enter a number");
		int usernum=sc.nextInt();
		if(usernum==random) {
			break;
		}
		count++;
       
	}
		if(count<3) {
			System.out.println("you won");
		}
		else {
			System.out.println("You lost");
			
		}
		System.out.println("Do you want to try again");
	    System.out.println("enter 'Yes' if u want else 'No'");
	     s=sc.next();
		
		}while(s.equalsIgnoreCase("Yes"));
		System.out.println("Existing......");
			
			

}
}
