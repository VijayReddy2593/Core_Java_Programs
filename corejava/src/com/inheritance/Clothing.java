package com.inheritance;

public class Clothing extends Product {
	int size;
	String material;

	public Clothing(int productid, String productname, double price, String brand, int size, String material) {
		super(productid, productname, price, brand);
		this.size = size;
		this.material = material;

	}

	void displayProductDetails() {
		System.out.println();
		System.out.println("-----------------" + productname + " details-----------------");
		System.out.println();
		System.out.println("product id : " + productid);
		System.out.println("product name : " + productname);
		System.out.println("price : " + price);
		System.out.println("brand : " + brand);
		System.out.println("size : " + size);
		System.out.println("material type : " + material);

	}

}
