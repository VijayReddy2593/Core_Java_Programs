package com.inheritance;

public class Grocery extends Product {
	double weight;
	String expirydate;

	public Grocery(int productid, String productname, double price, String brand, double weight, String expirydate) {
		super(productid, productname, price, brand);
		this.weight = weight;
		this.expirydate = expirydate;

	}

	void displayProductDetails() {
		System.out.println();
		System.out.println("-----------------" + productname + " details-----------------");
		System.out.println();
		System.out.println("product id : " + productid);
		System.out.println("product name : " + productname);
		System.out.println("price : " + price);
		System.out.println("brand : " + brand);
		System.out.println("weight : " + weight);
		System.out.println("expiry date : " + expirydate);

	}

}
