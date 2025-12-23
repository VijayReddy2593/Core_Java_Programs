package corejava;

import java.util.Scanner;

public class Magicnumber {
	static boolean ismagic(int num) {
		boolean status = false;
int count=0;
		while (num > 1 && count<100) {
			int sum = 0;
			while (num != 0) {
				int digit = num % 10;
				num = num / 10;
				sum = sum + digit;
				count++;
			}
			num = sum;

			if (sum == 1) {
				status = true;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (ismagic(num)) {
			System.out.println(num + " is a magic number");
		} else {
			System.out.println(num + " is not a magic number");
		}}

	}

}
