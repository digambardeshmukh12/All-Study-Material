package AWT;

import java.awt.*;
import java.awt.event.*;


public class listdemo extends Frame implements ItemListener {

	
	Label l1 ;
	List l ;
	TextField t1 ;
	
	listdemo(){
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,300);
		
		l1 = new Label("Choose Language");
		l = new List(5,true);
		l.add("C");
		l.add("C++");
		l.add("JAVA");
		l.add("JAVA SCRIPT");
		l.add("HTML");
	
		t1 = new TextField(50);
		
		add(l1);
		add(l);
		add(t1);
		
		
		addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				}
				);
		
	
		l.addItemListener(this);
	
	}
	
	
	
	
	public void itemStateChanged(ItemEvent e) {
		
		String s[] = l.getSelectedItems();
		String d = "Language Selected: ";
		for(String S : s) {
			d = d  + S +  " , " ;
		}
		
		t1.setText(d);
		
		
	}
	public static void main(String[] args) {
		
		new listdemo();

	}

	
}
