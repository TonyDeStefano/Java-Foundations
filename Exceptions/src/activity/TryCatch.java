package activity;

/**
 * 
 * @author Tony DeStefano
 *
 */
public class TryCatch {

	/**
	 * Starting point.
	 * @param args
	 */
	public static void main(String[] args) {

		char[] c = new char[10];
		
		try {
			c[10] = 'T';
		} catch (Exception e) {
			System.out.println("You cannot do that. Why? Because: " + e.getMessage());
		}

	}
}
