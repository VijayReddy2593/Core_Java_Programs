package corejava;

import java.util.Scanner;

public class Modify_array {
	static int[][] modify(int[][] arr1,int i1,int j1) {
		int count=0;
		while(count<3) {
			arr1[i1][j1]=0;
			j1++;
			count++;
		 }
		count=0;
		while(count<3) {
			arr1[i1][j1]=0;
			i1++;
			count++;
		 }
		return arr1;
	}

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int[][] arr=new int[3][3];
	    
	    System.out.println("Enter array elements");
	    for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    		arr[i][j]=sc.nextInt();
	    	}
	    }
	    int[][] arr1=arr;
	    boolean i0=false;
	    boolean i1=false;
	    boolean i2=false;
	    for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    	   if(arr[i][j]==0) {
	    		   arr1= modify(arr1,i,j);
	    		   break;
	    	   }
	    	   
	    	}
	    }
	    for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    		System.out.print(arr1[i][j]+" ");
	    	}
	    	System.out.println();
	    }

	}

}
