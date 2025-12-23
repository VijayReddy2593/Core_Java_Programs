package com.Abstarction;

import java.util.Scanner;

public interface Discount {

	public void payment(double amount);

}

class regular implements Discount {
   
	@Override
	public void payment(double amount) {
		double Discount=amount*0.1;
		amount=amount-Discount;
		System.out.println("amount after "+10+"% discount: "+amount);
		

	}

}

class premium implements Discount {

	@Override
	public void payment(double amount) {
		double Discount=amount*0.2;
		amount=amount-Discount;
		System.out.println("amount after "+20+"% discount: "+amount);

	}
}

 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("select customer type\n1.Regular \n2.Premium");
		int choice=sc.nextInt();
		System.out.println("Enter your amount");
		double amount=sc.nextDouble();
		Discount d=null;
		switch(choice) {
		case 1:
		{  d=new regular();
		    d.payment(amount);
			break;
		}
		case 2:
		{  d=new premium();
		    d.payment(amount);
			break;
		}
		
		}

	}
 }
