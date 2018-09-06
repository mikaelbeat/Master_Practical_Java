package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Comparable {
	
	public static void main(String[] args) {
		
		HashSet<Integer> list1 = new HashSet<Integer>();
		
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		
		
		List<Integer> li = new ArrayList<Integer>(list1);
		
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		newList.add(10);
		
		list1.addAll(newList);
		
		System.out.println(list1);
		
		list1.removeAll(newList);
		
//		list1.clear(); * Clears list
		
		System.out.println(list1);
		
		boolean hasValue = list1.contains(67);
		
//		boolean hasValue = list1.retainAll(newList); * Removes all values from list1 which are not in newList
		
		System.out.println(hasValue);
		
		
		
		
	}

}