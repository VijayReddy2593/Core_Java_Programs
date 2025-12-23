package corejava;

import java.util.Scanner;

public class Print_prime_in_matrix {
	static boolean isprime(int num) {
		boolean status=true;
		if(num==0 || num==1) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				status=false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int r=3;
		int c=3;
		int[][] arr=new int[r][c];
		System.out.println("Enter arr elements");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int prime=2;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(isprime(i+j)) {
					boolean p=true;
					while(p) {
						if(isprime(prime)) {
							arr[i][j]=prime;
							prime++;
							p=false;
							
						}
						else {
							prime++;
						}
					}
					
				}
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
 
 
 

	}

}
