package lambda_Practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
	
	// 4:30

	public static void main(String[] args) {
		
		List<Car> cars = Arrays.asList(
				new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700),
				new Car("Toyota", "Land Cruiser", "White", 48500),
				new Car("Toyota", "Corolla", "Black", 16200),
				new Car("Toyota", "Camry", "Blue", 24000),
				new Car("Nissan", "Sentra", "White", 17300),
				new Car("Mitsubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wrangler", "Red", 24500)
				);
		
			Function<Car, String> priceAndColor = (c) -> "Price: " + c.getPrice() + " Color: " + c.getColor();
			String stringCar = priceAndColor.apply(cars.get(0));
			System.out.println("Printing car: " + stringCar);
			
			System.out.println("\nPrinting cars in price range 18000 - 22000");
			printCars(cars, (c) -> c.getPrice() >= 18000 && c.getPrice() <= 22000);
			
			System.out.println("\nPrinting blue cars.");
			printCars(cars, (c) -> c.getColor().equals("Blue"));
			
//			printCarsPriceRange(cars, 1800, 22000);
//			printCarsByColor(cars, "Red");
	}
	
	public static void printCars(List<Car> cars, Predicate<Car> predicate) {
		for(Car c : cars) {
			if(predicate.test(c)) {
				c.printCar();
			}
		}
	}
	
	public static void printCarsPriceRange(List<Car> cars, int low, int high) {
		for(Car c : cars) {
			if(low <= c.getPrice() && c.getPrice() <= high) {
				c.printCar();
			}
		}
	}
	
	public static void printCarsByColor(List<Car> cars, String color) {
		for(Car c : cars) {
			if(c.getColor().equals(color)) {
				c.printCar();
			}
		}
	}
	
}