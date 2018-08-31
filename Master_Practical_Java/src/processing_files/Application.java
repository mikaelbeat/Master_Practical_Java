package processing_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {

//		writer();
//		calculator(6, 7);
		
		String filePath = System.getProperty("user.dir")+"\\src\\processing_files\\test.txt";
		File file = new File(filePath);
		Scanner input = new Scanner(file);
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
	}
	
	public static void writer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter some text: ");
		String enteredText = input.nextLine();
		System.out.println(enteredText);
		input.close();
	}
	
	public static int calculator(int num1, int num2) throws Exception{
		int remainder = num1 - num2;
		if(remainder < 0) {
			throw new Exception("Remainder is less than 0!");
		}
		System.out.println("Remainder for numbers is: " + remainder);
		return remainder;
	}
}