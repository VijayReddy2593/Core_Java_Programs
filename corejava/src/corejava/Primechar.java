package corejava;

public class Primechar {

	static boolean isprime(int num) {
		boolean status = true;
		if (num == 0 || num == 1) {
			status = false;
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
		int c = 64;
		for (int i = 1; i <= 26; i++) {

			if (isprime(i)) {
				c = 64 + i;
				char result = (char) c;
				System.out.println(i + "'s equavalent alphabet is " + result);

			}
		}

	}
}
