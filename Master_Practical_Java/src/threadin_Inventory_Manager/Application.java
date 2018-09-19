package threadin_Inventory_Manager;

public class Application {
	
	public static void main(String[] args) throws InterruptedException {
		
		Inventory_Manager manager = new Inventory_Manager();
		
		
		Thread inventoryTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.populateSoldProducts();
			}
		});
		
		Thread displayTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.displaySoldProducts();
			}
		});
		
		inventoryTask.start();
		// Waits to first thread to finish before starting new thread
//		inventoryTask.join();
		Thread.sleep(2000);
		displayTask.start();
		
	}

}