package makeChange;

import java.util.Scanner;

public class Methods {
	static Scanner kb = new Scanner(System.in);

	public static double price() {
		System.out.print("What is the price of the item? ");
		double price = kb.nextDouble();
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
		double change = payment - item, leftOver;
		String customerChange;
		if (change >= 10) {
			tenDollar(change);
		} else if ((change < 10) && (change > 5)) {
			fiveDollar(change);
		} else if ((change < 5) && (change > 1)) {
			oneDollar(change);
		} else if ((change < 1) && (change > .25)){
			quarter(change);
		}
	}

	public static void tenDollar(double change) {
		double leftOver = 0, tenDollarBill = 0;
		while (change >= 10.00) {
			tenDollarBill = 1;
			leftOver = change % 10.0;
			change = change - 10;
			tenDollarBill++;
		}
		System.out.println(tenDollarBill + " Ten Dollar Bill(s)");
		if (leftOver >= 5.00) {
			fiveDollar(leftOver);
		} else if (leftOver >= 1.00) {
			oneDollar(leftOver);
		} else if (leftOver >= .25) {
			quarter(leftOver);
		}
	}

	public static void fiveDollar(double leftOver) {
		double fiveDollarBill = 0, oneDollarBill;
		while (leftOver >= 5.00) {
			fiveDollarBill = 0;
			oneDollarBill = leftOver % 5.00;
			leftOver = leftOver - 5.00;
			fiveDollarBill++;
		}
		System.out.println(fiveDollarBill + " Five Dollar Bill(s)");
		if ((leftOver >= 1.00) && (leftOver < 5.00)) {
			oneDollar(leftOver);
		}
	}

	public static void oneDollar(double leftOver) {
		double oneDollarBill = 0, quarter = 1;
		while (leftOver >= 1.00) {
			quarter = leftOver % 1;
			leftOver = leftOver - 1.00;
			oneDollarBill++;
		}
		System.out.println(oneDollarBill + " One Dollar Bill(s)");
		if ((leftOver >= .25) && (leftOver < 1.00)) {
			quarter(leftOver);
		}
	} 
	
	public static void quarter(double leftOver) {
		double quarter = 0;
		while (leftOver >= .25) {
			leftOver = leftOver - .25;
			quarter++;
		}
		System.out.println(quarter + " Quarter(s)");
		System.out.println(leftOver);
		
	}
		
}


