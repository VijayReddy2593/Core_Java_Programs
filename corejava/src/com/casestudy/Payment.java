package com.casestudy;

import java.util.Scanner;

public abstract class Payment {
	static Scanner sc=new Scanner(System.in);
	static private double balance=5000;
	abstract void processpayment(double amount);
	public double getbal() {
		return balance;
	}
	public void setbal(double bal) {
		this.balance=bal;
		
	}
 public static void main(String[] args) {
	 System.out.println("*******Welcome to the online payment mode********");
	 System.out.println("Select your choice \n1.credit card\n2.UPI");
	 int choice=sc.nextInt();
	 System.out.println("Enter the amount");
	 double amount=sc.nextDouble();
	 switch(choice) {
	 case 1:{
		 Payment p=new creditcard();
	        p.processpayment(amount);
	        break;
	 }
	 case 2:{
		 Payment p=new UPI();
            p.processpayment(amount);  
            break;
	 }
	 }
	 
	 
 }
 
 
}

 class creditcard extends Payment{

	@Override
	void processpayment(double amount) {
	System.out.println("Enter your card number");
	int cardno=sc.nextInt();
	System.out.println("Enter cvv number");
	int cvv=sc.nextInt();
	double newbal=getbal()-amount;
	setbal(newbal);
		System.out.println("An amount of "+amount+" debited from your acccount using credit card");
		System.out.println("current balance after debit: "+getbal());
	}
	 
 }
 
 class UPI extends Payment{

		@Override
		void processpayment(double amount) {
			System.out.println("Enter upi id");
			String UPI=sc.next();
			System.out.println("Enter pin");
			int pin=sc.nextInt();
			double newbal=getbal()-amount;
			setbal(newbal);
				System.out.println("An amount of "+amount+" debited from your acccount using UPI");
				System.out.println("current balance after debit: "+getbal());
			
		}
		 
	 }

// class main{
//	 public static void main(String[] args) {
//		 
//	 }
// }
