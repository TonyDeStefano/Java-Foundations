import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Tony DeStefano
 *
 */
public class LoopingArrays {

	public static void main(String[] args) {
		
		List<String> months = new ArrayList<String>();
		
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		for(int x=0; x<months.size(); x++) {
			System.out.println(months.get(x));
		}
		
		System.out.println("---");
		
		for(String m : months) {
			System.out.println(m);
		}

	}

}
