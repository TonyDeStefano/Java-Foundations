package activity;

public class TrigValues {

	public static void main(String[] args) {
		
		doStuff(90);
	}
	
	public static void doStuff(double degrees) {
		
		double rads = degrees * Math.PI/180;
		double sin = Math.sin(rads);
		double cos = Math.cos(rads);
		double tan = Math.tan(rads);
		
		System.out.println(PrettyNumbers.decimalFormatter("#.##", rads));
		System.out.println(PrettyNumbers.decimalFormatter("#.##", sin));
		System.out.println(PrettyNumbers.decimalFormatter("#.##", cos));
		System.out.println(PrettyNumbers.decimalFormatter("###,###.##", tan));
	}
}
