package applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
@SuppressWarnings("serial")
class MyRegistrationForm extends Frame{
	Label l,l1,ln,l2, lb,ld,lm,lg,la ,lc,ls,lphone,lpost,lcourse;
	TextField t,t2,ta ,tc,tb,tphone,tpost;
	Choice c,m , g,s,course;
	JButton submit,cancel;
	MyRegistrationForm(){
		super("Registration Form");	
		//Header/title
		setLayout(null);
		setBackground(Color.LIGHT_GRAY);
		l=new Label("-: Fill out the form carefully for registration :-");
		l.setBounds(210,40,300,25);
		add(l);
		//Student Name
		ln=new Label("Student Name :");
		ln.setBounds(20,70,90,25);
		add(ln);		
		l1=new Label("First Name :");
		l1.setBounds(40,110,70,25);
		add(l1);		
		t=new TextField();
		t.setBounds(120, 110, 180, 25);
		add(t);		
		l2=new Label("Last Name : ");
		l2.setBounds(350,110,70,25);
		add(l2);		
		t2=new TextField();
		t2.setBounds(430,110,180,25);
		add(t2);
		//birth 
		lb=new Label("Date of Birth(dd/mm/yy) :");
		lb.setBounds(40,170,150,25);
		add(lb);
		tb=new TextField();
		tb.setBounds(200,170,100,25);
		add(tb);
		//gender 
		lg= new Label("Gender : ");
		lg.setBounds(430,170,50,25);
		add(lg);
		g= new Choice();
		g.setBounds(510,170,100,25);
		add(g);
		g.add("Select");
		g.add("Male");
		g.add("Female");
		g.add("Other");
		//Address
		la=new Label("Address :");
		la.setBounds(20,230,80,25);
		add(la);
		ta=new TextField();
		ta.setBounds(110,230,500,25);
		add(ta);
		lc=new Label("City :");
		lc.setBounds(70,290,50,25);
		add(lc);
		tc=new TextField();
		tc.setBounds(170,290,130,25);
		add(tc);
		ls=new Label("State :");
		ls.setBounds(360,290,80,25);
		add(ls);
		s=new Choice();
		s.setBounds(460,290,150,25);
		add(s);
		s.add("Select");
		s.add("Andhra Pradesh");
		s.add("Arunachal Pradesh");
		s.add("Assam");
		s.add("Bihar");
		s.add("Chhattisgarh");
		s.add("Goa");
		s.add("Gujarat");
		s.add("Haryana");
		s.add("Himachal Pradesh");
		s.add("Jharkhand");
		s.add("Karnataka");
		s.add("Kerala");
		s.add("Madhya Pradesh");
		s.add("Maharashtra");
		s.add("Manipur");
		s.add("Meghalaya");
		s.add("Mizoram");
		s.add("Nagaland");
		s.add("Odisha");
		s.add("Punjab");
		s.add("Rajasthan");
		s.add("Sikkim");
		s.add("Tamil Nadu");
		s.add("Telangana");
		s.add("Tripura");
		s.add("Uttarakhand");
		s.add("Uttar Pradesh");
		s.add("West Bengal");
		s.add("J & K");		
		s.add("Ladakh");
		lphone=new Label("Contact No :");
		tphone=new TextField();
		lpost=new Label("Postal code : ");
		tpost= new TextField();
		lphone.setBounds(70,340,80,25);
		tphone.setBounds(150,340,150,25);
		lpost.setBounds(350,340,80,25);
		tpost.setBounds(460,340,150,25);
		add(lphone);
		add(tphone);
		add(lpost);
		add(tpost);
		lcourse=new Label("Course : ");
		course=new Choice();
		lcourse.setBounds(70,400,80,25);
		course.setBounds(150,400,150,30);
		add(lcourse);
		add(course);
		course.add("Select");
		course.add("MBA");
		course.add("MCA");
		course.add("M.Tech");
		course.add("B.Tech");
		course.add("E & TC");
		course.add("Pharmacy");
		submit=new JButton("Submit");
		cancel=new JButton("Cancel");
		submit.setBounds(150,470,80,30);
		cancel.setBounds(400,470,80,30);
		add(submit);
		add(cancel);
		addWindowListener(new MyWindowAdapter());
	}
	class MyWindowAdapter extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
public class RegistrationFrom {
	public static void main(String[] args) {
		MyRegistrationForm f= new MyRegistrationForm();
		f.setVisible(true);
		f.setSize(650,550);
	}
}