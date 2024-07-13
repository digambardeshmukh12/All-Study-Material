package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee em = (Employee) ctx.getBean("ob");
		em.display();
	
	
	}

}
