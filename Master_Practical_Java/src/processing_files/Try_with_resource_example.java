package processing_files;

class MyClass implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing!!");
	}

}

public class Try_with_resource_example {

	public static void main(String[] args) {
		
		try(MyClass var = new MyClass();){
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}