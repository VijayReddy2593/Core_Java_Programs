package corejava;

import java.util.Scanner;

public class Miss_ele_arr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		boolean find = false;
		int count = 1;
		System.out.println("Elements not in the array are:");
		while (count <= arr[arr.length - 1]) {
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == count) {
					
					find = true;
					break;
				}
			}
			if (find == false) {

				System.out.print(count+" ");
			}
			find = false;
			count++;
		}
	}

}
