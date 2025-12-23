package corejava;

import java.util.Scanner;

public class Palindrome_in_num {
	static String extract(int digit) {
		
		String value=Integer.toString(digit);
		String rev ="";
		for (int i = value.length() - 1; i >= 0; i--) {
             rev += value.charAt(i); 
        }
        
		return rev;
	}
    
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Entera number");
				int num=sc.nextInt();
				int temp=num;
				while(num>0) {
					int digit=num%100;
					num=num/10;
					String rev=extract(digit);
				
                System.out.println(rev);
					int reversed = Integer.parseInt(rev);
					if(reversed==temp) {
						System.out.println(reversed);
					}
				}
				
			}
	}
