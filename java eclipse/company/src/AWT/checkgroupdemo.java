package AWT;

import java.awt.*;
import java.awt.event.*;

public class checkgroupdemo extends Frame {
	
	Label l ;
	Checkbox c1 , c2 ;
	CheckboxGroup cbg ;
	
	
	checkgroupdemo(){
	
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,500);
		
		l = new Label("Gender");
		cbg = new CheckboxGroup();
		
		c1 = new Checkbox("Male",cbg,true);
		c2 = new Checkbox("Female",cbg,true);

		add(l);add(c1);add(c2);
		
		
		addWindowListener(
				
				new WindowAdapter() {
					
					
					
					public void windowClosing(WindowEvent e) {
						System.exit(0);
						
					} } );


		
	}

	public static void main(String[] args) {
		

		new checkgroupdemo();
		
	}

}
