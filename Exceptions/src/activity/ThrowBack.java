package activity;

/**
 * 
 * @author Tony DeStefano
 *
 */
public class ThrowBack {

	/**
	 * Starting point.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n = 99;
		
		try {
			isItWorthy(n);
			System.out.println(n + " is totally cool with me.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
	
	public static void isItWorthy(int n) throws Exception {
		
		if (n < 10) {
			throw new Exception("That number is not worthy. It must be greater than or equal to 10.");
		}
	}
}
