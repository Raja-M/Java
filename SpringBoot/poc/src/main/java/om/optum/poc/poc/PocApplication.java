package om.optum.poc.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import om.optum.poc.poc.dependencypoc.Customer;



@SpringBootApplication
public class PocApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PocApplication.class, args);
		
		
		System.out.println( "Application started !!");
		
		
		Customer c = context.getBean( Customer.class);
		c.display();
	}

}
