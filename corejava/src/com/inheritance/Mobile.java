package com.inheritance;

public class Mobile extends Electronics {
	int storage;
	int ram;
	String ostype;

	public Mobile(int productid, String productname, double price, String brand, int warrantyYears, int powerUsage,
			int storage, int ram, String ostype) {
		super(productid, productname, price, brand, warrantyYears, powerUsage);
		this.storage = storage;
		this.ram = ram;
		this.ostype = ostype;
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
		System.out.println("storage : " + storage);
		System.out.println("ram : " + ram);
		System.out.println("ostype : " + ostype);

	}

	void applyDiscount() {
		int discount=20;
		double discountprice = (discount / 100.0) * price;
		price -= discountprice;

		System.out.println("product Price after applying discount (" + discount + "% off) :" + price);

	}

}
