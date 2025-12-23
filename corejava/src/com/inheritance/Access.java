package com.inheritance;

public class Access {

	public static void main(String[] args) {

		Grocery g = new Grocery(1, "Rice", 1100, "Gajrag", 26, "1-1-2027");
		g.displayProductDetails();
		g.applyDiscount();
		
		Mobile m=new Mobile(2,"iQoo",20000,"vivo",2,12,128,8,"snap dragon");
		m.displayProductDetails();
		m.applyDiscount();
		
		Shirt s=new Shirt(3,"shirt",1399,"U.S polo",42,"cotton","Half sleeve","overfit");
		s.displayProductDetails();
		s.applyDiscount();

	}

}
