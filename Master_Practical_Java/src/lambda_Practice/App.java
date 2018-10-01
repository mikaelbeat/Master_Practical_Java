package lambda_Practice;

public class App {

	public static void main(String[] args) {
		
		Human tom = new Human();
		walker(tom);
		
		Robot wale = new Robot();
		walker(wale);
		
		System.out.println("*************************************");
		
		walker( () -> {
			System.out.println("Custom object walking...");
			System.out.println("Doing something other...");
		});
		
		Walkable aBlockOfCode = () -> {
			System.out.println("First...");
			System.out.println("Second...");
		};
		
		System.out.println("*************************************");
		
		walker(aBlockOfCode);
		
		ALambdaInterface helloVar = () -> System.out.println("Hello there!");
		helloVar.someMethod();
		
		System.out.println("*************************************");
		
		Calculate calc = (a,b) -> a + b;
		System.out.println(calc.compute(5, 5));
		
		System.out.println("*************************************");
		
		Calculate divide = (a,b) -> {
			if(a == 0) {
				return 0;
			}
			return a / b;
		};
		System.out.println(divide.compute(10, 2));
		
		System.out.println("*************************************");
		
		MyGenericInterface<String> reverser = (s) -> {
			String result = "";
			for(int i = s.length() -1; i >= 0; i--) {
				result = result + s.charAt(i);
			}
			return result;
		};
		System.out.println(reverser.work("Kissa"));
		
	}
	
	public String reverse(String str) {
		String result = "";
		for(int i = str.length() -1; i >=0; i++) {
			result = result + str.charAt(i);
		}
		return result;
	}
	
	public static void walker(Walkable walakbleEntity) {
		walakbleEntity.walk();
	}
	
	public void sayHello() {
		System.out.println("Hello there!");
	}
	
	public int sum(int arg1, int arg2) {
		return arg1+arg2;
	}
	
	public int nonZeroDivide(int arg1, int arg2) {
		if(arg1==0) {
			return 0;
		}
		return arg1 / arg2;
	}
	
}

interface Calculate{
	
	public int compute(int a, int b);
	
}

interface MyGenericInterface<T>{
	
	public T work(T t);
	
}