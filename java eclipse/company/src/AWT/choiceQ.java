package AWT;
import java.awt.*;
import java.awt.event.*;


public class choiceQ extends Frame implements ItemListener {

	Label l1 ,l2 ;
	TextField t2 ;
	Choice c ;
	
	
	
	choiceQ(){
	
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,300);
		l1 = new Label("Choose Number");
		c = new Choice();
		c.add("4");
		c.add("5");
		c.add("6");
		
		l2 = new Label("Square is ");
		t2 = new TextField(13);
		add(l1); add(c);add(l2);add(t2);
		
		
		addWindowListener(
				
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					} } );
		
		c.addItemListener(this);
		
		
	}
	
public void itemStateChanged(ItemEvent e) {
		
	String s = c.getSelectedItem();
	
	if(s.equals("4")) 
	{
		
		int a= 4*4;
		
		t2.setText(String.valueOf(a));
	}
	
	if(s.equals("5"))
	{
		int a = 5*5;
		
		t2.setText(String.valueOf(a));
	}
	
	
	if(s.equals("6"))
	{	
		int a = 6*6;
		
		t2.setText(String.valueOf(a));
	}
		
		
	}
	
	public static void main(String[] args) {
		
		new choiceQ();

	}


}
