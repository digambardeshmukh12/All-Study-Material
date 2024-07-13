package mypack;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class QuestionBankMain {

	public static void main(String[] args) {


		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory=c.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Answer a1=new Answer();
		a1.setAnswername(" is a programming language");
		a1.setPosteBy("mohan");
		
		Answer a2=new Answer();
		a2.setAnswername(" Java is a Platform Independant");
		a2.setPosteBy("raj varma");
		
		Answer a3=new Answer();
		a3.setAnswername(" Servlet is used to create dynamic web application");
		a3.setPosteBy("Kiran");
		
		Answer a4=new Answer();
		a4.setAnswername(" Servlet is API");
		a4.setPosteBy("Sham");
		
		Question q1=new Question();
		q1.setQname("What is Java");
		ArrayList<Answer> li1=new ArrayList();
		li1.add(a1); 
		li1.add(a2);
		q1.setAnswers(li1);
		
		Question q2=new Question();
		q2.setQname("What is a Servlet");
		ArrayList<Answer> li2=new ArrayList();
		li2.add(a1);
		li2.add(a3);
		li2.add(a4);
		q2.setAnswers(li2);
		
		session.persist(q1);
		session.persist(q2);
		t.commit();
		session.close();
		System.out.println("success..");

	}

}
