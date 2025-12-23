package com.inheritance;

public class Product {

	int productid;
	String productname;
	double price;
	String brand;

	public Product(int productid, String productname, double price, String brand) {
		this.productid = productid;
		this.productname = productname;
		this.price = price;
		this.brand = brand;

	}

	void displayProductDetails() {
		System.out.println("Product id : " + productid);
		System.out.println("Product name : " + productname);
		System.out.println("Price : " + price);
		System.out.println("brand : " + brand);

	}

	void applyDiscount(){
		int discount=10;
		double discountprice = (discount / 100.0) * price;
		price -= discountprice;

		System.out.println("product Price after applying discount (" + discount + "% off) :" + price);

	}

}
