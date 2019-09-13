package activity;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyAct {

	public static void main(String[] args) {
		
		String file1 = "src/file1.txt";
		String file2 = "src/file2.txt";
		String myString = "Difficult difficult lemon difficult";
		FileOutputStream fout1 = null;
		FileOutputStream fout2 = null;
		FileInputStream fin = null;
		
		try {
			fout1 = new FileOutputStream(file1);
			fout1.write(myString.getBytes());
			fin = new FileInputStream(file1);
			fout2 = new FileOutputStream(file2);
			int n = fin.read();
			while (n != -1) {
				fout2.write(n);
				n = fin.read();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fin.close();
				fout1.close();
				fout1.close();
				fout2.close();
				fout2.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
