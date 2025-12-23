package corejava;

import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of people attended the dinner");
		int totalmem=sc.nextInt();
		System.out.println("enter bill");
		int bill=sc.nextInt();
		int tip= bill *(10/100);
		
		int totalbill=tip+bill;
		int splitamount=(totalbill/totalmem);
		int balance=totalbill/totalmem;
		
		System.out.println("tip amount="+tip);
		System.out.println("total bill="+totalbill);
		System.out.println("Amount per head="+splitamount);
		System.out.println("Balance="+balance);
	}
}