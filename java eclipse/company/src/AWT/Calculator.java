package AWT;

import java.awt.*;
import java.awt.event.*;


public class Calculator extends Frame  implements ActionListener {
	
	
	
	Label l1,l2,l3 ;
	TextField t1,t2,t3 ;
	Button b1,b2,b3,b4,b5 ;
	Font f ;
	
	
	Calculator(){
		
		setBackground(Color.RED);
		setForeground(Color.BLACK);
		
		f = new Font("Bodoni",Font.BOLD,15);
		
		setLayout(null);
		setVisible(true);
		setSize(500,400);
		setTitle("Calculator");
		l1 = new Label("Enter A ");
		l1.setBounds(50,50,110,40);
		l1.setFont(f);
		t1 = new TextField();
		t1.setBounds(180,50,110,30);
		
		l2 = new Label("Enter B ");
		l2.setBounds(50,90,110,40);
		l2.setFont(f);
		t2 = new TextField();
		t2.setBounds(180,90,110,40);
		
		
		l3 = new Label("Result");
		l3.setBounds(50,140,110,40);
		l3.setFont(f);
		t3 = new TextField();
		t3.setBounds(180,140,110,40);
		
		
		b1 = new Button("Addition");
		b1.setBounds(50,200,110,40);
		b1.setFont(f);
		
		
		b2 = new Button("Substraction");
		b2.setBounds(50,250,110,40);
		b2.setFont(f);
		
		b3 = new Button("Multiplication");
		b3.setBounds(200,200,110,40);
		b3.setFont(f);
		
		b4 = new Button("Division");
		b4.setBounds(200,250,110,40);
		b4.setFont(f);
		
		b5 = new Button("Clear");
		b5.setBounds(125,300,110,40);
		b5.setFont(f);

		add(l1);
		add(t1);
		
		add(l2);
		add(t2);
		
		add(l3);
		add(t3);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		
		addWindowListener(
				
			new WindowAdapter() {
				
				
				
				public void windowClosing(WindowEvent e) {
					System.exit(0);
					
				} } );
		
		
		  
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		 
		
		
		
	}
	
	
	
	

	
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==b1) {
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int d = a + b ;
			t3.setText(String.valueOf(d)) ;
			
			
		}
		
		
		if(e.getSource()==b2) {
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int d = a-b ;
			t3.setText(String.valueOf(d)) ;
			
			
		}
		
		
		
		if(e.getSource()==b3) {
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int d = a * b ;
			t3.setText(String.valueOf(d)) ;
			
			
		}
		
		
		if(e.getSource()==b4) {
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int d = a/b ;
			t3.setText(String.valueOf(d)) ;
			
			
		}
		
	
		if(e.getSource()==b5) {
			
			t1.setText("");
			t2.setText("");
			t3.setText("");
		
		}
		
		}
		
		
	

	public static void main(String[] args) {
		

	new Calculator();

	
		
	}

}
