package makeChange;

import java.util.Scanner;

public class ModulusMethods {
	static Scanner kb = new Scanner(System.in);

	public static double price() {
		System.out.print("Price of transaction : ");
		double price = kb.nextDouble();
		return price;
	}

	public static double payment(double price) {
		System.out.print("Amount tendered by customer : ");
		double paid = kb.nextDouble();
		double change = paid - price;

		if (paid == price) {
			System.out.println("Customer tendered exact amount");
			change = 0;
		} else if (paid < price) {
			System.err.println("ERROR : Customer did not tender enough to cover transaction");
			change = 0;
		}
		return change;
	}
	
	public static int convert(double decimal){
		
		double hold = decimal * 100;
		int change = (int) Math.round(hold);
		System.out.print("Your change is : ");
		return change;
	}
	
	public static void tenDollarBill(int change) {
		int tenDollar = change / 1000;
		
		if(tenDollar == 1){
			System.out.print(tenDollar + " Ten Dollar Bill");
		}
		else if(tenDollar > 1){
			System.out.print(tenDollar + " Ten Dollar Bills");
		}
		change = change % 1000;
		if(change > 0){
			fiveDollarBill(change);
		}
	}
	
	public static void fiveDollarBill(int change){
		int fiveDollar = change / 500;
		
		if(fiveDollar == 1){
			System.out.print( "    " + fiveDollar + " Five Dollar Bill");
		}
		else if(fiveDollar > 1){
			System.out.print("    " + fiveDollar + " Five Dollar Bills");
		}
		change = change % 500;
		if(change > 0){
			oneDollarBill(change);
		}
	}
	public static void oneDollarBill(int change){
		int oneDollar = change / 100;
		
		if(oneDollar == 1){
			System.out.print("    " + oneDollar + " One Dollar Bill");
		}
		else if(oneDollar > 1){
			System.out.print("    " + oneDollar + " One Dollar Bills");
		}
		change = change % 100;
		if(change > 0){
			quarter(change);
		}
	}
	
	public static void quarter(int change){
		int quarter = change / 25;
		
		if(quarter == 1){
			System.out.print("    " + quarter + " Quarter");
		}
		else if(quarter > 1){
			System.out.print("    " + quarter + " Quarters");
		}
		change = change % 25;
		if(change > 0){
			dime(change);
		}
	}
	
	public static void dime(int change){
		int dime = change / 10;
		
		if(dime == 1){
			System.out.print("    " + dime + " Dime");
		}
		else if(dime > 1){
			System.out.print("    " + dime + " Dimes");
		}
		change = change % 10;
		if(change > 0){
			nickel(change);
		}
	}
	
	public static void nickel(int change){
		int nickel = change / 5;
		
		if(nickel == 1){
			System.out.print("    " + nickel + " Nickel");
		}
		else if(nickel > 1){
			System.out.print("    " + nickel + " Nickels");
		}
		change = change % 5;
		if(change > 0){
			penny(change);
		}
	}
	
	public static void penny(int change){
		int penny = change / 1;
		
		if(penny == 1){
			System.out.print("    " + penny + " Penny");
		}
		else if(penny > 1){
			System.out.print("    " + penny + " Pennies");
		}
		change = change % 1;
		if(change > 0){
			System.out.println("\nTransaction complete");
		}
	}
}
