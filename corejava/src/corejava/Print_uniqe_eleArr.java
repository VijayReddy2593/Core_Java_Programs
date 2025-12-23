package corejava;

import java.util.Scanner;

public class Print_uniqe_eleArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
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
		for(i=0;i<size;i++) {
			count=0;
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
				
			}
			if(count==0) {
				System.out.print(arr[i]+" ");
				
			}

		}

	}

}
