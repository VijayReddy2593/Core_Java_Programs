package corejava;

public class Lab {

	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 0, 0, 1 }, { 1, 1, 1, 0, 0 }, { 0, 0, 0, 1, 0 }, { 1, 0, 1, 0, 0 } };

		int emtbed = 0;

		int rowcount = 0;
		int maxrow = 0;
		for (int i = 0; i < 4; i++) {
			int temp = 0;
			for (int j = 0; j < 4; j++) {
				if (arr[i][j] == 0) {
					temp++;
					emtbed++;
				}

			}
			if (temp > rowcount) {
				maxrow = i;
			}
			rowcount = temp;
		}
		System.out.println("empbed=" + emtbed);
		System.out.println("max emt bed row=" + maxrow);
	}

}
