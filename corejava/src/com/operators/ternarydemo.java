package com.operators;

import java.util.Scanner;

public class ternarydemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter third number");
		int c=sc.nextInt();
	
		 String max=(a>b)?"A is greater":(b>c)? "B is greater":"C is grater";

		System.out.println(max);


	}

}
