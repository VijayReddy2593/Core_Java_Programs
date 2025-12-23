package corejava;

import java.util.Scanner;

public class Armstrong {
	static boolean isarm(int num) {
		int result = 0;
		String str = Integer.toString(num);
		int length = str.length();
		int temp = num;
		boolean status = false;
		while (num != 0) {
			int digit = num % 10;
			num = num / 10;
			result = result + (int) Math.pow(digit, length);
		}
		if (result == temp) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting number");
		int start=sc.nextInt();
		System.out.println("Enter Ending number");
		int end=sc.nextInt();

		 System.out.println("Arm strong numbers between "+ start +" and "+end +" are:");
		for(int i=start;i<=end;i++) {
			if(isarm(i)) {
				System.out.print(i+" ");
			}
		}
//		while (true) {

//			System.out.println("Enter length of the digit ");
//			int choice = sc.nextInt();
//			int num = 0;
//			switch (choice) {
//			case 1:
//				System.out.println("Enter 1 digit  number");
//				num = sc.nextInt();
//				if (isarm(num)) {
//					System.out.println(num + " is an armstrong number");
//				} else {
//					System.out.println(num + " is not an armstrong number");
//				}
//				break;
//				
//			case 2:
//				System.out.println("Enter 2 digit  number");
//				num = sc.nextInt();
//				if (isarm(num)) {
//					System.out.println(num + " is an armstrong number");
//				} else {
//					System.out.println(num + " is not an armstrong number");
//				}
//				break;
//				
//			case 3:
//				System.out.println("Enter 3 digit  number");
//				num = sc.nextInt();
//				if (isarm(num)) {
//					System.out.println(num + " is an armstrong number");
//				} else {
//					System.out.println(num + " is not an armstrong number");
//				}
//				break;
//				
//			case 4:
//				System.out.println("Enter 4 digit  number");
//				num = sc.nextInt();
//				if (isarm(num)) {
//					System.out.println(num + " is an armstrong number");
//				} else {
//					System.out.println(num + " is not an armstrong number");
//				}
//				break;
//				default: System.out.println("invalid input");
//				break;
//			}

//		}

	}

}
