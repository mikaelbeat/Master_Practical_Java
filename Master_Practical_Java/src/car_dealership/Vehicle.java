package car_dealership;

public class Vehicle {
	
	private static String model;
	private static double price;
	
	public Vehicle(String model, double price) {
		this.model = model;
		this.price = price;
	}

	public static String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public static double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}