package constructor;

public class Zoo {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.name = "Gorilla";
		a1.color = "Black";
		a1.Inspect_animal();

		System.out.println("\n");
		
		Bird a2 = new  Bird();
		a2.name = "Sparrow";
		a2.color = "Grey";
		a2.Inspect_animal();
		a2.Inspect();
		
		System.out.println("\n");
		
		Parrot a3 = new Parrot();
		a3.name = "Polly";
		a3.color = "Red";
		a3.Inspect_animal();
		a3.Fly();
		
		System.out.println("\n");
		
		Chicken a4 = new Chicken();
		a4.name = "Chicken";
		a4.color = "White";
		a4.Inspect_animal();
		
	}

}