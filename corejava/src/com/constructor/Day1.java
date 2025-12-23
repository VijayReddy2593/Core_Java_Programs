package com.constructor;

public class Day1 {
	  String bikeBrand;
	  String bikemodel;
	  String color;
	  int cc;
	  double price;
	  
	  Day1(){
		  bikeBrand="Bajaj";
		  bikemodel="pulser220";
		  color="Black";
		  cc=220;
		  price=200000.00;
		  
	  }
	  Day1(String bikeBrand,String bikemodel,String color,int cc,double price){
		 this.bikeBrand=bikeBrand; 
		 this.bikemodel=bikemodel;
		 this.color=color;
		 this.cc=cc;
		 this.price=price;
		  
	  }
	public static void main(String[] args) {
	    System.out.println("main method started");
	    
	  Day1 d=new Day1();
	  Day1 d1=new Day1("Hero","Splender","Black",150,85000);
	  
	  System.out.println(d.bikeBrand);
	  System.out.println(d.bikemodel);
	  System.out.println(d.color);
	  System.out.println(d.cc);
	  System.out.println(d.price);


	  
	  System.out.println("main method ended");

	}

}
