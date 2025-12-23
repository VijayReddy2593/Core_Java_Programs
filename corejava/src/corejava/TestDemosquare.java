package corejava;

import java.util.Scanner;

public class TestDemosquare {
	static int sum = 0;

	static int display(int num) {
    sum=0;
		while (num > 0) {
			
			int digit = num % 10;
			int square = digit * digit;
			sum = sum + square;
			num = num / 10;

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		while(true) {
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		
		while(sum>1 || sum<1 && count<=20){
			//System.out.println(num);
			int sum=display(num);
			//System.out.println(sum);
			num=sum;
			count++;
		
		if(sum==1) {
		System.out.println("happy number");
		break;
		
	}}
	if(sum!=1) {
		System.out.println("not a happy number");
	}}
}}
