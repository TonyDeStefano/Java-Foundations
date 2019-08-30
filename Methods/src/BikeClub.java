/**
 * 
 * @author Tony DeStefano
 *
 */
public class BikeClub {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Bike bike1 = new Bike(18, 45.5);
		Bike bike2 = new Bike(1, 19.0);
		Rider rider1 = new Rider("Jane", bike1);
		Rider rider2 = new Rider("John", bike2);
		rider1.printDetails();
		rider2.printDetails();
	}
}
