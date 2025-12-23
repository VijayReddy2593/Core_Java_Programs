package com.string;

import java.util.Scanner;

public class Arraysortby2ndelement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int[] arr=new int[5];
	    System.out.println("Enter array elements");
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    int div1;
	    int div2;
	    for(int i=0;i<arr.length;i++) {
	    	div1=arr[i]%10;
	    	 for(int j=0;j<arr.length;j++) {
	 	    	div2=arr[j]%10;
	 	    	if(i==j) {
	 	    		continue;
	 	    	}
	 	    
	 	    	if(div1>div2) {
	 	    		int temp=arr[i];
	 	    		arr[i]=arr[j];
	 	    		arr[j]=temp;
	 	    	}
	 	    }
	    }
	    for(int i=arr.length-1;i>=0;i--) {
	    	System.out.print(arr[i]+" ");
	    }
	}

}
