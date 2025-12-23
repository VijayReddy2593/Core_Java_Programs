package com.constructor;


class Book{
	String Title;
	String Author;
	Book(){
		
	}
	Book(String Title,String Author){
		
		
	}
	
}

class RefBook extends Book{
	String ExtraEdition;
	RefBook(){
		
	}
	
}
public class EBook extends Book {
	String downloadLink;
	EBook(){
		
	}

	public static void main(String[] args) {
	     
       Book b=new Book("The King","vijay");
	}

}
