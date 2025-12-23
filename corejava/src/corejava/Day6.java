package corejava;

import java.util.Scanner;

public class Day6 {
	static Scanner sc=new Scanner(System.in);
	public static String firstName() {
		System.out.println("enter your first name:");
		String name=sc.next();
		return name;
	}

	public static String lastName() {
		System.out.println("enter your last name");
		String Lname=sc.next();
		return Lname;
	}

	public static String fullName() {
		
		
	return firstName()+" "+lastName();
        
		
	}

	public static void main(String[] args) {
		 System.out.println(fullName());
     
	}

}
