package makeChange;
import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		Double itemPrice = Methods.price();
		System.out.println( "Price is " + itemPrice);

	}
}
