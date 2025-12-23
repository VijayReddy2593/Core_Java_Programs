package corejava;

import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a number");
			int num = sc.nextInt();
			int temp = num;
			String binary = "";

			while (num > 0) {
				int r = num % 2;
				binary = r + binary;
				num = num / 2;
			}
			System.out.println("the binary value of " + temp + " is " + binary);

		}
	}
}
