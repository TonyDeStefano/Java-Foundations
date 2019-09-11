package activity;

@SuppressWarnings("serial")
public class OverWeightLimitException extends Exception {

	public OverWeightLimitException() {
		super("Your vehicle is too damn heavy.");
	}
	
	public String toString() {
		return "Honk Honk! " + this.getMessage();
	}
}
