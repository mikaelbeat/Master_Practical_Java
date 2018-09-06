package car_dealership_project;

public class Employee {
	
	private String employeeName;
	
	public Employee(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void sell_car(Customer customer, Vehicle vehicle, boolean finance) {
			double cash = customer.getCashOnHand();
			double price = vehicle.getPrice();
			double remainder = price - cash;
			String car = vehicle.getModel();
			String cust = customer.getName();
		if (finance == true) {
			System.out.println("Customer " + cust + " uses credit to buy " + car + ", remainder is " +remainder+ "€.");
		} else {
			System.out.println("Customer " + cust + " uses cash to buy " + car + ".");
			if ( cash < price) {
				System.out.println("Customer " + cust + "does not have enought money, " + car + " costs " + price + "€ and customer has " + cash + "€.");
			} else {
				System.out.println("Customer "+ cust + " bought " + car + " and price was " + price +"€.");
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