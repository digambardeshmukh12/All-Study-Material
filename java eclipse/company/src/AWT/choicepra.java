package AWT;
import java.awt.*;
import java.awt.event.*;
public class choicepra extends Frame implements ItemListener {

	Label l1 ;
	
	Choice c ;
	 choicepra(){
		 setLayout(new FlowLayout());
			setVisible(true);
			setSize(400,300);
			
			l1 = new Label("Choose Color");
			c = new Choice();
			c.add("RED");
			c.add("BLACK");
			c.add("GRAY");
			c.add("BLUE");
			c.add("YELLOW");
			
			add(l1);
			add(c);
			
			
			addWindowListener(
					
					new WindowAdapter() {
						public void windowClosing(WindowEvent e) {
							System.exit(0);
						} } );
			
			c.addItemListener(this);
			
		 
	 }
	
	public void itemStateChanged(ItemEvent e) {
		
		String s = c.getSelectedItem();
		
		if(s.equals("RED"))
			setBackground(Color.red);
		
		if(s.equals("BLACK"))
			setBackground(Color.black);
		
		if(s.equals("GRAY"))
			setBackground(Color.gray);
		
		if(s.equals("BLUE"))
			setBackground(Color.blue);
		
		if(s.equals("YELLOW"))
			setBackground(Color.yellow);
		
	}
	public static void main(String[] args) {
		

		new choicepra();
	}
}
