package com.BasicPrograms;

import java.util.Scanner;

public class Perfectnum {
	static boolean isPerfect(int num) {
		boolean status=false;
		int sum =0;
		for(int i=1;i<=num/2;i++) {
			
			if(num%i==0) {
				
				sum =sum+i;
			}
		}
		if(sum==num) {
			status=true;
		}
		
		return status;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter a number to chect wheather it is factor or not");
		int num=sc.nextInt();
		boolean flag=isPerfect( num);
		if(flag) {
			System.out.println(num +" is a perfect number");
		}else {
			System.out.println(num +" is not a perfect number");

		}
		System.out.println("===========================================");
		}

	}

}
