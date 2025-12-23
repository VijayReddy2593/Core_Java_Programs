package corejava;

public class Pattern17 {

	public static void main(String[] args) {
		int l=10;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			for(int s=1;s<=l;s++) {
				System.out.print(" ");
			}
			l=l-2;
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		int ll=2;
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			for(int s=1;s<=ll;s++) {
				System.out.print(" ");
			}
			ll=ll+2;
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
