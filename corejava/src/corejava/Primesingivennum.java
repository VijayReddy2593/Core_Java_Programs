package corejava;

import java.util.Scanner;
   
public class Primesingivennum {
    static boolean prime(int num) {
    	boolean status=true;
    	if(num==0 || num==1) {
    		status=false;
    	}
    	for(int i=2;i<=num/2;i++) {
    	if(num%i==0) {
    		status =false ;
    		break;
    	}
    	}
    	return status;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entera number");
		int num =sc.nextInt();
		int temp=num;
		int count=0;
		while(temp>0) {
			
		int digit=temp%10;
		temp=temp/10;
		if(prime(digit)) {
			System.out.println(digit);
		}}
		temp=num;
		while(temp>0) {
			
			int digit1=temp%100;
			temp=temp/10;
			if(prime(digit1)) {
				System.out.println(digit1);
			}}
		temp=num;
		while(temp>0) {
			
			int digit2=temp%1000;
			temp=temp/10;
			if(prime(digit2)) {
				System.out.println(digit2);
			}}
		
	}

}
