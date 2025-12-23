package corejava;

import java.util.Scanner;

public class Sum_of_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int sum=0;
		System.out.println("Enter the numbers you want to add");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum :"+sum);
		

	}

}
