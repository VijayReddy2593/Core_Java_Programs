package corejava;

import java.util.Scanner;

public class _2arrsum_in_arr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first arr size");
		int alen = sc.nextInt();
		int[] a = new int[alen];
		System.out.println("enter first arr elements");
		for (int i = 0; i < alen; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter second arr size");
		int blen = sc.nextInt();
		int[] b = new int[blen];
		System.out.println("enter first arr elements");
		for (int i = 0; i < blen; i++) {
			b[i] = sc.nextInt();
		}
		int clen;
		if (alen > blen) {
			clen = alen;
		} else {
			clen = blen;
		}
		int[] c = new int[clen];
		if(alen<blen) {
		for (int i = 0; i < clen; i++) {
			
			if( i<alen) {
			    c[i]=a[i]+b[i];
			    
			}
			else {
				if(alen<blen) {
					c[i]=b[i];
					
				}
				else {
					c[i]=a[i];
					
				}
			}
		}
		}else {
			for (int i = 0; i < clen; i++) {
				if(i<blen) {
				    c[i]=a[i]+b[i];
				}
				else {
					if(alen<blen) {
						c[i]=b[i];
					}
					else {
						c[i]=a[i];
					}
				}
			}
		}

		System.out.println("C array:");
		for (int i = 0; i < clen; i++) {
			System.out.print(c[i] + " ");
		}

	}

}
