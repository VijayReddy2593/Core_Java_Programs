package corejava;

public class Pattern3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5) {
					System.out.print(j + " ");
				}
				if (i >= 2 && i <= 4) {
					if (j == 1 || j == 5) {
						System.out.print(j + " ");
					} else {
						System.out.print(" " + " ");
					}
				}

			}
			System.out.println();

		}
	}

}
