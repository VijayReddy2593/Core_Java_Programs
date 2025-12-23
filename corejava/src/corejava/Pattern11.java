package corejava;

public class Pattern11 {

	public static void main(String[] args) {
		int jnum = 1;
		for (int i = 4; i >= 1; i--) {
			for (int s = 1; s < i; s++) {
				System.out.print("  ");
			}
			int num=5-i;
			for (int j = 1; j <= jnum; j++) {
				System.out.print(num+" ");
				if(j>jnum/2) {
					num++;
				}else {
				num--;
				}
				
			}
			jnum += 2;
			for (int s = 1; s < i; s++) {
				System.out.print("  ");
			}
			System.out.println();
		}

	}

}
