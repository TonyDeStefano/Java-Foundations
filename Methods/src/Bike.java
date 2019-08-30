/**
 * 
 * @author Tony DeStefano
 *
 */
public class Bike {

	private int numOfGears;
	private Double topSpeed;
	
	public Bike(int numOfGears, Double topSpeed) {
		this.numOfGears = numOfGears;
		this.topSpeed = topSpeed;
	}
	
	public int getNumOfGears() {
		return numOfGears;
	}
	
	public void setNumOfGears(int numOfGears) {
		this.numOfGears = numOfGears;
	}
	
	public Double getTopSpeed() {
		return topSpeed;
	}
	
	public void setTopSpeed(Double topSpeed) {
		this.topSpeed = topSpeed;
	}
}
