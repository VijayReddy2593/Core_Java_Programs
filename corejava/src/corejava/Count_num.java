package corejava;

public class Count_num {

	public static void main(String[] args) {
		int[] arr= {122,222,312,612};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int value=arr[i];
			while(value>0) {
				int digit=value%10;
				if(digit==2) {
					count++;
				}
				value=value/10;
				
			}
		}
		System.out.println("count of 2 in array: "+count);

	}

}
