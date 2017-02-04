package makeChange;

import java.util.Scanner;

public class Methods {
	static Scanner kb = new Scanner(System.in);

	public static double price() {
		double price;
		
		System.out.print("What is the price of the item? ");
		price = kb.nextDouble();
		return price;
	}

	public static void money(double item) {
		double owe;

		System.out.println("How much money did the customer provide? ");
		double payment = kb.nextDouble();
		if (payment == item) {
			System.out.println("Exact amount");
			return;
		}
		if (payment < item) {
			owe = item - payment;
			System.err.println("Error: Customer still owes " + owe);
			return;
		}
		makeChange(item, payment);

	}

	public static void makeChange(double item, double payment) {
		double change = payment - item;
		
		if (change >= 10) {
			tenDollar(change);
		} 
		else if ((change < 10) && (change >= 5)) {
			fiveDollar(change);
		} 
		else if ((change < 5) && (change >= 1)) {
			oneDollar(change);
		} 
		else if ((change < 1) && (change >=.25)){
			quarter(change);
 		} 
		else if ((change < .25) && (change >= .10)){
 			dime(change);
 		} 
		else if ((change < .10) && (change >= .05)){
 			nickel(change);
 		} 
		else if ((change < .05) && (change >= .01)){
 			pennie(change);
 		
 		}
	}

	public static void tenDollar(double leftOver) {
		double tenDollarBill = 0;
		
		while (leftOver >= 10.00) {
			leftOver = leftOver - 10;
			tenDollarBill++;
		}
		System.out.print(tenDollarBill + " Ten Dollar Bill(s)");
		if (leftOver >= 5.00) {
			fiveDollar(leftOver);
		} else if (leftOver >= 1.00) {
			oneDollar(leftOver);
		} else if (leftOver >= .25) {
			quarter(leftOver);
		} else if (leftOver >= .10) {
			dime(leftOver);
		} else if (leftOver >= .05) {
			nickel(leftOver);
		} else if (leftOver >= .01) {
			pennie(leftOver);
		}
	}

	public static void fiveDollar(double leftOver) {
		double fiveDollarBill = 0;

		while (leftOver >= 5.00) {
			fiveDollarBill = 0;
			leftOver = leftOver - 5.00;
			fiveDollarBill++;
		}
		System.out.print("\t" + fiveDollarBill + " Five Dollar Bill(s)");
		if ((leftOver >= 1.00) && (leftOver < 5.00)) {
			oneDollar(leftOver);
		} else if ((leftOver >= .25) && (leftOver < 1.00)) {
			quarter(leftOver);
		} else if ((leftOver >= .10) && (leftOver < .25)) {
			dime(leftOver);
		} else if ((leftOver >= .05) && (leftOver < .10)) {
			nickel(leftOver);
		} else if ((leftOver >= .05) && (leftOver < .05)) {
			pennie(leftOver);
		}
	}

	public static void oneDollar(double leftOver) {
		double oneDollarBill = 0;

		while (leftOver >= 1.00) {
			leftOver = leftOver - 1.00;
			oneDollarBill++;
		}
		System.out.print("\t" + oneDollarBill + " One Dollar Bill(s)");
		if ((leftOver >= .25) && (leftOver < 1.00)) {
			quarter(leftOver);
		} else if ((leftOver >= .10) && (leftOver < .25)) {
			dime(leftOver);
		} else if ((leftOver >= .05) && (leftOver < .10)) {
			nickel(leftOver);
		} else if ((leftOver >= .01) && (leftOver < .05)) {
			pennie(leftOver);
		}
	}

	public static void quarter(double leftOver) {
		double quarter = 0;

		while (leftOver >= .25) {
			leftOver = leftOver - .25;
			quarter++;
		}
		System.out.print("\t" + quarter + " Quarter(s)");
		if ((leftOver >= .10) && (leftOver < .25)) {
			dime(leftOver);
		} else if ((leftOver >= .05) && (leftOver < .10)) {
			nickel(leftOver);
		} else if ((leftOver >= .01) && (leftOver < .05)) {
			pennie(leftOver);
		}
	}

	public static void dime(double leftOver) {
		double dime = 0;

		while (leftOver >= .10) {
			leftOver = leftOver - .10;
			dime++;
		}
		System.out.print("\t" + dime + " Dime(s)");
		if ((leftOver >= .05) && (leftOver < .10)) {
			nickel(leftOver);
		} else if ((leftOver >= .01) && (leftOver < .05)) {

		}
	}

	public static void nickel(double leftOver) {
		double nickel = 0;
	
		while (leftOver >= .05) {
			leftOver = leftOver - .05;
			nickel++;
		}
		System.out.print("\t" + nickel + " Nickel(s)");
		
		if ((leftOver >= .01) && (leftOver < .05)) {
			pennie(leftOver);
		}
	}
	
	public static void pennie(double leftOver) {
		double pennie = 0;
		
		while (leftOver >= .01) {
			leftOver = leftOver - .01;
			pennie++;
		}
		System.out.print("\t" +  pennie + " pennie(s)");

	}
}

