package collections;

import java.util.ArrayList;

public class ArrayList_Example {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("Hello");
		words.add("there!");
//		words.remove(0);
		
		String item1 = (String) words.get(0);
		System.out.println("Item in slot 2 is: " + item1);
		
	}

}