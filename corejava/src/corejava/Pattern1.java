package corejava;

public class Pattern1 {

	public static void main(String[] args) {
      int i;
		for ( i = 1; i <= 5; i++) {

			for (int j = i; j <= 5; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
		}
		

	
	}
}
