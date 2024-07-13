package AWT;

import java.awt.*;
import java.awt.event.*;

public class checkdemo extends Frame  implements ItemListener  {

	Label l ;
	TextField t ;
	  Checkbox c1 , c2 , c3 ;
	
	checkdemo(){
		
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,400);
		
		l = new Label("Select Hobbies");
	
		c1 = new Checkbox("playing");
		c2 = new Checkbox("Walking");
	    c3 = new Checkbox("Running");
		t = new TextField(50);
		
		
		add(l);  
		add(c1);add(c2); add(c3);
		
		add(t);
		
		addWindowListener(
				
				new WindowAdapter() {
					
					
					
					public void windowClosing(WindowEvent e) {
						System.exit(0);
						
					} } );
		
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	
	}
	
	
public void itemStateChanged(ItemEvent e) {
		
		if(e.getSource()==c1) {
			if(c1.getState()==true) 
			t.setText(c1.getLabel());
			
			else 
				t.setText(" ");
			
		}
		
		if(e.getSource()==c2) {
			if(c2.getState()==true) 
			t.setText(c2.getLabel());
			
			else 
				t.setText(" ");
				
		}
		
		if(e.getSource()==c3) {
			if(c3.getState()==true) 
			t.setText(c3.getLabel());
			
			else 
				t.setText(" ");
				
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		new checkdemo();

	}

}


