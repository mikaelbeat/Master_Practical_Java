package generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
	
	public static void main(String[] args) {
		
		Container<Integer, String> container = new Container<>(12, "Hello");
		
		container.print_Items();
		int val1 = container.getItem1();
		String val2 = container.getItem2();
		
		System.out.println("\n*****************\n");
		
		System.out.println("Value 1 is: " + val1);
		System.out.println("Value 2 is: " + val2);
		
		System.out.println("\n*****************\n");
		
		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("Snake");
		mySet1.add("Bear");
		mySet1.add("Tiger");
		
		Set<String> mySet2 = new HashSet<>();
		mySet2.add("Penguin");
		mySet2.add("Tiger");
		mySet2.add("Tiger");
		
		Set<String> resultSet = union(mySet1, mySet2);
		Iterator<String> itr = resultSet.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		
	}
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}

}