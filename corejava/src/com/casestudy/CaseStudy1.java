package com.casestudy;

public class CaseStudy1 {
	int stdID;
	String stdname;
     char section;
	
	CaseStudy1(int stdID,String stdname,char section){
		
		this.stdID=stdID;
		this.stdname=stdname;
		this.section=section;
	}
	CaseStudy1(String newstdname,int newstdID,char newsection){
		this.stdID=newstdID;
		this.stdname=newstdname;
		this.section=newsection;
		
		
	}
	
	public static void main(String[] args) {
		CaseStudy1 obj=new CaseStudy1(1,"vijay",'A');
		CaseStudy1 obj1=new CaseStudy1(obj.stdname,26,'B');
		System.out.println("***************Historical Data***********");
		obj.show();
		System.out.println("***************Current Data***********");
		obj1.show();
		
		

	}
	void show() {
		
		System.out.println("stdID= "+stdID);
		System.out.println("stdname= "+stdname);
		System.out.println("section= "+section);
	

}
}
