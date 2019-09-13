package activity;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class StopAct {

	public static void main(String[] args) {
		
		String myString = "Enter characters, 'q' to quit.";
		File f = new File("src/stop.txt");
		PrintWriter writer = null;
		FileReader reader = null;
		
		try {
			writer = new PrintWriter(f);
			writer.write(myString);
			writer.flush();
			writer.close();
			reader = new FileReader(f);
			int ch = reader.read();
			while (ch != -1) {
				System.out.print((char)ch);
				if ((char)ch == 'q') {
					break;
				}
				ch = reader.read();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}


	}

}
