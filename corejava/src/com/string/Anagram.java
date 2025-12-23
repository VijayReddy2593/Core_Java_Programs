package com.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		int size=0;
	    String[] str= {"listen","silent","enlist","inlets","cat","act","tac","hello"};
	    
//	    for(int i=0;i<str.length;i++) {
//	    	for(int j=i+1;j<str.length;j++) {
//	    		if(str[i].length()==str[i+1].length()) {
//
//	    			char[] ch=str[i].toCharArray();
//	        		Arrays.sort(ch);
//	        		
//	        		char[] ch1=str[i+1].toCharArray();
//	        		Arrays.sort(ch1);
//	        	
//	        		if(Arrays.equals(ch, ch1)) {
//	        			System.out.print(str[i+1]);
//	        		}
//	    		}
//	    		
//	    		System.out.println();
//	    	}
//	    }
	    
	    while(size<=10) {
	    	 int count=0;
        for(int i=0;i<str.length;i++) {
        	String word;
        	char[] wordch = null;
        	char[] wordch1;

        	if(str[i].length()==size && count<1) {
        		word=str[i];
        		wordch=str[i].toCharArray();
        		Arrays.sort(wordch);
        		count++;
        	}
        	if(str[i].length()==size) {
        		wordch1=str[i].toCharArray();
        		Arrays.sort(wordch1);
        		if(Arrays.equals(wordch, wordch1)){
        			System.out.println(str[i]);
        		}
        		
        	}
        }
        size++;
	    }
	}

}
