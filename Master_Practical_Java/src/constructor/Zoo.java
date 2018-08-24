package constructor;

public class Zoo {

	public static void main(String[] args) {
		
		Bird a1 = new  Bird();
		a1.name = "Sparrow";
		a1.color = "Grey";
		a1.Inspect_animal();
		a1.Inspect();
		a1.move();
		
		System.out.println("\n");
		
		Parrot a2 = new Parrot();
		a2.name = "Polly";
		a2.color = "Red";
		a2.Inspect_animal();
		a2.Fly();
		a2.move();
		
		System.out.println("\n");
		
		Chicken a3 = new Chicken();
		a3.name = "Chicken";
		a3.color = "White";
		a3.Inspect_animal();
		a3.Lay_eggs();
		a3.move();
		
	}

}