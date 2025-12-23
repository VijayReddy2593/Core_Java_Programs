package corejava;

import java.util.Scanner;

public class Remove_deplicates_inArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arr size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter arr elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int size1=0;
		int count;
		int i=0;
		
		System.out.println("Repeated elemensts in array are: ");
		for(i=0;i<size-1;i++) {
			count=0;
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
				
			}
			if(count>0) {
				System.out.print(arr[i]+" ");
				
			}
			//	else {
//				size1++;
//			}
		}
//		int[] arr1=new int[size1+1];
//		System.out.println(size1);
//		System.out.println("New array is:");
//		for(i=0;i<size-1;i++) {
//			count=0;
//			for(int j=i+1;j<size;j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//				}
//				
//				
//			}
//			if(count==0) {
//				int s=0;
//				arr1[s]=arr[i];
//				s++;
//				
//			}
//		}
//		for(int m=0;m<arr1.length;m++) {
//			System.out.print(arr1[m]);
//		}

	}

}
