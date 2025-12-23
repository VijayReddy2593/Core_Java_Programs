package com.encapsulation;

public class Arrobject {
	
	private int id;
	private String name;
	private String branch;
	private int marks;
	Arrobject(int id,String name,String branch,int marks){
		setid(id);
		setname(name);
		setbranch(branch);
		setmarks(marks);
	}

	public void setid(int id) {
		if(id>=0) {
			this.id=id;
		}
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setbranch(String branch) {
		this.branch=branch;
	}
	public void setmarks(int marks) {
		if(marks>=0 && marks<=100) {
			this.marks=marks;
		}
	}
	public void getid() {
		System.out.println("id: "+id);
		
	}
	public void getname() {
		System.out.println("name: "+name);
		
	}
	public void getbranch() {
		System.out.println("branch : "+branch);
		
	}
	public void getmarks() {
		System.out.println("marks: "+marks);
		
	}
	public String toString() {
		return id+"-"+name+"-"+branch+"-"+marks;
	}
	public static void main(String[] args) {
	  Arrobject a1=new Arrobject(1,"vijay","CSE",60);
	  Arrobject a2=new Arrobject(2,"Abhinav","CSE",40);
	  Arrobject a3=new Arrobject(3,"sammad","CSE",51);
	  Arrobject a4=new Arrobject(4,"Raju","CSE",40);
	  Arrobject arr[]= {a1,a2,a3,a4};
   for(int i=0;i<4;i++) {
	   if(arr[i].marks<50) {
	  System.out.println(arr[i]); 
	   }
	   if(arr[i].name.equals("vijay")) {
		  System.out.println(arr[i]); 
	   }
   }

	}

}
