package corejava;

import java.util.Scanner;

public class Palindrome {
	static boolean ispalindrome(int num) {
		boolean status=false;
		int rev=0;
		int temp=num;
		while(num!=0) {
			int digit=num%10;
			num=num/10;
			rev=rev*10+digit;
		}
		
		if(temp==rev) {
			status=true;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number");
		int start=sc.nextInt();
		System.out.println("Enter Ending number");
		int end=sc.nextInt();

		 System.out.println("palindrome numbers between "+ start +" and "+end +" are:");
		for(int i=start;i<=end;i++) {
			if(ispalindrome(i)) {
				System.out.print(i+" ");
			}
		}

	}

}
