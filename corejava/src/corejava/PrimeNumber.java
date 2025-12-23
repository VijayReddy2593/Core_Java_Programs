package corejava;

import java.util.Scanner;

public class PrimeNumber {
        
	static boolean isprime(int num) {
		boolean status=true;
		if(num==0 || num==1) {
			status=false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0 ) {
				status=false;
				break;
			}
		}
		
		
		return status;
		
	}
	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter limit");
       int num=sc.nextInt();
//      for(int i=0;i<num;i++) {
//    	   
//    	   if(isprime(i)) {
//    		   System.out.print(i +" ");}
//       }
       
       if(isprime(num)) {
		   System.out.print( " prime");
		   }else {
			   System.out.print( " No");

			   
   }
       
      
       }
	

}
