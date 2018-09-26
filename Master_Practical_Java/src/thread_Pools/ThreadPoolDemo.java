package thread_Pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Runnable processor1 = new MessageProcessor(2);
		executor.execute(processor1);
		
		Runnable processor2 = new MessageProcessor(3);
		executor.execute(processor2);
		
		Runnable processor3 = new MessageProcessor(4);
		executor.execute(processor3);
		
		Runnable processor4 = new MessageProcessor(5);
		executor.execute(processor4);
		
		executor.shutdown(); // Rejects any new tasks from being submitted. Gracefully shuts down the service
		
		while(!executor.isTerminated()) {
			
		}
		
		System.out.println("Submitted all tasks...");
	}

}