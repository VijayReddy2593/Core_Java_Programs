package com.inheritance;

public class Laptop extends Electronics{

	int batterylife;
	String processor;
	public Laptop(int productid, String productname, double price, String brand, int warrantyYears, int powerUsage,int batterylife,String processor) {
		super(productid, productname, price, brand, warrantyYears, powerUsage);
		this.batterylife=batterylife;
		this.processor=processor;
		
	}
	void displayProductDetails() {
		System.out.println();
		System.out.println("-----------------" + productname + " details-----------------");
		System.out.println();
		System.out.println("product id : " + productid);
		System.out.println("product name : " + productname);
		System.out.println("price : " + price);
		System.out.println("brand : " + brand);
		System.out.println("warranty in years : " + warrantyYears);
		System.out.println("power usage : " + powerUsage);
		System.out.println("processor : " + processor);
		System.out.println("batterylife : " + batterylife);
		


	}

}
