package corejava;

import java.util.Scanner;

public class Pair_sum_prime {
	static int isprime(int num) {
	     
		if(num==0 || num==1) {
			return 0;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0 ) {
				return 0;
				
			}
		}
		
		
		return num;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int limit=sc.nextInt();
		for(int i=1;i<=limit;i++) {
			for(int j=i+1;j<=limit;j++) {
				int sum=0;
				sum=i+j;
				if(sum==isprime(sum)) {
					System.out.println(i+"+"+j+"="+sum);
				}
			}
		}
		
		

	}

}
