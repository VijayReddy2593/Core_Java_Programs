package corejava;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num=sc.nextInt();
        int sum=0;
        int digit;
        
        	digit=num%10;
        	sum=sum+digit;
        	num=num/10;
        	
        	digit=num%10;
        	sum=sum+digit;
        	num=num/10;
        	 
        	digit=num%10;
        	sum=sum+digit;
        	num=num/10;
        	 
        	
        
        System.out.println("Sum of the given number is: "+sum);
        
        System.out.println("Enter a number to reverse");
        num=sc.nextInt();
        System.out.println("reverse of the given number is");
        while(num>0){
        	digit=num%10;
        	System.out.print(digit);
        	num=num/10;
        }
	}

}