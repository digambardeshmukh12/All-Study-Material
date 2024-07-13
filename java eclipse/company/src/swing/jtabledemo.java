package swing;


import java.awt.*;
import javax.swing.*;

public class jtabledemo extends JFrame {

	jtabledemo(){
		
		String data [][] =  {
			{"101", " Amit " , "67000"},
			{"101", " Amit " , "67000"},
			{"101", " Amit " , "67000"}};
		
		String column [] = {"ID" , "Name" , " Salary "};
		JTable jt = new JTable(data ,column );
		jt.setBounds(40 , 100 , 200 , 300);
		
		JScrollPane sp =  new JScrollPane(jt);
		add(sp);
		setSize(400 , 400);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {

		new jtabledemo();
		
	}

}
