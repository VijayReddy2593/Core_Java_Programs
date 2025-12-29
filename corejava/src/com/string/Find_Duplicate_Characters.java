package com.string;

import java.util.Scanner;

public class Find_Duplicate_Characters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		System.out.println("Repeating characters in string are:");
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) ) {
					System.out.print(str.charAt(i)+" ");
					break;
				}
			}
		}

	}

}
