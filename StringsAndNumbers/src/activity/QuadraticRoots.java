package activity;

public class QuadraticRoots {

	public static void main(String[] args) {
		
		brainHurt(2, 4, -4);
	}

	public static void brainHurt(double a, double b, double c) {
		
		double x;
		double y;
		
		double firstPart = (-1 * b);
		double secondPart = Math.sqrt((b * b) - (4 * a * c));
		double thirdPart = (2 * a);
		
		x = (firstPart + secondPart) / thirdPart;
		y = (firstPart - secondPart) / thirdPart;
		
		System.out.println(PrettyNumbers.decimalFormatter("#.##", x));
		System.out.println(PrettyNumbers.decimalFormatter("#.##", y));	
	}
}
