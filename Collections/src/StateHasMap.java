import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author Tony DeStefano
 *
 */
public class StateHasMap {

	public static void main(String[] args) {
		
		Map<String, String> states = new HashMap<String, String>();
		
		states.put("WA", "Washington");
		states.put("OR", "Oregon");
		states.put("CA", "California");
		states.put("ID", "Idaho");
		states.put("MT", "Montana");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a state code: ");
		String abbr = in.nextLine().toUpperCase();
		System.out.println(states.get(abbr));
		in.close();
	}

}
