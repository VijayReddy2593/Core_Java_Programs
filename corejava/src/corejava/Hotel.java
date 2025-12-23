package corejava;

import java.util.Scanner;


public class Hotel {
	static float totalamount;
	static float amountafterdicount;
	Scanner sc = new Scanner(System.in);
    int choice1;
    int choice2;
    int choice3;
	void vegitem() {
		
        
		System.out.println("select your veg dishes\n 1: panner\n2:dal\n3:pulihora");
		choice1 = sc.nextInt();
		int dal = 50;
		int pulihora = 150;
		int panner = 200;
		switch (choice1) {
		case 1:
			totalamount += panner;
			break;
		case 2:
			totalamount += dal;
			break;
		case 3:
			totalamount += pulihora;
			break;
		default:
			System.out.println("select the correct option from the menu");
			break;
		}

	}

	void nonveg() {

		

		System.out.println("select your Non veg dishes\n 1: Chicken\n2:Mutton\n3:fish");
		choice2 = sc.nextInt();
		int chicken = 120;
		int mutton = 250;
		int fish = 200;
		switch (choice2) {
		case 1:
			totalamount += chicken;
			break;
		case 2:
			totalamount += mutton;
			break;
		case 3:
			totalamount += fish;
			break;
		default:
			System.out.println("select the correct option from the menu");
			break;
		}


	}


	void desserts() {
		

		System.out.println("select your desserts\n 1: icecream\n2:gulabjam\n3:kaddukakir");
		choice3 = sc.nextInt();
		int icecream = 80;
		int gulabjam = 60;
		int kaddukakir = 40;
		switch (choice3) {
		case 1:
			totalamount += icecream;
			break;
		case 2:
			totalamount += gulabjam;
			break;
		case 3:
			totalamount += kaddukakir;
			break;
		default:
			System.out.println("select the correct option from the menu");
			break;
		}

	}
	void Choices() {
		System.out.println("Selected items are:");
		if(choice1==1) {
			System.out.println("panner=200"); 
		}
		if(choice1==2){
			System.out.println("Dal=50");
		} 
		if(choice1==3){
			System.out.println("Pulihora=150");
		}
		
		
		 if(choice2==1) {
			System.out.println("Chicken=120"); 
		} 
		 if(choice2==2){
			System.out.println("Mutton=250");
		} 
		 if(choice2==3) {
			System.out.println("Fish=200");
		}
		
		
		
		 if(choice3==1) {
			System.out.println("Ice Cream=80"); 
		}
		 if(choice3==2){
			System.out.println("Gulabjam=60");
		}
		 if(choice3==3){
			System.out.println("Kaddukakir=40");
		}
		
		
	}

	void Discount() {
		System.out.println("Enter the discount");
		float discount = sc.nextInt();
		float amount = totalamount * (discount / 100);
		amountafterdicount = totalamount - amount;
		System.out.println("Discount amount: " + amount);
		System.out.println("Amount After discount : " + amountafterdicount);
		System.out.println("=================================================================");
	}

	static void displaybill() {
		System.out.println(
				"The total amount is: " + totalamount + "\n=========================================================");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hotel obj = new Hotel();
		int choice;
		while (true) {

			System.out.println(
					"Enter your choice \n1:veg\n2:nonveg\n3:desserts\n4:veg & desserts\n5:nonveg & desserts\n6:veg & nonveg & desserts\n");
			choice = sc.nextInt();
			switch (choice) {

			case 1:
				totalamount = 0;
				obj.vegitem();
				obj.Choices();
				displaybill();
				if (totalamount >= 200) {
					amountafterdicount = 0;
					obj.Discount();
				}
				break;
			case 2:
				totalamount = 0;
				obj.nonveg();
				obj.Choices();
				displaybill();
				if (totalamount >= 200) {
					amountafterdicount = 0;
					obj.Discount();
				}
				break;
			case 3:
				totalamount = 0;
				obj.desserts();
				obj.Choices();
				displaybill();
				if (totalamount >= 200) {
					amountafterdicount = 0;
					obj.Discount();
				}
				break;
			case 4:
				totalamount = 0;
				obj.vegitem();
				obj.desserts();
				obj.Choices();
				displaybill();
				if (totalamount >= 200) {
					amountafterdicount = 0;
					obj.Discount();
				}
				break;
			case 5:
				totalamount = 0;
				obj.nonveg();
				obj.desserts();
				obj.Choices();
				displaybill();
				if (totalamount >= 200) {
					amountafterdicount = 0;
					obj.Discount();
				}
				break;
			case 6:
				totalamount = 0;
				obj.vegitem();
				obj.nonveg();
				obj.desserts();
				obj.Choices();
				displaybill();
				if (totalamount >= 200) {
					amountafterdicount = 0;
					obj.Discount();
				}
				break;
			default:
				System.out.println("enter correct choice");
				break;

			}
			
			//sc.close();
		}
		
	}

}
