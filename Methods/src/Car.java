/**
 * 
 * @author Tony DeStefano
 *
 */
public class Car {
	
	private static int id = 0;
	
	private String make;
	private String model;
	private int year;
	private String color;
	
	/**
	 * 
	 * @param make
	 * @param model
	 * @param year
	 * @param color
	 */
	public Car(String make, String model, int year, String color) {
		
		id++;
		
		this
			.setMake(make)
			.setModel(model)
			.setYear(year)
			.setColor(color);
	}
	
	public int getId() {
		return id;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getColor() {
		return color;
	}
	
	public Car setMake(String val) {
		this.make = val;
		return this;
	}
	
	public Car setModel(String val) {
		this.model = val;
		return this;
	}
	
	public Car setYear(int val) {
		this.year = val;
		return this;
	}
	
	public Car setColor(String val) {
		this.color = val;
		return this;
	}

}
