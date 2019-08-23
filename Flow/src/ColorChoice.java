/**
 * 
 * @author Tony DeStefano
 *
 */
public class ColorChoice {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String color = "blue";
		
		switch (color.toUpperCase()) {
			case "BLUE":
			case "RED":
			case "YELLOW":
				System.out.println(color.toUpperCase());
				break;
			default:
				System.out.println("Not a primary color.");
		}
	}

}
