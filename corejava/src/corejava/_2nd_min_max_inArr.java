package corejava;

import java.util.Scanner;

public class _2nd_min_max_inArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[7];
		System.out.println("Enter an array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println("Min of array: "+arr[0]);
		System.out.println("second Min of array: "+arr[1]);
		System.out.println("Max of array: "+arr[(arr.length)-1]);
		System.out.println("second Max of array: "+arr[(arr.length)-2]);


	}

}
