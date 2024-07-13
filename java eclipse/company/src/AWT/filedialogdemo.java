package AWT;

import java.awt.*;
import java.awt.event.*;

public class filedialogdemo  {

	Frame f ;
	Label  l1 , l2 ;
	Button b1 ;
	filedialogdemo(){
		
		f = new Frame("JAVA AWT Examples");
		f.setSize(400,400);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
				}
				
				);
		
		l1 = new Label("Control in Action : FileDialog");
		l2 = new Label();
		f.add(l1);
		f.add(l2);
		FileDialog filedialog = new FileDialog(f,"Select file");
		b1 = new Button("open file ");
		f.add(b1);
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filedialog.setVisible(true);
				l2.setText("File Selected "
				+ filedialog.getDirectory() + filedialog.getFile());
				
				
			}
		});
		
		
	}
	public static void main(String[] args) {
		

		new filedialogdemo();
		
	}

}
