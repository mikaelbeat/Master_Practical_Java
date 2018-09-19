package threadin_Inventory_Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Inventory_Manager {
	
										// In Threads use ArrayList from concurrent.CopyOnWriteArrayList
	List<Product> soldProductList = new CopyOnWriteArrayList<Product>();
	List<Product> purchasedProductList = new ArrayList<Product>();
	
	public void populateSoldProducts() {
		for(int i=0; i < 1000; i++) {
			Product prod = new Product(i, "test_product_" + i);
			soldProductList.add(prod);
			System.out.println("Added: " + prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void displaySoldProducts() {
		for(Product product : soldProductList) {
			System.out.println("Printing the sold: " + product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}