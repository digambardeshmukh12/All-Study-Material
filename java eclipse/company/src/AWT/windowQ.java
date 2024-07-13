package AWT;

import java.awt.*;
import java.awt.event.*;

public class windowQ extends Frame implements WindowListener {

	
	
	windowQ(){
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		
		
		addWindowListener(
				
				new WindowAdapter() {
					
					
					
					public void windowClosing(WindowEvent e) {
						System.exit(0);
						
					} } );
		
		
		addWindowListener(this);
		
	}
	
	
	public void windowActivated(WindowEvent e ) {
		 
		 System.out.println(" Window Activated ");
		
	}
	
	public void windowClosed(WindowEvent e ) {
		 
		System.out.println(" Window Closed ");
		
			
	}
	
	public void windowClosing(WindowEvent e ) {
		 
		System.out.println(" Window Closing ");
			
	}
 
 	public void windowDeactivated(WindowEvent e ) {
	 
 		System.out.println(" Window Deactivated ");
		
	}
 	public void windowDeiconified(WindowEvent e ) {
	 
 		System.out.println(" Window Deiconified");
		
	}
 
 	public void windowIconified(WindowEvent e ) {
	 
 		System.out.println(" Window Iconified ");
		
	}

	
	public void windowOpened(WindowEvent e ) {
		 
		System.out.println(" Window Opened");
	}
	
	 
public static void main(String[] args) {
		
		new windowQ();
		
		System.out.println(" Started ");

		

	}

}
	 
	
	 
	 
	 
	
	
	
