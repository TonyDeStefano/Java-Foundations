/**
 * 
 * @author Tony DeStefano
 *
 */
public class Driver {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car = new Car("Subaru", "Crosstrek", 2018, "Grey");
		
		System.out.println(car.getId());
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		System.out.println(car.getColor());
		
		Car car2 = new Car("Mazda", "CX-5", 2016, "Grey");
		
		System.out.println(car2.getId());
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		System.out.println(car2.getColor());

	}

}
