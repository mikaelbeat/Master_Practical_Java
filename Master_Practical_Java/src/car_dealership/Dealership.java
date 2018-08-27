package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Stacy");
		Vehicle car = new Vehicle("Tesla", 600);
		Customer customer = new Customer("Felicia", "Gold Street 99", 600);
		
		employee.sell_car(customer, car);
		
		


		}

	}