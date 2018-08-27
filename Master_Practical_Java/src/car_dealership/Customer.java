package car_dealership;

public class Customer {
	
	private static String name;
	private String address;
	private static double cashOnHand;
	
	public Customer(String name, String address, double cashOnHand) {
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
	}
	
	
	public static String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public static double getCashOnHand() {
		return cashOnHand;
	}


	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}


	public void purchase_car(Vehicle vehicle, Employee emp, boolean finance) {
		
	}
	
}