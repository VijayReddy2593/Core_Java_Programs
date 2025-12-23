package com.string;

public class Program1 {

	public static void main(String[] args) {
		String str="caaabbcccdd";
		String uniq="";
		for(int i=0;i<str.length();i++) {
			char v=str.charAt(i);
			String val = Character.toString(v);
			if(!uniq.contains(val)) {
				uniq=uniq+val;
				
			}
		}
		for(int j=0;j<uniq.length();j++) {
			int count=0;
			for(int k=0;k<str.length();k++) {
				
				if(uniq.charAt(j)==str.charAt(k)) {
					count++;
					
				}
			}
			System.out.print(uniq.charAt(j)+""+count);
			
		}
		

	}

	

}
