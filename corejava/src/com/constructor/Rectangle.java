package com.constructor;
    
    

class Shape{
	String type;
	Double Length;
	Double breadth;
	 Shape(){
		 System.out.println("shape created");
	 }
	 Shape(String type){
		 
		 System.out.println("Shape type= "+type);
		 this.type=type;
	 }
}

public class Rectangle extends Shape {
	Rectangle(){
		super();
		System.out.println("rectangle created");
	}
	Rectangle(String type,double length,double breadth){
		 super(type);
		// System.out.println("parametarized");
		 super.Length=length;
		 super.breadth=breadth;
		 System.out.println("Shape Length= "+Length);
		 System.out.println("Shape breadth= "+breadth);
		 
		 
	}

	public static void main(String[] args) {
		System.out.println("main method started");
	    Rectangle r1=new Rectangle();
		Rectangle r=new Rectangle("Rectangle",5.2,6.3);
        r.display();
	}
	void display() {
		System.out.println("Area of rectangle");
		Double area=super.Length *super.breadth;
		System.out.println(area);
	}

}
