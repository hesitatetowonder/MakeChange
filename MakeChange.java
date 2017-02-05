package makeChange;


public class MakeChange {
	public static void main(String[] args) {
		
		Double itemPrice = ModulusMethods.price();
		
		Double change = ModulusMethods.payment(itemPrice);
		
	    int mainNum = ModulusMethods.convert(change);
		
	    ModulusMethods.tenDollarBill(mainNum);

	}
}
 