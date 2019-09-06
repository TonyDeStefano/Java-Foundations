package activity;

import java.util.Calendar;

public class UsingCalendar {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(1929, 9, 29);
		
		System.out.printf("The stock market crashed on %tB %te, %tY%n", c, c, c);
		System.out.printf("The stock market crashed on %tm/%te/%ty%n", c, c, c);
	}

}
