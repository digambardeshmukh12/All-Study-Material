package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class empmain {

	
	public static void main(String[] args) {

		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory = c.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		employee e1 = new employee();
		e1.setName("jack");
		
		regular_employee e2 = new regular_employee();
		e2.setName("sam");
		e2.setSalary(55565);
		e2.setBonus(1200);
		
		contract_employee e3 = new contract_employee();
		e3.setName("rock");
		e3.setPay_per_hour(30);
		e3.setContract_duration(3);
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		t.commit();
		session.close();
		System.out.println("success................");
		
		
		
		
	}
	
}
