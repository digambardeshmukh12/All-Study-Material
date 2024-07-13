package AWT;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class grid extends Frame {

	Button b1 , b2 , b3 , b4 ;
	
	
	grid(){
	
		setLayout(new GridLayout(5,5,30,40));
		setVisible(true);
		setSize(500,500);
		
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		
		add(b1); add(b2); add(b3); add(b4);
		
		
addWindowListener(
				
				new WindowAdapter() {
					
					
					
					public void windowClosing(WindowEvent e) {
						System.exit(0);
						
					} } );
		
	}
	
	public static void main(String[] args) {
		

		new grid();
	}

}
