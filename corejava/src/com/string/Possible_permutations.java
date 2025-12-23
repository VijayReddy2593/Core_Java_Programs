package com.string;

import java.util.Scanner;

public class Possible_permutations {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a string");
         String str=sc.next();
         for(int i=0;i<str.length();i++) {
        	 System.out.print(str.charAt(i));
        	 for(int j=0;j<str.length();j++) {
        		 if(i==j) {
        			 continue;
        		 }
        		 System.out.print(str.charAt(j));
        		 
        	 }
        	 System.out.println();
        	 System.out.print(str.charAt(i));
        	 for(int j=str.length()-1;j>=0;j--) {
        		 if(i==j) {
        			 continue;
        		 }
        		 System.out.print(str.charAt(j));
        		 
        	 }
        	 System.out.println();
         }
	}

}
