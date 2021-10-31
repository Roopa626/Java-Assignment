package polymorphism;

public class Salary {

	public static void main(String[] args) {
		int total=0;
		Employee E=new Employee();
		total+=E.Salary(20000);
		E=new Manager();
		total+=E.Salary(25000);
		E=new Labour();
		total+=E.Salary(10000);
		System.out.println("Total salary of an employee is:"+total);

	}

}
