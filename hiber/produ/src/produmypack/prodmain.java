package produmypack;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class prodmain {

	public static void main(String[] args) {
		
		
	
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory =c.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		product p =new product();
		p.setPname("Pen");
		p.setPrate(5);
		session.persist(p);
		t.commit();
		System.out.println("Success...........");

	}

}
