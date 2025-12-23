package corejava;

import java.util.Scanner;

public class binary_to_decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number");
		int num = sc.nextInt();
		int temp = num;
		int value = 0;
		int result = 0;
		int pow = 0;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;

			if (digit == 1) {
				value = (int) Math.pow(2, pow);
				pow++;
				result += value;

			}
			if (digit == 0) {
				pow++;
			}
		}
		System.out.println("the decimal value of " + temp + " is " + result);

	}

}
