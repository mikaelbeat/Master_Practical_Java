package car_dealership;

public class Employee {
	
	private String employeeName;
	
	public Employee(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void sell_car(Customer customer, Vehicle vehicle, boolean finance) {
			double cash = Customer.getCashOnHand();
			double price = Vehicle.getPrice();
			double remainder = price - cash;
			String car = Vehicle.getModel();
		if (finance == true) {
			System.out.println("Customer uses credit to buy " + car + ", remainder is " +remainder+ "€.");
		} else {
			System.out.println("Customer uses cash to buy " + car + ".");
			if ( cash < price) {
				System.out.println("Customer does not have enought money, " + car + " costs " + price + "€ and customer has " + cash + "€.");
			} else {
				System.out.println(car + " bought!");
			}
		}
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
}