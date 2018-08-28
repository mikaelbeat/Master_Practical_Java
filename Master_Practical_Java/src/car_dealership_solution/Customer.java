package car_dealership_solution;

public class Customer {
	
	private String name;
	private double cashOnHand;
	
	public Customer(String name, double cashOnHand) {
		super();
		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	public void purchase_car(Vehicle vehicle, Employee emp, boolean finance) {
		emp.handle_Customer(this, finance, vehicle);
	}
	
}