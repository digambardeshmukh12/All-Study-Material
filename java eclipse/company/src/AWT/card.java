package AWT;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class card extends JFrame implements ActionListener  {
	
	CardLayout card ;
	JButton b1 , b2 , b3 ;
	Container c ;

	
	card(){
		setVisible(true);
		setSize(500,500);
		c = getContentPane();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		card = new CardLayout();
		c.setLayout(card);
		b1 = new JButton("BE1");
		b2 = new JButton("BE2");
		b3 = new JButton("BE3");
		
		c.add(b1 , "A");
		c.add(b2 , "B ");
		c.add(b3 , " C ");
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
	}
	
	 public void actionPerformed(ActionEvent e) {
			card.next(c);
		}
		
	
	

	public static void main(String[] args) {
		
		new card();

	}

}

