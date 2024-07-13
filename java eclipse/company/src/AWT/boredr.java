package AWT;
import java.awt.*;
import java.awt.event.*;

public class boredr extends Frame  {

	Button b1 , b2 , b3 , b4 , b5 ;
	boredr(){
		setLayout(new BorderLayout(30,40));
		setVisible(true);
		setSize(500,500);
		
		b1 = new Button("east");
		b2 = new Button("center");
		b3 = new Button("west");
		b4 = new Button("north");
		b5 = new Button("south");
		
		add(b1 , BorderLayout.EAST);
		add(b2 , BorderLayout.CENTER);
		add(b3 , BorderLayout.WEST);
		add(b4 , BorderLayout.NORTH);
		add(b5 , BorderLayout.SOUTH);
		
		
		
addWindowListener(
				
				new WindowAdapter() {
					
					
					
					public void windowClosing(WindowEvent e) {
						System.exit(0);
						
					} } );
		

		
	}
	
	public static void main(String[] args) {
	
		new boredr();
		
	}

}
