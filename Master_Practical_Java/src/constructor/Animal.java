package constructor;

public class Animal {
	
	String name;
	String color;
	
	public Animal() {
		
	}
	
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public String Inspect_animal() {
		System.out.println("Animal is " + name + " and it is " + color + ".");
		return name;
	}

}