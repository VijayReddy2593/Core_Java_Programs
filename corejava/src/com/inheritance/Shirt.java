package com.inheritance;

public class Shirt extends Clothing{
	String sleevetype;
	String fittype;
	public Shirt(int productid, String productname, double price, String brand, int size, String material,String sleevetype,String fittype) {
		super(productid, productname, price, brand, size, material);
		this.sleevetype=sleevetype;
		this.fittype=fittype;
		
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
		System.out.println("material : " + material);
		System.out.println("sleevetype : " + sleevetype);
		System.out.println("fittype : " + fittype);
		


	}
}
