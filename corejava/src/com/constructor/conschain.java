package com.constructor;

public class conschain {

	 int id;
     String name;
	 int age;
	 long phone;

	conschain() {
		System.out.println("No arg constructor");

	}

	conschain(int id) {
		this();
		System.out.println("one arg constructor");
		this.id=id;
	}

	conschain(int id, String name) {
		this(id);
		System.out.println("two arg constructor");
		this.id=id;
		this.name=name;
	}

	conschain(int id, String name, int age) {
		this(id,name);
		System.out.println("three arg constructor");
		this.id=id;
		this.name=name;
		this.age=age;
	}

	conschain(int id, String name, int age, long phone) {
		this(id,name,age);
		System.out.println("four arg constructor");
		this.id=id;
		this.name=name;
		this.age=age;
		this.phone=phone;
	}

	public static void main(String[] args) {
		conschain c = new conschain(1,"vijay",22,345678654L);
		c.show();
	}

	void show() {
		System.out.println("studend id=" + id);
		System.out.println("studend name=" + name);
		System.out.println("studend age=" + age);
		System.out.println("studend phone=" + phone);

	}

}
