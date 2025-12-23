package com.constructor;

public class Student {
   String name;
   int age;
   Student(){
	   name="Unknown";
	   age=18;
   }
	public static void main(String[] args) {
		
		
		
     Student s=new Student();
     s.display();
	}
	void display() {
		System.out.println("Name="+ name);
		System.out.println("Age="+ age);

	}
//	

}
