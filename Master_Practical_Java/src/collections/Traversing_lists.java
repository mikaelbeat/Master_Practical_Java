package collections;

import java.util.ArrayList;
import java.util.List;

public class Traversing_lists {
	
	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Tiger");
		animals.add("Snake");
		
		for(int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		System.out.print("\n");
		
		for(String animal : animals) {
			System.out.println(animal);
		}
		
		System.out.print("\n");
		
		print_Elements(animals);
	}
	
	public static void print_Elements(List somelist) {
		for(int i = 0; i < somelist.size(); i++) {
			System.out.println(somelist.get(i));
		}
	}

}