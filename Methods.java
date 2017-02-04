package makeChange;
import java.util.Scanner;


public class Methods {
	static Scanner kb = new Scanner(System.in);
	
	public static double price () {
		
	System.out.print( "What is the price of the item? ");
	double price = kb.nextDouble();
	return price;
	}

}
