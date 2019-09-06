package activity;

import java.text.DecimalFormat;

public class PrettyNumbers {

	public static void main(String[] args) {
		
		System.out.println(decimalFormatter("##,##.###", 123456.789 ));
	}
	
	static public String decimalFormatter(String pattern, double value ) {
      DecimalFormat myFormatter = new DecimalFormat(pattern);
      String output = myFormatter.format(value);
      return output;
   }


}
