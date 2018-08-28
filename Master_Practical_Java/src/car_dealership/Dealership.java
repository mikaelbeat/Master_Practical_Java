package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Stacy");
		Vehicle car = new Vehicle("Tesla", 800);
		Customer customer = new Customer("Felicia", "Gold Street 99", 900);
		
		employee.sell_car(customer, car, false);
		
		}

	}