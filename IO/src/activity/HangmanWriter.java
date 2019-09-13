package activity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class HangmanWriter {
	
	public static void main(String[] args) {
		FileWriter fr = null;
		BufferedWriter bw = null;
		File file;
		
		try {
			file = new File("src/hangman.txt");
			fr = new FileWriter(file);
			bw = new BufferedWriter(fr);
			bw.write("Java is fun\n");bw.write("University of Washington\n");bw.write("Its a warm day out\n");bw.write("Go Huskies\n");bw.write("Rain is on the horizon\n");bw.write("Mac or PC\n");bw.write("Android or ios\n");bw.write("wheel of fortune\n");System.out.println("Done");bw.flush();bw.close();fr.close();} catch (Exception e) {e.printStackTrace();} finally {try {bw.close();fr.close();} catch (Exception e) {e.printStackTrace();}}}}
