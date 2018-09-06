package collections;

import java.util.HashSet;

public class Animal_HashSet {
	
	public static void main(String[] args) {
		
		HashSet<Animal> animals = new HashSet<Animal>();
		
		Animal animal1 = new Animal("Cat", 5);
		Animal animal2 = new Animal("Cat", 5);
		Animal animal3 = new Animal("Lion", 10);
		Animal animal4 = new Animal("Tiger", 5);
		Animal animal5 = new Animal("Monkey", 4);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
		for(Animal value : animals) {
			System.out.println(value);
		}
		
	}

}