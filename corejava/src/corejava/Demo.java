package corejava;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int amount;
		int pencilcost=7;
		System.out.println("Enter an amount");
		amount=sc.nextInt();
		int nopencil=amount/pencilcost;
		int balance = amount%pencilcost;
		System.out.println("no of pencils can buy with "+amount+" rupees is "+nopencil );
		
		System.out.println("balance amount is " +balance );
	}
}
/*static public void show1() {
	System.out.println("static block 1");
	show2();
}
static public void show2() {
	
	System.out.println("static block 2");
	Demo d1=new Demo();
	d1.display1();
}
public void display1() {
	System.out.println("Instance block 1");
	display2();
}
public void display2() {
	System.out.println("Instance block 2");
}*/
		/*Scanner sc =new Scanner(System.in);
		int[] num=new int[10];
		System.out.println("enter an array");
		for(int i=0;i<10;i++) {
			num[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("the largest number in the given array is: "+max);
*/

/*String stud;
int age;
int roll;
String course;
static int clgid;
static String clg;*/
		
		/*while(num>0) {
			long res=num%10;
			System.out.print(res);
			num=num/10;
		}*/
		
		
		
		/*std s1=new std();
		s1.stud="vijay";
		s1.age=21;
		s1.roll=1;
		s1.course="java";
		clgid=10;
		clg="NNRG";
		System.out.println("--------student 1 info-------");
		System.out.println("student name=" + s1.stud);
		System.out.println("student age=" + s1.age);
		System.out.println("student roll=" + s1.roll);
		System.out.println("student course=" + s1.course);
		System.out.println("student college id=" + clgid);
		System.out.println("student clg name=" + clg);
		
		std s2=new std();
		s2.stud="abhinav";
		s2.age=21;
		s2.roll=2;
		s2.course="python";
		
		System.out.println("--------student 2 info-------");
		System.out.println("student name=" + s2.stud);
		System.out.println("student age=" + s2.age);
		System.out.println("student roll=" + s2.roll);
		System.out.println("student course=" + s2.course);
		System.out.println("student college id=" + clgid);
		System.out.println("student clg name=" + clg);
		
		std s3=new std();
		s3.stud="Raju";
		s3.age=21;
		s3.roll=3;
		s3.course="java";
		clgid=10;
		clg="NNRG";
		System.out.println("--------student 3 info-------");
		System.out.println("student name=" + s3.stud);
		System.out.println("student age=" + s3.age);
		System.out.println("student roll=" + s3.roll);
		System.out.println("student course=" + s3.course);
		System.out.println("student college id=" + clgid);
		System.out.println("student clg name=" + clg);
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.println("enter a number");
		num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int res=num*i;
			System.out.println(num + "*" + i + "=" + res);
		}*/
		/*int count=0;
		for(int i=1;i<=num;i++) {
		if(num%i==0)
		{
			count++;
		}
		}
		if(count==2)
		{
		System.out.println("prime");
		}
		else {
			System.out.println("Not a prime");
		}
		double p=5000;
		int t=5;
		double r=3;
		double simpleintrest= (p*r*t)/100;
		System.out.println("simple intrest is:" +simpleintrest);
		System.out.println("Simple intrest per monthly:" + simpleintrest/(5*12));
		
		Scanner sc =new Scanner(System.in);
		int limit;
		System.out.println("enter a number");
	    limit=sc.nextInt();
	    int n=0;
	    int n1=1;
	    int sum;
	    for(int i=0;i<=limit;i++) {
	    	sum=n+n1;
	    	System.out.println(sum);
	    	n=n1;
	    	n1=sum;
	   
		emp e1=new emp();
		e1.ename="vijay";
		e1.age=22;
		e1.salary=50000;
		e1.exp=3;
		System.out.println("-----------Emp 1 info----------");
		System.out.println("emp1 name= "+e1.ename);
		System.out.println("emp1 age= "+e1.age);
		System.out.println("emp1 salary= "+e1.salary);
		System.out.println("emp1 exp= "+e1.exp);
		emp e2=new emp();
		e2.ename="sammad";
		e2.age=22;
		e2.salary=60000;
		e2.exp=2;
		System.out.println("-----------Emp 2 info----------");
		System.out.println("emp1 name= "+e2.ename);
		System.out.println("emp1 age= "+e2.age);
		System.out.println("emp1 salary= "+e2.salary);
		System.out.println("emp1 exp= "+e2.exp);
		emp e3=new emp();
		e3.ename="Abhinav";
		e3.age=22;
		e3.salary=50000;
		e3.exp=5;
		System.out.println("-----------Emp 3 info----------");
		System.out.println("emp1 name= "+e3.ename);
		System.out.println("emp1 age= "+e3.age);
		System.out.println("emp1 salary= "+e3.salary);
		System.out.println("emp1 exp= "+e3.exp);
		emp e4=new emp();
		e4.ename="Raju";
		e4.age=22;
		e4.salary=70000;
		e4.exp=3;
		System.out.println("-----------Emp 4 info----------");
		System.out.println("emp1 name= "+e4.ename);
		System.out.println("emp1 age= "+e4.age);
		System.out.println("emp1 salary= "+e4.salary);
		System.out.println("emp1 exp= "+e4.exp);
		emp e5=new emp();
		e5.ename="pavan";
		e5.age=22;
		e5.salary=40000;
		e5.exp=6;
		System.out.println("-----------Emp 5 info----------");
		System.out.println("emp1 name= "+e5.ename);
		System.out.println("emp1 age= "+e5.age);
		System.out.println("emp1 salary= "+e5.salary);
		System.out.println("emp1 exp= "+e5.exp);*/
		
		
		
