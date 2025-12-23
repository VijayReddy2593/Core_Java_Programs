package com.examPapers;

public class ExamPaper_8_11 {

	public static void main(String[] args) {
//		int[] arr= {5,10,15,20};
//		int i=1;
//		System.out.println(arr[i]+arr[i++]);
//		System.out.println(i);
		
		
//		int[] arr= {2,0,3,1};
//		System.out.println(arr[arr[arr[2]]]);
		
		
//		int[] a= {1,2,3};
//		int[] b=a;
//		b[1]=99;
//		
//		System.out.println(a[1]);
		
		
//		int[] arr= {1,2,3};
//		int i=0;
//		while(i<arr.length) {
//			System.out.print(arr[i++]+" ");
//			i++;
			
//		}
		

		
		int[] arr= {1,2,3};
		for(int x:arr) {
			x=x+5;
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}
