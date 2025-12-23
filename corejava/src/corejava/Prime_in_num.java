package corejava;

import java.util.Scanner;

public class Prime_in_num {
	static boolean isprime(int num) {
		boolean status = true;
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		String str = Integer.toString(num);
		int length = str.length();
		

		int pow = 1;
		while (length > 0) {
			int temp = num;
			while (temp > 0) {
				int digit = (int) (temp % (Math.pow(10, pow)));
				temp = (int) (temp / (Math.pow(10, pow)));
				if (isprime(digit)) {
					System.out.println(digit);
				}
			}
			length--;
			pow++;

		}
	}

}
