/**
 * 
 * @author Tony DeStefano
 *
 */
public class FactorTwo {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n = 99;
		int divs = 0;
		
		while (true) {
			n = n/2;
			if (n > 2) {
				divs++;
			} else {
				break;
			}
		}
		
		System.out.println(divs);
	}

}
