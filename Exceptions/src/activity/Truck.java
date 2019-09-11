package activity;

public class Truck {

	public static void main(String[] args) {

		try {
			weight(1000000);
		} catch (OverWeightLimitException e) {
			System.out.println(e);
		}
	}
	
	public static void weight(int n) throws OverWeightLimitException {
		
		if (n > 10000) {
			throw new OverWeightLimitException();
		} else {
			System.out.println("Your vehicle is just fine.");
		}
	}

}
