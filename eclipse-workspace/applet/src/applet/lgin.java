package applet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;;

public class lgin extends Frame implements ActionListener {

	Label l1 , l2 , l3 ;
	TextField t1 , t2  ;
	Button b1 , b2 ;
	Font f ;
	
	lgin(){
		setBackground(Color.GRAY);
		setForeground(Color.RED);
		f = new Font("Courier",Font.BOLD,25);
		setLayout(null);
		setVisible(true);
		setSize(400,400);
		setTitle("Login Form");
		l1 = new Label("Email -");
		l1.setFont(f);
		l1.setBounds(40, 40, 100, 30);
		t1 = new TextField();
		t1.setBounds(200, 40, 100, 30);
		
		l2 = new Label("PassWord -");
		l2.setFont(f);
		l2.setBounds(40, 90, 160, 30);
		t2 = new TextField();
		t2.setBounds(200, 90, 100, 30);
		l3 = new Label();
		l3.setBounds(100, 230, 200, 30);
		l3.setFont(f);
		b1 = new Button("Login");
		b2 = new Button("Clear");
		b1.setBounds(100, 170, 70, 30);
		b2.setBounds(200, 170, 70, 30);
		add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);add(l3);
		
		
		
		addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				}
				);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		
		if(e.getSource()==b1) {
			String un = t1.getText();
			String p = t2.getText();
			
			
			if(un.equals("Admin")&& p.equals("Admin")) {
				l3.setText("Login Success");
			}
			
			else {
				l3.setText("Login Faild");
			}
			
			
			}
		if(e.getSource()==b2) {
			t1.setText("");
			t2.setText("");
			l3.setText("");
			
			
		}
		
		
		
	}
	
	
	public static void main(String args[]) {
		new lgin();
	}

}
