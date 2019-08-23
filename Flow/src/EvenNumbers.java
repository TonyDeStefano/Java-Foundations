/**
 * 
 * @author Tony DeStefano
 *
 */
public class EvenNumbers {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n = 25;
		
		for (int x=1; x<=n; x++) {
			if (x%2 == 0) {
				System.out.printf("%s ", x);
			}
		}
	}

}
