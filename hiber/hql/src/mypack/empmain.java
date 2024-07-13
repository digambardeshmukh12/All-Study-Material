package mypack;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Restrictions;

import java.util.*;
public class empmain {

	public static void main(String[] args) {
		

		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory = c.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
//		 to insert records 
		
		
	/*	employee e=new employee();
		e.setName("ajay");
		e.setSalary(55000);
		session.persist(e);
		t.commit();
		
		*/
		
//		To update records

		/*
		Query q = session.createQuery("update employee set name=:n,salary=:s where eid=:i");
		q.setParameter("n","Lucifer");
		q.setParameter("s",64643.3);
		q.setParameter("i", 1);
		
		int res = q.executeUpdate();
		t.commit();
		*/
		
//		to delete records
		/*
		Query q = session.createQuery("delete from employee where eid=:i");
		q.setParameter("i",1);
		int res = q.executeUpdate();
		t.commit();
		 */
		
//		 to read data from table
		
		/*
		Query q = session.createQuery("from employee");
		List li = q.list();
		Iterator it = li.iterator();
		while(it.hasNext()) {
			
			employee e = (employee) it.next();
			System.out.println(e.getEid() + " " + e.getName() + " " + e.getSalary());
		}
		*/
		
		
//		to print range values
		
		/*
		
		Query q=session.createQuery("from employee");
		q.setFirstResult(1);
		q.setMaxResults(3);
		List li=q.list();
		Iterator it=li.iterator();
		while(it.hasNext())
		{
			employee e=(employee)it.next();
			System.out.println(e.getEid()+" "+e.getName()+" "+e.getSalary());
		}
		
		*/
		
//		 to print highest salary
		
		
		/*
		
		Query q=session.createQuery("select max(salary) from employee");
		List li=q.list();
		System.out.println(li.get(0));
		*/
		
		
		//to find records whose salary>6000
				Criteria ct=session.createCriteria(employee.class);
				ct.add(Restrictions.gt("salary",100000.0));
				List l=ct.list();
				Iterator it=l.iterator();
				while(it.hasNext())
				{
					employee o=(employee)it.next();
					System.out.println(o.getEid()+" "+o.getName()+" "+o.getSalary());
				}
		
		
		session.close();
		System.out.println("Success...");
		
		
		
	}

}
