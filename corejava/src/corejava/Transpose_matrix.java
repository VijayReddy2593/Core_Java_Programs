package corejava;

import java.util.Scanner;

public class Transpose_matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size");
		int r=sc.nextInt();
		System.out.println("Enter clo size");
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		System.out.println("Enter arr");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose of matrix");
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}


	}

}
