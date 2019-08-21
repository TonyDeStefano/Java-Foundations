/**
 * 
 * @author Tony DeStefano
 *
 */
public class EndUp {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "hi there";
		String first = str.substring(0, str.length() - 3);
		String last = str.substring(str.length() - 3).toUpperCase();
		System.out.println(first + last);
	}

}
