package generics;
import java.util.HashSet;
import java.util.Iterator;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		Employee obj1 = new Employee(5674,"Roopa",30000);
		Employee obj2 = new Employee(9876,"Chaitu",35000);
		
		HashSet<Employee> empDetails = new HashSet<>();
		
		empDetails.add(obj1);
		empDetails.add(obj2);
		
		Iterator<Employee> iterate = empDetails.iterator();
		while(iterate.hasNext()) {
			
			iterate.next().display();
			System.out.println();
		}
		

	}

}
class Employee{
	
	public Employee(int id,String name,int Salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		}
	int id;
	String name;
	int salary;
	
	public void display() {
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
		
		
	}
}