package com.operators;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter an year");
		int year=sc.nextInt();
		
		if(year%4 ==0 || year%400==0) {
			System.out.println(year+" is a leap year");
		}
		else
			System.out.println(year+" is not a leap year");	}
	}

}
