package com.operators;

import java.util.Scanner;

public class TestTernaryOperater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Eneter marks");
		int marks=sc.nextInt();
		String result=(marks>100)?"invalid":(marks<0)?"invalid":(marks<=100 && marks>90)? "A": (marks<=90 && marks>80)? "B": (marks<=80 && marks>70)? "C" : (marks<=70 && marks>60)?"D": (marks<=60 && marks>50)? "E": (marks<=50 && marks>40)?"F" : "Fail";///(marks<40 || marks>100)? "Fail":"invalid";
         System.out.println(result);
		}
	}

}
