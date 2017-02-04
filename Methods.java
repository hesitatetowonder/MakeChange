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
			System.out.println("Customer still owes " + owe);
			return;
		}
		makeChange(item, payment);

	}

	public static void makeChange(double item, double payment) {
		double change = payment - item, leftOver;
		String customerChange;
		if (change > 10) {
			tenDollar(change);
		}
	}

	public static void tenDollar(double change) {
		double leftOver = 0;
		while (change > 10.00) {
			double tenDollarBill = 1;
			leftOver = change % 10.0;
			change = change - 10;
			tenDollarBill++;
			System.out.println(tenDollarBill + "Ten Dollar Bill(s)");
		}
		if (leftOver > .25){	
			quarter(leftOver);
		}
	}
	
	public static void quarter(double leftOver) {
		double quarter = 0, toDime;
			while (leftOver > .25) {
				quarter = 1;
				toDime = leftOver % .25;
				leftOver = leftOver - .25;
				quarter++;
			}
		System.out.println(quarter + "Quarter(s)");
	}
}
	
