package mypack;

import java.util.ArrayList;



import org.hibernate.*;
import org.hibernate.cfg.*;

public class Companymain {

	public static void main(String[] args) {
		

		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory=c.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Employee e1=new Employee();
		e1.setName("ram");
		e1.setSalary(20000);
		Employee e2=new Employee();
		e2.setName("nitin");
		e2.setSalary(30000);
		Employee e3=new Employee();
		e3.setName("mohan");
		e3.setSalary(25000);
		Employee e4=new Employee();
		e4.setName("raj");
		e4.setSalary(30500);
		Employee e5=new Employee();
		e5.setName("abc");
		e5.setSalary(30500);
		ArrayList<Employee> list1=new ArrayList();
		list1.add(e1); list1.add(e2); list1.add(e3);list1.add(e5);
		
		ArrayList<Employee> list2=new ArrayList();
		list2.add(e4);
		
		Department d1=new Department();
		d1.setDname("IT");
		d1.setEmp(list1);
		
		Department d2=new Department();
		d2.setDname("Account");
		d2.setEmp(list2);
		
		session.save(d1);
		session.save(d2);
		t.commit();
		session.close();
		System.out.println("success...");
		
		
	}

}
