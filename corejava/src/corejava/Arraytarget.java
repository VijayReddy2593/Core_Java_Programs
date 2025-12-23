package corejava;

import java.util.Scanner;

public class Arraytarget {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your target");
		int target=sc.nextInt();
		int[] arr=new int[10];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        }
        int s=0;
        int e=arr.length-1;
        while(true) {
        	if(arr[s]+arr[e]==target) {
        		System.out.println("Index("+s+","+e+")equavalent values("+arr[s]+","+arr[e]+")");
        		
        		break;
        	}
        	else {
        		e--;
        	}
        
        }
	}

}
