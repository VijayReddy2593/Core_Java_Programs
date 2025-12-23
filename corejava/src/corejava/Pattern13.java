package corejava;

public class Pattern13 {

	public static void main(String[] args) {
		int num=1;
		
		for(int i=1;i<=4;i++) {
			for(int s=i;s<4;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=num;j++) {
				
				if(j%2!=0) {
				System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
			}
			num+=2;
			for(int s=i;s<4;s++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
