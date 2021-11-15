package springcore_1;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext; 


public class Test {
	 public static void main(String args[])
	  {
		  
		 ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
			
		 //Setter Injection
			
			Customer customer = (Customer)context.getBean("customer");
			customer.displayCustomer();
			
			//Constructor Injection
		 
			//Customer customer2 = (Customer)context.getBean("c");
			//customer2.displayCustomer();
	  }
	}


