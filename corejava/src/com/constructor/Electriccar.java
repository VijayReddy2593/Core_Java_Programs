package com.constructor;
  
 class Vehicles {
	 String type;
	 String Brand;
	 int batterycapacity;
	
     Vehicles(String type){
    	 System.out.println("two arg constructor in Vehicle");
    	 this.type=type;
	 }
	
	


}
 class Car extends Vehicles {
	 
     Car(String type,String Brand){
    	 super(type);
    	 System.out.println("two arg constructor in car");
    	 super.type=type;
    	 super.Brand=Brand;
	 }



}
public class Electriccar extends Car {
     
     Electriccar(String type,String Brand,int batterycapacity){
    	 super(type,Brand);
    	 System.out.println("Three args constructor in Electriccar");
    	 super.type=type;
    	 super.Brand=Brand;
    	 super.batterycapacity=batterycapacity;
     }
	public static void main(String[] args) {
		 System.out.println("Electric car class");
		 Electriccar e=new Electriccar("Bajaj","pulsar",100);
		 e.show();
		 
	}
	 void show() {
		System.out.println("Type="+super.type);
		System.out.println("Brand="+super.Brand);
		System.out.println("Batterycapacity="+super.batterycapacity);
		
		 
	 }

}
