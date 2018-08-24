package constructor;

public class Bird extends Animal{
	
	public Bird() {
		
	}
	
	public void Inspect() {
		System.out.println("I am bird.");
	}

	@Override
	public void move() {
		System.out.println("Bird is flying.");
	}
	
}
