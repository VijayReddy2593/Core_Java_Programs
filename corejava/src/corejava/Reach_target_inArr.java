package corejava;

import java.util.Scanner;

public class Reach_target_inArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arr size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter arr elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target");
			int target=sc.nextInt();
		
			for(int i=0;i<size-1;i++) {
				for(int j=i+1;j<size;j++) {
					if(arr[i]+arr[j]==target) {
						System.out.println("["+i+","+j+"]");
					}
					
				}
			}

	}

}
