package corejava;

import java.util.Scanner;

public class Leftshift_arr {
	static void reversearr(int[] a, int s, int e) {
		int temp;
		while (s < e) {
			temp = a[s];
			a[s] = a[e];
			a[e] = temp;
			s++;
			e--;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arr");
		int size = sc.nextInt();
		System.out.println("Enter arr elements");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		reversearr(arr, 0, arr.length - 1);
		System.out.println("Enter how many times u want left rotate");
		int r = sc.nextInt();
		System.out.println("Enter u r choice\n1.leftrotate\n2.rightrotate");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			reversearr(arr, arr.length - r, arr.length - 1);
			break;
		}
		case 2: {
			reversearr(arr, 0, r - 1);
			break;
		}
		}

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
