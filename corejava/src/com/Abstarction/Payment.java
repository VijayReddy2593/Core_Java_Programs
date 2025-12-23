package com.Abstarction;

import java.util.Scanner;

public interface Payment {

	void make_a_payment(double amount);

}

class credit_card implements Payment {
	long AccoNo;

	credit_card(long AccoNo) {
		this.AccoNo = AccoNo;
	}

	@Override
	public void make_a_payment(double amount) {
		System.out.println("By Using Credit Card pay");
		System.out.println("Account Number:" + AccoNo);
		System.out.println("Amount Paying:" + amount);

	}

}

class Debit_card implements Payment {
	long CardNo;

	Debit_card(long CardNo) {
		this.CardNo = CardNo;
	}

	@Override
	public void make_a_payment(double amount) {
		System.out.println("By Using Debit Card pay");
		System.out.println("Card Number:" + CardNo);
		System.out.println("Amount Paying:" + amount);

	}

}

class UPI implements Payment {
	int Upi;

	UPI(int Upi) {
		this.Upi = Upi;
	}

	@Override
	public void make_a_payment(double amount) {

	}

}

class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Checking out........");
		System.out.println("Enter amount:");
		double pay = sc.nextDouble();
		System.out.println("Select your payment option \n1.credit card\n2.debit card\n3.UPI");
		int choice = sc.nextInt();
		Payment p = null;
//		double amount;
		switch (choice) {
		case 1: {
			System.out.println("Enter Account Number");
			long a = sc.nextLong();
			p = new credit_card(a);
			p.make_a_payment(pay);
			break;
		}
		case 2: {
			System.out.println("Enter card number");
			long a = sc.nextLong();
			p = new Debit_card(a);
			p.make_a_payment(pay);
			break;

		}
		case 3: {
			System.out.println("Enter UPI pin");

			int a = sc.nextInt();
			p = new UPI(a);
			p.make_a_payment(pay);
			break;

		}
		}
	}
}
