package com.operators;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		if((a&1)==0) {
			System.out.println(a +" is even");
		}
		
		else {
			System.out.println(a +" is odd");

		}

	}

}
