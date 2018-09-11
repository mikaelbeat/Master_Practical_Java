package client;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws FileNotFoundException {


		String filePath = System.getProperty("user.dir")+"\\stock_analysis_project\\data\\table.csv";
		System.out.println(filePath);
		
		File file = new File(filePath);
		Scanner input = new Scanner(file);
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
	}

	}