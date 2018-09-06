package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_Example {
	
	public static void main(String[] args) {
		
		HashSet<Integer> values = new HashSet<Integer>();
		values.add(12);
		values.add(43);
		values.add(43); // HashSet does not display duplicate values
		values.add(15);
		values.add(27);
		values.add(33);
		values.add(67);
		values.add(70);
		
		System.out.println("From HashSet, order is not maintained.");
		for(Integer value : values) {
			System.out.println(value);
		}
		
		System.out.print("\n");
		
		LinkedHashSet<Integer> linkedValues = new LinkedHashSet<Integer>();
		linkedValues.add(12);
		linkedValues.add(43);
		linkedValues.add(43); // LinkedHashSet does not display duplicate values
		linkedValues.add(15);
		linkedValues.add(27);
		linkedValues.add(33);
		linkedValues.add(67);
		linkedValues.add(70);
		
		System.out.println("From LinkedHashSet, order which values are inserted is maintained.");
		for(Integer linkedVariable : linkedValues) {
			System.out.println(linkedVariable);
		}
	}

}