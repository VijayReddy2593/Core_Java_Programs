package com.string;

import java.util.Scanner;

public class Stringsort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[5];// cat apple banana act help
		System.out.println("Enter an array of strings");
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		int pos ;
		for (int i = 0; i < str.length; i++) {
			

			for (int j = 0; j < str.length; j++) {
				pos = 0;
				if (i == j) {

					continue;

				}
				if (str[i].charAt(pos) == str[j].charAt(pos)) {
					pos++;
				}
				if (str[i].charAt(pos) > str[j].charAt(pos)) {

					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}

			}
		}
		for (int i = str.length-1; i>=0; i--) {
			System.out.print(str[i] + " ");
		}

	}

}
