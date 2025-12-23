package corejava;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float celsius;
		int fahrenheit;
		System.out.println("Converting fahrenheit to celsius");
		System.out.println("enter fahrenheit value:");
		fahrenheit=sc.nextInt();
		celsius=(fahrenheit-32)*5/9;
		System.out.println("celsius value: "+celsius);
		
		System.out.println("Converting  celsius to fahrenheit");
		System.out.println("enter  value:");
		fahrenheit=sc.nextInt();
		fahrenheit=(int) ((celsius*9/5)+32);
		System.out.println("fahrenheit value: "+fahrenheit);
}
}
	/*static Exam obj=new Exam();
	 static void show1(){
		 System.out.println("static method 1");
	      obj.display1();
	 }
	 static void show2(){
		 System.out.println("static method 2");
		 obj.display2();
	 }
	 static void show3(){
		 System.out.println("static method 3");
		 obj.display3();
	 }
	 static void show4(){
		 System.out.println("static method 4");
		 obj.display4();
	 }
	 static void show5(){
		 System.out.println("static method 5");
		 obj.display5();
	 }
	 void display1() {
		 System.out.println("instance method 1");
		 show2();
	 }
	 void display2() {
		 System.out.println("instance method 2");
		 show3();
	 }
	 void display3() {
		 System.out.println("instance method 3");
		 show4();
	 }
	 void display4() {
		 System.out.println("instance method 4");
		 show5();
	 }
	 void display5() {
		 System.out.println("instance method 5");
	 }
	public static void main(String[] args) {
		
	show1();
	}

}*/
