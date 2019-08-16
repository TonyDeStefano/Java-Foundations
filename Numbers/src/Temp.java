/**
 * Do some conversions.
 * @author Tony DeStefano
 *
 */
public class Temp {

	/**
	 * Starting point
	 * @param args
	 */
	public static void main(String[] args) {
		
		double degreesF = 47.2;
		double degreesC = 0;
		double degreesK = 275;
		
		double convertedFtoC = convertFtoC(degreesF);
		double convertedCtoF = convertCtoF(degreesC);
		double convertedKtoF = convertKtoF(degreesK);
		
		System.out.println(convertedFtoC);
		System.out.println(convertedCtoF);
		System.out.println(convertedKtoF);
		System.out.println(convertedKtoF < convertedCtoF);
	}
	
	/**
	 * Convert F to C
	 * @param f
	 * @return
	 */
	public static double convertFtoC(double f) {
		return (f - 32) * 5/9;
	}

	/**
	 * Convert C to F
	 * @param c
	 * @return
	 */
	public static double convertCtoF(double c) {
		return (c * 9/5) + 32;
	}
	
	/**
	 * Convert K to F
	 * @param k
	 * @return
	 */
	public static double convertKtoF(double k) {
		return (k - 273.15) * 9/5 + 32;
	}
}
