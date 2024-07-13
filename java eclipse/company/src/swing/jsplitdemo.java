package swing;
import javax.swing.*;
public class jsplitdemo {

	JFrame f ;
	 JTextArea t1 , t2 ;
	 jsplitdemo(){
		 f = new JFrame("FRAME");
		 JPanel p1 = new JPanel();
		 JPanel p2 = new JPanel();

		 t1 = new JTextArea(10,10);
		 t2 = new JTextArea(10,10);

		 p1.add(t1);
		 p2.add(t2);
		 JSplitPane sp = new JSplitPane(SwingConstants.HORIZONTAL , p1 ,p2);
		 f.add(sp);
		 f.setSize(300,300);
		 f.setVisible(true);
		 
		 
	 }
	 
	public static void main(String[] args) {

		new  jsplitdemo();
		
	}

}
