package com.casestudy;

public class Encapsulation {
	  private String name;
	  private int age;
	 private int marks;
	 
	 public void setname(String name) {
		 this.name=name;
	 }
	 public void setage(int age) {
		 if(age>0) {
		 this.age=age;
		 }
		 else {
			 System.out.println("invalid age");
		 }
	 }
	 public void setmarks(int marks) {
		 if(marks>=0 && marks<=100) {
			 this.marks=marks;
			 }
			 else {
				 System.out.println("enter valid marks");
			 }
	 }
	 public String getname() {
		 return name;
	 }
	 public int getage() {
		 return age;
	 }
	 public int getmarks() {
		 return marks;
	 }
	 public static void main(String[] args) {
	    Encapsulation e1=new Encapsulation();
	    e1.setname("vijay");
	    e1.setage(22);
	    e1.setmarks(100);
	    System.out.println(e1.getname());
	    System.out.println(e1.getage());
	    System.out.println(e1.getmarks());
	
	}

}
