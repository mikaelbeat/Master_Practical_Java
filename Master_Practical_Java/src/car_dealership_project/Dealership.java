package car_dealership_project;

public class Dealership {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Stacy");
		Vehicle car = new Vehicle("Tesla", 800);
		Customer customer = new Customer("Felicia", "Gold Street 99", 900);
		
		Vehicle car2 = new Vehicle("Honda", 300);
		Customer customer2 = new Customer("John", "Poor St. 7", 40);
		
		employee.sell_car(customer, car, false);
		employee.sell_car(customer2, car2, true);
		
		}

	}