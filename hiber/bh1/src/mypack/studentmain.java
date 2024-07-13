package mypack;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class studentmain {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory=c.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Student s=new Student();
		s.setRoll(101);
		s.setName("Ram");
		s.setMarks(67.0);
		session.save(s); 
		t.commit();
		session.close();
		System.out.println("Success.....");
                
	}

}
