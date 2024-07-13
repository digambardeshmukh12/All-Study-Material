package swing;

import javax.swing.*;

public class jpotiondemo {

	JFrame f ;
	
	jpotiondemo(){
		
		f = new JFrame();
		
		// JOptionPane.showMessageDialog(f,"Wel-Come");

		
		JOptionPane.showConfirmDialog(f, "Do you Sure");
		
	}
	
	
	public static void main(String[] args) {

		
		new jpotiondemo();
	}

}
