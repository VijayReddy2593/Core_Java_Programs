package corejava;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		int product=1;
		int s=0;
		while(s<=arr.length-1) {
			if(arr[s]==0) {
				s++;
				 continue;
			 }
			 else {
				 product*=arr[s];
				 s++;
			 }
		}
		System.out.println(product);
		for(int i=0;i<arr.length-1;i++) {
			 if(arr[i]==0) {
				System.out.print("0,"); 
				continue;
			 }
			 int val=product/arr[i];
			 System.out.print(val+",");
			 
		}

	}

}
