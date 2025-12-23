package com.examPapers;

public class ExamCode_8_11 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,50,50,60};
		int alen=arr.length;
		int[] arr1=new int[alen];
		int counti=0;
		int i;
		int k;
		int j;
		for (i = 0, j = 1, k = 0; i < alen  && j <=alen && k < alen; i++, j++, k++) {
			if(counti<2) {
				counti++;
				i=0;
				
			}
			
			if(j>5) {
				j=5;
			}
			arr1[k]=arr[i]+arr[j];
		
			
		}
		for(int m=0;m<alen;m++) {
			
		
		System.out.println(arr1[m]);
		}
		

	}

}