package car_dealership_solution;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer("Tom", 10000);

		Vehicle vehicle = new Vehicle("Honda", 10000);
		
		Employee emp = new Employee();
		
		cust1.purchase_car(vehicle, emp, false);
		
		
		}

	}