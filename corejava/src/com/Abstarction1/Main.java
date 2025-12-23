package com.Abstarction1;

import java.util.Scanner;

abstract class Employee {
	String name;
	double salary;

	abstract void calculatebonus(double sal);

}

class manager extends Employee {
	manager(String name, double salary) {
		super.name = name;
		super.salary = salary;
	}

	@Override
	void calculatebonus(double sal) {
		double bonus = sal * 0.2;
		salary = salary + bonus;
		System.out.println("Manager name: " + super.name);
		System.out.println("salary along with bonus: " + salary);
	}

}

class Developer extends Employee {
	Developer(String name, double salary) {
		super.name = name;
		super.salary = salary;
	}

	@Override
	void calculatebonus(double sal) {
		double bonus = sal * 0.1;
		salary = salary + bonus;
		System.out.println("Developer name: " + super.name);
		System.out.println("salary along with bonus: " + salary);
	}

}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = sc.next();
		System.out.print("Enter your salary:");
		double salary = sc.nextDouble();
		System.out.println("Enter your choice:\n1.Manager\n2.Developer");
		int choice = sc.nextInt();
		Employee e = null;
		switch (choice) {
		case 1: {
			e = new manager(name, salary);
			e.calculatebonus(salary);
			break;
		}
		case 2: {
			e = new manager(name, salary);
			e.calculatebonus(salary);
			break;
		}

		}

	}
}
