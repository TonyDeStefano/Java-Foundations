/**
 * 
 * @author Tony DeStefano
 *
 */
public class SwappingExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x = 9;
		int y = 44;
		
		System.out.println(x);
		System.out.println(y);
		swap(x, y);
	}
	
	public static void swap(int x, int y) {
		
		int z = x;
		x = y;
		y = z;
		
		System.out.println(x);
		System.out.println(y);
	}

}
