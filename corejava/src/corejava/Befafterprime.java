package corejava;

import java.util.Scanner;

public class Befafterprime {
	static boolean check(int num) {
		boolean status = true;
		if (num <= 1) {
			status = false;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					status = false;
				}
			}
		}
		return status;
	}

	static int findnum(int num, int i) {
		int prenum = 0;
		int nextnum = 0;
		if (i > 0) {
			while (true) {
				num = num + 1;
				if (check(num)) {
					prenum = num;
					break;
				}

			}
			return prenum;
		} else {
			while (true) {
				num = num - 1;
				if (check(num)) {
					nextnum = num;
					break;
				}

			}
			return nextnum;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a prime number");
			int num = sc.nextInt();

			if (check(num)) {
				int prenum = findnum(num, -1);
				int nextnum = findnum(num, 1);
				System.out.println("preprime number of " + num + " is= " + prenum);
				System.out.println("nextprime number of " + num + " is= " + nextnum);
				int diff1 = Math.abs(num - prenum);
				int diff2 = Math.abs(num - nextnum);
				System.out.println(" ");
				if (diff1 > diff2) {
					System.out.println("the greatest diff primenum is " + prenum);
				} else {
					System.out.println("the greatest diff primenum is " + nextnum);

				}
				System.out.println(" ");
				System.out.println("********************************************");

				System.out.println(" ");

			} else {
				System.out.println(" ");
				System.out.println("Entered number is not a prime");
				System.out.println("********************************************");
				System.out.println(" ");
			}
		}
	}

}
