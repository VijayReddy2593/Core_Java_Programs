package corejava;

import java.util.Scanner;

public class Methodoverloading_Display_student_details {

	void display(String name) {
		System.out.println("Called one arg method");
		System.out.println("Student name: " + name);

	}

	void display(String name, String branch) {
		System.out.println("Called two arg method");
		System.out.println("Student name: " + name);
		System.out.println("Branch: " + branch);

	}

	void display(String name, String branch, int age) {
		System.out.println("Called three arg method");
		System.out.println("Student name: " + name);
		System.out.println("Branch: " + branch);
		System.out.println("Age: " + age);

	}

	void display(String name, String branch, String course, int age) {
		System.out.println("Called four arg method");
		System.out.println("Student name: " + name);
		System.out.println("Branch: " + branch);
		System.out.println("Course: " + course);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {
		Methodoverloading_Display_student_details obj = new Methodoverloading_Display_student_details();
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"What details you want to display\n1.name\n2.name,branch\n3.name,branch,age\n4.name,branch,age,course");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			obj.display("vijay");
			break;
		case 2:
			obj.display("vijay", "CSE");
			break;
		case 3:
			obj.display("vijay", "CSE", 21);
			break;
		case 4:
			obj.display("vijay", "CSE", "JFS", 21);
			break;

		}

	}

}
