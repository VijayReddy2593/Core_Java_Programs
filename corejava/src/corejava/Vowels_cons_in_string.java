package corejava;

import java.util.Scanner;

public class Vowels_cons_in_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		int v = 0;
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {
				System.out.println(ch + " is a vowel");
				v++;
			}
			else if(ch==' ') {
				continue;
				
			}
				else {

				System.out.println(ch + " is a consonent");
				c++;
			}
		}

		
		System.out.println("Total no.of vowels and consonents in " + str + " is");
		System.out.println("Vowels= " + v);
		System.out.println("consonants= " + c);

	}
}
