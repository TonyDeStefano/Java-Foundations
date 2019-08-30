/**
 * 
 * @author Tony DeStefano
 *
 */
public class StringLength {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String x = "Northwest";
		String y = "Rain";
		
		Integer tot = totalLength(x, y);
		System.out.println(tot);
		
		Double avg = averageLength(x, y);
		System.out.println(avg);
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static Integer totalLength(String x, String y) {
		return x.length() + y.length();
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static Double averageLength(String x, String y) {
		return totalLength(x, y).doubleValue() / 2;
	}
}
