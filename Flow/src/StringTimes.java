/**
 * 
 * @author Tony DeStefano
 *
 */
public class StringTimes {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "code";
		int n = 5;
		StringBuilder builder = new StringBuilder();
		
		for (int i=1; i<=n; i++) {
			builder.append(str);
		}
		
		System.out.println(builder.toString());
	}

}
