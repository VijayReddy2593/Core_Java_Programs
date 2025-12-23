package corejava;

import java.util.Scanner;

public class Day5 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int id=getEmpID();
		String name=getEmpName();
		int age=getEmpAge();
		double sal=getEmpSal();
		String desig=getEmpDesignation();
		System.out.println("Emp name: "+id);
		System.out.println("Emp name: "+name);
		System.out.println("Emp name: "+age);
		System.out.println("Emp name: "+sal);
		System.out.println("Emp name: "+desig);

	}
	static int getEmpID() {
		System.out.println("Enter emp id");
		int id=sc.nextInt();
		return id;
	}
	static String getEmpName() {
		System.out.println("Enter emp name");
		sc.nextLine();
		String name=sc.nextLine();
		return name;
	}
	static int getEmpAge() {
		System.out.println("Enter emp Age");
		int Age=sc.nextInt();
		return Age;
	}
	static Double getEmpSal() {
		System.out.println("Enter emp sal");
		Double sal=sc.nextDouble();
		return sal;
	}
	static String getEmpDesignation() {
		System.out.println("Enter emp Designation");
		sc.nextLine();
		String desig=sc.nextLine();
		return desig;
	}
	

}
