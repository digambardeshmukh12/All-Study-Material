package AWT;

import java.awt.*;
import java.awt.event.*;

public class dialogbox {

	Dialog d ;
	Label l ;
	dialogbox(){
		
		Frame f = new Frame();
		d = new Dialog(f,"Dialog example",true);
		d.setLayout(new FlowLayout());
		d.setSize(300,300);
		d.setVisible(true);
		
		Button b = new Button("OK");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				
				d.setVisible(false);
			
		}
	}
				);
		
		
		l = new Label("Click Button to Continue");
		d.add(l);
		d.add(b);
		d.setSize(300,300);
		d.setVisible(true);
		
	}
	
	public static void main(String[] args) {

		new dialogbox();
		
	}

}
