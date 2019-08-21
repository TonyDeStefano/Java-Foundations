/**
 * 
 * @author Tony DeStefano
 *
 */
public class StartHi {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str1 = "hi there";
		String str2 = "hello hi";
		String assertion = "hi";
		
		System.out.println(str1.substring(0, 2).equals(assertion));
		System.out.println(str2.substring(0, 2).equals(assertion));
	}
}
