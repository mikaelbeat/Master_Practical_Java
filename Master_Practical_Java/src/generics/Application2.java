package generics;

import java.util.ArrayList;
import java.util.List;

public class Application2 {

	public static void main(String[] args) {
		
		Object myObject = new Object();
		String myVar = "Hello";
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee());
		ArrayList<Accountant> accoountants = new ArrayList<>();
		accoountants.add(new Accountant());
//		employees = accoountants;
		
		ArrayList<?> employees2 = new ArrayList<>();
		ArrayList<Accountant> accoountants2 = new ArrayList<>();
		employees2 = accoountants2;
		
		// Upper bound
		ArrayList<? extends Employee> employees3 = new ArrayList<>();
		ArrayList<Accountant> accoountants3 = new ArrayList<>();
		employees3 = accoountants3;
		
		// Lower bound
		ArrayList<? super Employee> employees4 = new ArrayList<>();
		ArrayList<Accountant> accoountants4 = new ArrayList<>();
//		employees4 = accoountants4;
		
		makeEmployeeWork(employees);
		makeEmployeeWork(accoountants);
		
	}
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for(Employee emp : employees) {
			emp.work();
		}
	}
		
//	public static void makeEmployeeWork(List<? extends Employee> employees) {
//		for(Accountant emp : (ArrayList<Accountant>)employees) {
//			emp.work();
//		}
//	}
	
}