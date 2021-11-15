package springcore_1;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CustomerTest {
	
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Customer cust = (Customer)context.getBean("name");
		
		 
		Customer obj2 = new Customer(1, "Roopa", 9949247181L,new Address("1", "Madanapalle", "AP", "517390", "India"));
		
		
		if (cust.getCustomerName().equals(obj2.getCustomerName())) {
			System.out.println("Success");
		} else {
			fail("Not yet implemented");
		}
	}

	private void fail(String string) {
		// TODO Auto-generated method stub
		
	}

}
	



