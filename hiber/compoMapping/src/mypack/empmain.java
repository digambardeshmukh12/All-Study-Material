package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class empmain {

	public static void main(String[] args) {

		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory=c.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		address ob=new address();
		ob.setCity("pune");
		ob.setPincode("43656");
		ob.setState("MH");
		employee e=new employee();
		e.setName("Kiran");
		e.setAddress(ob);
		session.save(e);
		t.commit();
		session.close();
		System.out.println("records inserted...");
		
		
	}

}
