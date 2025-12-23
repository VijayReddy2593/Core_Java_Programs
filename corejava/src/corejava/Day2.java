package corejava;

import java.util.Scanner;

public class Day2 {
 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Day2 obj=new Day2();
		System.out.println("ADDITION");
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		int add=obj.add(a, b);
		int sub=obj.sub(add, b);
		int mul=obj.mul(sub, b);
		int div=obj.div(mul, b);

	}
	int add(int a, int b) {
		System.out.println("Addition of "+a+" and "+b+": "+(a+b));
		System.out.println("======================================================");
		return a+b;
		
	}
	int sub(int add,int b) {
		System.out.println("SUBSTRACTION");
		
		System.out.println("Enter a value for substract");
		int d=sc.nextInt();
		int sub=add-d;
		System.out.println("Diff of "+add+" and"+d+ "is: "+sub );
		System.out.println("======================================================");
		return sub;
	}
	int mul(int sub,int b) {
		
		System.out.println("MULTIPLICATION");
		
		System.out.println("Enter value for multiplication");
		int d=sc.nextInt();
		int mul=sub*d;
		System.out.println("product of "+sub+" and"+d+" is: "+mul);
		System.out.println("======================================================");
		return mul;
	}
     int div(int mul,int b) {
		
		System.out.println("DIVISION");
		
		System.out.println("Enter value for Division");
		int d=sc.nextInt();
		int div=mul/d;
		System.out.println("Quotient of "+mul+" and"+d+" is:"+div);
		System.out.println("======================================================");
		return div;
	}

}
