package corejava;

public class Print_A_to_Z {

	public static void main(String[] args) {
		for(int i=65;i<=122;i++) {
			if(i>=65 && i<=90 || i>=97 && i<=122) {
			char ch=(char)i;
			System.out.print(ch+" ");
			}
			else {
				continue;
			
			}
		}

	}

}
