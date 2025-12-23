package com.inheritance;

public class Electronics extends Product {

	int warrantyYears;
	int powerUsage;

	public Electronics(int productid, String productname, double price, String brand, int warrantyYears,
			int powerUsage) {
		super(productid, productname, price, brand);
		this.warrantyYears = warrantyYears;
		this.powerUsage = powerUsage;

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

	}

}
