package car_dealership_solution;

public class Employee {
	
	public void handle_Customer(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			run_credit_history(cust, loanAmount);
		} else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			process_transaction(cust, vehicle);
		} else {
			System.out.println("Customer will need more money to purchase vehicle " + vehicle + ".");
		}
	}
	
	public void run_credit_history(Customer cust, double loanAmount) {
		
	}
	
	public void process_transaction(Customer cust, Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle: " + vehicle + " for the price " + vehicle.getPrice());
	}
	
	public void sell_car(Customer customer, Vehicle vehicle, boolean finance) {
		System.out.println("Ran credit history for customer.");
		System.out.println("Customer has been approved to purchase the vehicle.");
	}


	
	
	
}