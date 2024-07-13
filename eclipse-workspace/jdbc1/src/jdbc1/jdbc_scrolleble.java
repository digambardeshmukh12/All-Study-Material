package jdbc1;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import org.eclipse.jdt.internal.compiler.codegen.Label;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;
import com.mysql.cj.xdevapi.Statement;

public class jdbc_scrolleble extends Frame implements ActionListener {

	Label l1 , l2 , l3  ;
	TextField t1 , t2 , t3 ;
	Button b1 , b2 , b3 , b4 ;
	Connection con ;
	ResultSet rs ;
	
	jdbc_scrolleble()
	{
	
		setLayout(new FlowLayout());
		setSize(350,350);
		setVisible(true);
		l1 = new Label("stu_ID");
		l2 = new Label("sty_Name");
		l3 = new Label("stu_marks");
		t1 = new TextField(10);
		t2 = new TextField(15);
		t3 = new TextField(10);
		b1 = new Button("First");
		b2 = new Button("Last");
		b3 = new Button("Previous");
		b4 = new Button("Next");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		
		addWindowListener(new WindowAdapter()
		{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
		
		});
		
		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);add(b2);add(b3);add(b4);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
			Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = stat.executeQuery("select * from student");
			if(rs.next())
				display();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
	}
	public void display() {
		try {
			t1.setText(" " + rs.getInt(1));
			t2.setText(rs.getString(2));
			t3.setText("" + rs.getInt(3));
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			
			try {
				rs.first();
				display();
			}
			catch(Exception e1 ) {
				System.out.println(e1);
			}
		}
		
		if(e.getSource()==b2) {
			
			try {
				rs.last();
				display();
			}
			catch(Exception e1 ) {
				System.out.println(e1);
			}
		}
		if(e.getSource()==b3) {
	
			try {
				rs.previous();
				display();
			}
			catch(Exception e1 ) {
				System.out.println(e1);
			}
		}
		if(e.getSource()==b4) {
	
			try {
				rs.next();
				display();
			}
			catch(Exception e1 ) {
				System.out.println(e1);
			}
		}

		
	}
	
	public static void main(String[] args) {
		

		new jdbc_scrolleble();
		
	}

}
