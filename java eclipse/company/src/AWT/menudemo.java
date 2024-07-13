package AWT;

import java.awt.*;

import java.awt.event.*;

public class menudemo extends Frame  implements ActionListener {
	
	

	menudemo(){
		
		 setLayout(new FlowLayout());
			setVisible(true);
			setSize(1000,1000);
			
			MenuBar mu = new MenuBar();
			setMenuBar(mu);
			
			Menu f = new Menu("File");
			MenuItem i1 = new MenuItem("calculator");
			MenuItem i2 = new MenuItem("choiceQ");
			MenuItem i3 = new MenuItem("listdemo");
			
			i1.setActionCommand("A");
			i2.setActionCommand("B");
			i3.setActionCommand("C");
			
			
			i1.addActionListener(this);
			i2.addActionListener(this);
			i3.addActionListener(this);
			
			
			
			
			
			
			addWindowListener(
					
					new WindowAdapter() {
						
						
						
						public void windowClosing(WindowEvent e) {
							System.exit(0);
							
						} } );
			
			
			f.add(i1);	f.add(i2);  f.add(i3);  mu.add(f);
			
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("A"))
			new Calculator();
		
		if(e.getActionCommand().equals("B")) {
			new choiceQ();
			this.dispose();
	}
		
		if(e.getActionCommand().equals("C")) {
			new listdemo();
			this.dispose();
	}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new menudemo();
		
		
	}

}
