package lambda_Practical;

@FunctionalInterface
interface Condition<T> {
	
	public boolean test(T t);

}