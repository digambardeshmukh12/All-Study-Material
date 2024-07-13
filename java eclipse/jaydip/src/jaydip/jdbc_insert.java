package jaydip;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class jdbc_insert  extends Frame implements ActionListener{
	Label l1 , l2 , l3  ;
	TextField t1 , t2 , t3 ;
	Button b1 ;
	Connection con ;
	ResultSet rs ;
	PreparedStatement stat ;
	
	
	
	jdbc_insert(){
		
		setLayout(new FlowLayout());
		setSize(350,350);
		setVisible(true);
		l1 = new Label("stu_ID");
		l2 = new Label("sty_Name");
		l3 = new Label("stu_marks");
		t1 = new TextField(10);
		t2 = new TextField(15);
		t3 = new TextField(10);
		b1 = new Button("INSERT");
		b1.addActionListener(this);
		
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
				
				});
		
		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);
		

	
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			Integer i =Integer.parseInt(t1.getText());
			Integer m = Integer.parseInt(t3.getText()); ;
			String n = t2.getText() ;
			System.out.println( i + " " + m  + " "+ n);
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
				stat = con.prepareStatement("insert into person (id,name,marks) values(?,?,?)");
				
				
				stat.setInt(1,i);
				stat.setString(2, n);
				stat.setInt(3, m);
				stat.executeUpdate();
				
				con.close();
				
				
			}
			catch(Exception e2) {
				System.out.println(e2);
			}
		}
		
	}
	

	public static void main(String[] args) {
		
		new jdbc_insert();

	}

}
