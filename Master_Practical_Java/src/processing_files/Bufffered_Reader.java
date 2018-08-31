package processing_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bufffered_Reader {

	public static void main(String[] args) {
		
		String filePath = System.getProperty("user.dir")+"\\src\\processing_files\\test.txt";
		File file = new File(filePath);
		BufferedReader bufferedReader = null;
		try {
			FileReader fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!!");
		} catch (IOException e) {
			System.out.println("Cannot read file " + file.getName());
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("Unable to close file " + file.getName());
			}
		}
	}
}