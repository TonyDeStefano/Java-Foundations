/**
 * 
 * @author Tony DeStefano
 *;
 */
public class MissingChar {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "kitten";
		int n = 4;
		
		String start = str.substring(0, n);
		String end = str.substring(n + 1);
		String newString = start + end;
		System.out.println(newString);
	}
}
