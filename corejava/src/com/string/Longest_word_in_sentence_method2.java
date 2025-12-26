package com.string;

public class Longest_word_in_sentence_method2 {

	public static void main(String[] args) {
		String str="Java is an object oriented programming language";
	     int no_of_words=0;
	     //To know the total no of words in sentence
	     for(int i=0;i<str.length();i++) {
	    	 if(str.charAt(i)==' ') {
	    		 no_of_words++;
	    	 }
	     }
	     //array to store the each word length
       int arr[]=new int[no_of_words];
       int pos=0;//for arr pos
       int wordlen=0; 
       for(int i=0;i<str.length();i++) {
      	 
      	 if(str.charAt(i)!=' ') {
      		 wordlen++;
      	 }else {
      		 arr[pos]=wordlen;
      		 wordlen=0;
      		 pos++;
      	 }
      	 
       }
       int max=0;
       for(int i=0;i<arr.length;i++) {
      	 if(arr[i]>arr[max]) {
      		 max=i;
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
      for(int i=0;i<arr.length;i++) {
     	 if(arr[i]>arr[max]) {
     		 max=i;
     	 }
      }
         System.out.println("largest word : "+arr1[max]);
	}

}
