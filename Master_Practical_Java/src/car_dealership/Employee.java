package car_dealership;

public class Employee {
	
	private String employeeName;
	
	public Employee(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void sell_car(Customer customer, Vehicle vehicle) {
			double cash = Customer.getCashOnHand();
			double price = Vehicle.getPrice();
		if ( cash < price) {
			System.out.println("Vehicle is too expensive");
		} else {
			System.out.println("Car bought!");
		}
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
}