/**
 * 
 * @author Tony DeStefano
 *
 */
public class BackAround {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "cat";
		String last = str.substring(str.length() - 1);
		
		System.out.println(last + str + last);
	}

}
