package constructor;

public class Parrot extends Animal implements Flyable{
	
	public Parrot() {
		
	}
	
	public void Say_something() {
		System.out.println("Hello i am parrot.");
	}

	@Override
	public void Fly() {
		System.out.println("Parrots fly very well.");
		
	}

	@Override
	public void move() {
		System.out.println("Parrot is moving.");
	}

}