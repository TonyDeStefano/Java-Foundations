import java.util.Scanner;

/**
 * A program to plot a point on a graph based on user input.
 * @author Tony DeStefano
 *
 */
public class Coordinates {

	public static int x = 0; // x-coordinate initialized to zero
	public static int y = 0; // y-coordinate initialized to zero
	
	/**
	 * Starting point.
	 * @param args
	 */
	public static void main(String[] args) {
		
		String userInput = ""; // string to hold user input
		String buffer = ""; // string to buffer user input
		Scanner in = new Scanner(System.in); // input scanner
		
		// Ask user to enter command:
		System.out.println("Enter your coordinate string command:");
		
		// Read it into the userInput variable:
		userInput = in.next();
		
		if (userInput.length() > 0) {
			
			// Loop through the input:
			for(char ch : userInput.toUpperCase().toCharArray()) {
				switch (ch) {
					case '0':
					case '1':
					case '2':
					case '3':
					case '4':
					case '5':
					case '6':
					case '7':
					case '8':
					case '9':
						// If it's a number, add it to the buffer:
						buffer = buffer + ch;
						break;
					case 'U':
					case 'D':
					case 'L':
					case 'R':
						// If it's a direction, call a function to move the point:
						movePoint(ch, buffer);
					default:
						// Reset the buffer if any of the direction commands or 
						// non-recognized character was encountered:
						buffer = "";
				}
			}
		}
		
		// Print out the final coordinates:
		System.out.printf("(%d,%d)", x, y);
		
		// For fun, print a graph if the point fits on a 21 X 21 area:
		if (x <= 10 && x >= -10 && y <= 10 && y >= -10) {
			plotGraph();
		}
		
		in.close();
	}
	
	/**
	 * 
	 * @param direction char designating direction
	 * @param buffer String designating the number of spaces (if any)
	 */
	public static void movePoint(char direction, String buffer) {
		
		// If the buffer is empty, then move the point one space:
		int spaces = (buffer.length() > 0) ? Integer.parseInt(buffer) : 1;
	
		if (direction == 'U') {
			y += spaces;
		} else if (direction == 'D') {
			y -= spaces;
		} else if (direction == 'L') {
			x -= spaces;
		} else {
			x += spaces;
		}
	}

	/**
	 * Prints out a little graph.
	 */
	public static void plotGraph() {
		
		System.out.println("");
		
		// Y-Axis top to bottom:
		for (int yAxis = 10; yAxis >= -10; yAxis--) {
			
			// X-Axis left right:
			for (int xAxis = -10; xAxis <= 10; xAxis++) {
				
				if (xAxis == x && yAxis == y) {
					System.out.printf("X");
				} else if (xAxis == 0 && yAxis == 0) {
					System.out.printf("+");
				} else if (yAxis == 0) {
					System.out.printf("-");
				} else if (xAxis == 0) {
					System.out.printf("|");
				} else {
					System.out.printf(" ");
				}
			}
			
			System.out.println("");
		}
	}
}