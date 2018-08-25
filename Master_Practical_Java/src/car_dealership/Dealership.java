package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("Some Street 1");
		cust1.setCashOnHand(12000);
		cust1.purchase_car(vehicle, emp, false);
		
		
		Employee
			- handleCustomer(Customer cust, boolean finance, Vehicle vehicle)
			- if finance is true -> runCreditHistory(Customer cust, double amount)
			else if (vehicle.getPrice <== cust.cashOnHand)
				processTransaction(Custome cust, vehicle vehicle)	
				else
					tell customer to bring more money
					
					use encapsulation

		}

	}