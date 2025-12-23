package corejava;

import java.util.Scanner;

public class prime {
	static{
		prime obj=new prime();
	}
	
	{
	
		 display();
	
	}
	static void show() {
		System.out.println("static method");
		show1();
	}
	static void show1() {
		System.out.println("static method2");
		
	}
	void display() {
		System.out.println("instance method");
		display1();
	}
	void display1() {
		System.out.println("instance method2");
		show();
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
	}
}