package corejava;

import java.util.Scanner;

public class Armstrong2 {
	static boolean checkarm(int num) {
		boolean status=false;
		int sum=0;
		int temp=num;
		int temp1=num;
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		
		while(temp>0) {
			int digit1=temp%10;
		     temp=temp/10;
		     int digit2=1;
		     int pow=1;
		     while(pow<=count) {
			  digit2=digit2*digit1;
			 pow++;
		}
		     
		     sum=sum+digit2;
		     
		}
		if(temp1==sum) {
			status=true;
		}
		return status;
	}

	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Armstrong numbers b/w 0 - 10000 ");
       
        for(int i=1;i<=10000;i++) {
       if(checkarm(i)) {
       	System.out.println(i);
       	}
       
	}

}
}

