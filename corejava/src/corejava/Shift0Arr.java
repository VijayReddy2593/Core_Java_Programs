package corejava;

import java.util.Scanner;

public class Shift0Arr {

	public static void main(String[] args) {
		
		
		
		int n1=0;
		int n2=1;
		int n3=n1+n2;
        while(n2<100) {
        	System.out.print(n3+" ");
        	n1=n2;
        	n2=n3;
        	n3=n1+n2;
        }
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter size");
//		int size=sc.nextInt();
//		int[] arr=new int[size];
//		for(int i=0;i<size;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int temp=0;
//		for(int i=0;i<size;i++) {
//			for(int j=i+1;i<size;i++) {
//				if(arr[i]==0) {
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//			}
//		}
//
//	}
//		for(int i=1;i<=size;i++) {
//		System.out.println(arr[i]);
//		}

//		int[] arr = { 1, 16, 5, 4, 9, 8, 4 };
//		int l = arr.length - 1;
//		System.out.print(arr[l] + " ");
//		for (int i = arr.length - 2; i >= 0; i--) {
//
//			if (arr[i] > l) {
//				l = arr[i];
//				System.out.print(l + " ");
//
//			}
//		}

	}
}
