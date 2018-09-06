package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Sort_collection {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(12);
		hashSet.add(43);
		hashSet.add(15);
		hashSet.add(67);
		hashSet.add(43);
		
		// Converts HashSet to Arraylist, DUPLICATES ARE NOT COPIED
		ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);
		
		Collections.sort(myList);
		
		System.out.println(myList);
		
		
	}

}