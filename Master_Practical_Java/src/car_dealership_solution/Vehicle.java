package car_dealership_solution;

public class Vehicle {
	
	private String model;
	private double price;

	public Vehicle(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", price=" + price + "]";
	}
	
}