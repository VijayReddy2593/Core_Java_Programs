package corejava;

import java.util.Scanner;

public class Row_col_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int r = sc.nextInt();
		System.out.println("Enter col size");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("Enter arr elements");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println();

		System.out.println("----------rows---------");

		for (int i = 0; i < r; i++) {
			int sum = 0;
			for (int j = 0; j < c; j++) {
				sum = sum + arr[i][j];
			}
			System.out.println("row " + i + " elements sum: " + sum);

		}
		
		
		System.out.println();

		System.out.println("----------columns---------");

		for (int i = 0; i < c; i++) {
			int sum = 0;
			

			for (int j = 0; j < r; j++) {

				sum = sum + arr[j][i];
				
			}

			System.out.println("coloumn" + i + " elements sum: " + sum);

		}
		System.out.println();
		System.out.println("----------Diagonals---------");

		int sum=0;
		for(int i=0;i<r;i++) {
			
			sum+=arr[i][i];
		}
		System.out.println("diagonal left to right elements sum: "+sum);
		
		sum=0;
		int j=2;
		for(int i=0;i<r;i++) {
			
			sum+=arr[i][j];
			j--;
		}
		System.out.println("diagonal right to left elements sum: "+sum);

	}

}
