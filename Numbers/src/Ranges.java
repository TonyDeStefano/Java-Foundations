/**
 * 
 * @author Tony DeStefano
 *
 */
public class Ranges {

	/**
	 * Starting point
	 * @param args
	 */
	public static void main(String[] args) {
	
		byte myByte = 127;
		myByte++;
		System.out.println(myByte);
		
		Integer myInt = 1;
		Double myDouble = 1.1;
		
		Integer intMax = myInt.MAX_VALUE;
		Double dblMax = myDouble.MAX_VALUE;
		
		System.out.println(intMax);
		System.out.println(dblMax);
		intMax++;
		dblMax++;
		System.out.println(intMax);
		System.out.println(dblMax);
	}

}
