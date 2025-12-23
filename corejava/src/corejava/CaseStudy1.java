package corejava;

import java.util.Scanner;

public class CaseStudy1 {
	static Scanner sc = new Scanner(System.in);
	static double si(double p, double r, int t) {
        double si=p+(p*r*t/100);
		return si;
	}

	static double ci(double p, double r, int t) {
		System.out.println("Enter no.of compounds per year");
		int n=sc.nextInt();
       double  c =  p * Math.pow((1 + (r / (n * 100.0))), n * t);
		return c;
	}
	static void display() {
		System.out.println("Enter principle interest");
		 double p=sc.nextDouble();
		 System.out.println("Enter Rate of Interest");
		 double r=sc.nextDouble();
		 System.out.println("Enter Time in years");
		 int t=sc.nextInt();
		 int count=1;
		 while(count<=2) {
		 System.out.println("enter choice \n 1.simple interest \n 2.compound interest");
	        int choice=sc.nextInt();
	      
	        switch(choice) {
	        case 1:double simpleinterest=si(p,r,t);
	        System.out.println("==============================================================================");
			System.out.println("maturity amount for a fixed amount using simple interest is: "+simpleinterest);
	               break;
	        case 2:
	        	double compoundinterest=ci(p,r,t);
		        System.out.println("==============================================================================");

//			System.out.println("maturity amount for a fixed amount using compound interest is: "+compoundinterest);
System.out.printf("%.3f",compoundinterest);

	               break;
	        }
	        count++;
	        }
		
		

	}

	public static void main(String[] args) {
		

        display();
        
       
        
	}

}
