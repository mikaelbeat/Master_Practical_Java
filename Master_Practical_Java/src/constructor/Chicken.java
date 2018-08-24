package constructor;

public class Chicken extends Animal{
	
	public Chicken() {
		
	}
	
	public void Lay_eggs() {
		System.out.println("I just layed some eggs.");
	}

	@Override
	public void move() {
		System.out.println("Chicken is moving.");
	}

}