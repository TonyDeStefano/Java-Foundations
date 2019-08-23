/**
 * 
 * @author Tony DeStefano
 *
 */
public class Grades {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int grade = 99;
		
		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
