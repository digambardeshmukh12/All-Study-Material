package mypack;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Empmain {
	
	public static void main(String [] args) {
	
	Configuration c=new Configuration();
	c.configure("hibernate.cfg.xml");
	SessionFactory factory=c.buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	Employee e1=new Employee();
	
	e1.setName("Rajkumar");
	e1.setEmail("digambarbca@gmail.com");
	
	Address ob = new Address();
	
	ob.setCity("Nanded");
	ob.setPincode("431006");
	ob.setCountry("India");
	ob.setState("MH");
	
	e1.setAddress(ob);
	
	ob.setEmployee(e1);
	session.persist(e1);
	
	t.commit();
	System.out.println("Success.......");
	session.close();
	
	
	
	
	
session.persist(e1);
t.commit();
System.out.println("Success..");
session.close();
}



	
}
