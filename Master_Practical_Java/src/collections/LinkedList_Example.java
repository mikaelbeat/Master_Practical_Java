package collections;

import java.util.LinkedList;

public class LinkedList_Example {

	public static void main(String[] args) {
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(50);
		numbers.add(75);
		numbers.add(30);
		numbers.add(25);
		numbers.remove(0);
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
	}

}