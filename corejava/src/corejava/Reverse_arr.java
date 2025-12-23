package corejava;

import java.util.Scanner;

public class Reverse_arr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter the numbers you want to add");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array values:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		
		}
		System.out.println();
		System.out.println(" reversed Array values:");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(" "+arr[i]);
		
		}

	}

}
