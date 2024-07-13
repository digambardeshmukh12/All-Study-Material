package swing;
import javax.swing.*; 

public class jprogresbar extends JFrame  {
	
	
	JProgressBar jb ;
	int i = 0 , num = 0 ;
	jprogresbar(){
		jb = new JProgressBar(0,2000);
		jb.setBounds(40,40,160,30);
		jb.setValue(0);
		
		jb.setStringPainted(true);
		add(jb);
		setSize(250,250);
		setLayout(null);
		setVisible(true);
		itrate();
		
	}
	
	public void itrate() {
		while (i<2000) {
			jb.setValue(i);
			i=i+60 ;
			try {
				Thread.sleep(50);  }
				catch(Exception e ) {}
			
		}
	}


	
	
	public static void main(String[] args) {
		
		new jprogresbar();
		
	}

}
