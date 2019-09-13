package activity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class WordList {

	public static ArrayList<String> getWord() {
		
		File f = new File("src/hangman.txt");
		ArrayList<String> lines = new ArrayList<String>();
		String line;
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			line = br.readLine();
			while (line != null) {
				lines.add(line);
				line = br.readLine();
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lines;
	}
}
