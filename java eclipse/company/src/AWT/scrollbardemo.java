package AWT;

import java.awt.*;
import java.awt.event.*;

public class scrollbardemo extends Frame implements AdjustmentListener {
	
	Scrollbar sb1 ;
	TextField t1 ;
	
	scrollbardemo(){
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,400);
		
		
		sb1 = new Scrollbar(0,0,10,20,200);
		
		t1 = new TextField(10);
		
		add(sb1); add(t1);
		
		sb1.addAdjustmentListener(this);
		
		
		
			addWindowListener(
				
				new WindowAdapter() {
					
					
					
					public void windowClosing(WindowEvent e) {
						System.exit(0);
						
					} } );
		
		
		
	}
	
	
	public void adjustmentValueChanged(AdjustmentEvent e) {
		
		t1.setText(String.valueOf(sb1.getValue()));
		
	}

	public static void main(String[] args) {
		

		new scrollbardemo();
	}

}
