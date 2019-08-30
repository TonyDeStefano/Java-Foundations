/**
 * 
 * @author Tony DeStefano
 *
 */
public class Rider {

	private String name;
	private Bike bike;
	
	public Rider(String name, Bike bike) {
		this.setBike(bike);
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Bike getBike() {
		return bike;
	}
	
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	
	public void printDetails() {
		System.out.println(this.name + " is riding a " + bike.getNumOfGears() + "-gear bike with a top speed of " + bike.getTopSpeed() + "mph.");
	}
}
