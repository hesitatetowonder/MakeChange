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
			System.err.println("Error: Customer did not provide sufficient amount");
			return;
		}
		makeChange(item, payment);

	}

	public static void makeChange(double item, double payment) {
		double change = payment - item;

		if (change >= 10) {
			tenDollar(change);
		}
		else if (change < 10){
			fiveDollar(change);
		}
		else if (change < 5){
			oneDollar(change);
		}
		else if (change < 1){
			quarter(change);
 		}
		else if (change < .25){
 			dime(change);
 		}
		else if (change < .10){
 			nickel(change);
 		}
		else if (change < .05){
 			pennie(change);

 		}
	}

	public static void tenDollar(double leftOver) {
		double tenDollarBill = 0;

		while (leftOver >= 10.00) {
			leftOver = leftOver - 10;
			tenDollarBill++;
		}
		if(tenDollarBill > 1) {
			System.out.print(Math.round(tenDollarBill) + " Ten Dollar Bills");
		}
		else {
			System.out.print(Math.round(tenDollarBill) + " Ten Dollar Bill");
		}
		
		if ((leftOver >= 5.00) && (leftOver < 10)) {
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
		if(fiveDollarBill > 1) {
			System.out.print("\t\t" + Math.round(fiveDollarBill) + " Five Dollar Bills");
		}
		else if(fiveDollarBill == 1){
			System.out.print("\t\t" + Math.round(fiveDollarBill) + " Five Dollar Bill");
		}
		if (leftOver >= 1.00){
			oneDollar(leftOver);
		} else if (leftOver >= .25){
			quarter(leftOver);
		} else if (leftOver >= .10){
			dime(leftOver);
		} else if (leftOver >= .05){
			nickel(leftOver);
		} else if (leftOver >= .01){
			pennie(leftOver);
		}
	}

	public static void oneDollar(double leftOver) {
		double oneDollarBill = 0;

		while (leftOver >= 1.00) {
			leftOver = leftOver - 1.00;
			oneDollarBill++;
		}
		if(oneDollarBill > 1 ){
			System.out.print("\t\t" + Math.round(oneDollarBill) + " One Dollar Bills");
		}
		else {
			System.out.print("\t\t" + Math.round(oneDollarBill) + " One Dollar Bill");
		}
		if (leftOver >= .25){
			quarter(leftOver);
		} else if (leftOver >= .10){
			dime(leftOver);
		} else if (leftOver >= .05){
			nickel(leftOver);
		} else if (leftOver >= .01){
			pennie(leftOver);
		}
	}

	public static void quarter(double leftOver) {
		double quarter = 0;

		while (leftOver >= .25) {
			leftOver = leftOver - .25;
			quarter++;
		}
		if(quarter > 1){
			System.out.print("\t\t" + Math.round(quarter) + " Quarters");
		}
		else{
			System.out.print("\t\t" + Math.round(quarter) + " Quarter");
		}
		if (leftOver >= .10){
			dime(leftOver);
		} else if (leftOver >= .05){
			nickel(leftOver);
		} else if (leftOver >= .01){
			pennie(leftOver);
		}
	}

	public static void dime(double leftOver) {
		double dime = 0;

		while (leftOver >= .10) {
			leftOver = leftOver - .10;
			dime++;
		}
		if(dime > 1){
			System.out.print("\t\t" + Math.round(dime) + " Dimes");
		}
		else{
			System.out.print("\t\t" + Math.round(dime) + " Dime");
		}
		if (leftOver >= .05){
			nickel(leftOver);
		} else if (leftOver >= .01){

		}
	}

	public static void nickel(double leftOver) {
		double nickel = 0;

		while (leftOver >= .05) {
			leftOver = leftOver - .05;
			nickel++;
		}
		if(nickel > 1){
			System.out.print("\t\t" + Math.round(nickel) + " Nickels");
		}
		else{
			System.out.print("\t\t" + Math.round(nickel) + " Nickel");
		}

		if (leftOver >= .01){
			pennie(leftOver);
		}
	}

	public static void pennie(double leftOver) {
		double pennie = 0;

		while (leftOver >= .01) {
			leftOver = leftOver - .01;
			pennie++;
		}
		if(pennie > 1){
			System.out.print("\t\t" + Math.round(pennie) + " pennies");
		}
		else{
			System.out.println("\t\t" + Math.round(pennie) + " penny");
		}
	}
}

