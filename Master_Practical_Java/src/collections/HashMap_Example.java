package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example {
	
	public static void main(String[] args) {
		
		// LinkedHashMap - Sorts by input order
		// TreeMap - Sorts by A-> or 1->
		
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Brave", "Ready to face and endure danger or pain; showing courage.");
		dictionary.put("Brilliant", "Exceptionally clever or talented.");
		dictionary.put("Joy", "A feeling of great pleasure and happiness.");
		dictionary.put("Confidence", "The feeling or belief that one can have faith in or rely on someone or something");
		
		for(String word : dictionary.keySet()) {
			System.out.println(word + " - " + dictionary.get(word));
		}
		
		System.out.print("\n");
		
		for(Map.Entry<String, String> values : dictionary.entrySet()) {
			System.out.println(values);
		}
	}

}