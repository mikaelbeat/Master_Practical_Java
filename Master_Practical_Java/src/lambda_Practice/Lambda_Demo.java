package lambda_Practice;

public class Lambda_Demo {

	public static void main(String[] args) {

		MyGenericInterface<String> reverser = (s) -> {
			String result = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				result = result + s.charAt(i);
			}
			return result;
		};
		System.out.println(reverser.work("Kissa"));

	}
	
	// Generic interface, accepts one argument
	interface MyGenericInterface<T> {

		public T work(T t);

	}

}