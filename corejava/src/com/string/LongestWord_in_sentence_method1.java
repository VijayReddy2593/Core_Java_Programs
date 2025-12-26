package com.string;

public class LongestWord_in_sentence_method1 {

	public static void main(String[] args) {
	     String str="Java is an object oriented programming language";
	     int no_of_words=0;
	     //To know the total no of words in sentence
	     for(int i=0;i<str.length();i++) {
	    	 if(str.charAt(i)==' ') {
	    		 no_of_words++;
	    	 }
	     }
	     //String arr to store each word
         String[] arr1=new String[no_of_words];
         String word="";
         int index=0;
         for(int i=0;i<str.length();i++) {
        	 if(str.charAt(i)!=' ') {
        		 word=word+str.charAt(i);
        	 }else {
        		 arr1[index]=word;
        		 index++;
        		 word="";
        	 }
         }
         //finding the largest word
         int max=0;
       for(int i=0;i<arr1.length;i++) {
      	 if(arr1[i].length()>arr1[max].length()) {
      		 max=i;
      	 }
       }
          System.out.println("largest word : "+arr1[max]);
	}

}
