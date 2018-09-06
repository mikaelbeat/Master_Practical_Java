package collections;

import java.util.ArrayList;
import java.util.List;

public class Vehicle_ArrayList {
	
	public static void main(String[] args) {
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		Vehicle vehicle2 = new Vehicle("Yoyota", "Camery", 12000, false);
		vehicles.add(vehicle2);
		
		vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
		vehicles.add(new Vehicle("Jees", "Wrangler", 25000, true));
		
		for(Vehicle car : vehicles) {
//			System.out.println(car.getMake());
			System.out.println(car.toString());
		}
	}

}