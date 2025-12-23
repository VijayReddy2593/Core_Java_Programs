package corejava;

public class Arrayreverse {

	public static void main(String[] args) {
		int[] arr= {0101,1000,2000,1050};
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			String rev="";
		  while(num>0) {
			  int digit=num%10;
			  num=num/10;
			  rev=rev+digit;
		  }
		  
		
			System.out.print(rev+" ");
		}

	}

}
