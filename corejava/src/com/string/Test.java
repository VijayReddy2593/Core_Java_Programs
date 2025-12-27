package com.string;

class A{
	static String msg="Hello";
	static {
		msg="Hi";
	}
}
class B extends A{
	static {
		msg="Bye";
	}
}
public class Test {

	public static void main(String[] args) {
		
System.out.println(B.msg);
System.out.println(A.msg);

	}

}
