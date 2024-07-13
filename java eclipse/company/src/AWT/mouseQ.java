package AWT;
import java.awt.*;
import java.awt.event.*;
public class mouseQ extends Frame implements MouseListener {



		mouseQ(){
			setLayout(new FlowLayout());
			setVisible(true);
			setSize(400,400);
		
		addWindowListener(
				
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					} } );
		
		addMouseListener(this);

	}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			Graphics g = getGraphics();
			g.setColor(Color.red);
			g.fillOval (e.getX(), e.getY(), 40, 40); 
			g.fillRect(50,60,50,50);
			System.out.println("mouse Clicked");
			
			
			
			
		}


		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("Pressed");
			
			
		}


		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("Released");
			
		}


		@Override
		public void mouseEntered(MouseEvent e) {
			 Toolkit t=Toolkit.getDefaultToolkit();
			 Image i = t.getImage("D:\\one.jpg");
			  Graphics g=getGraphics();
			 g.drawImage( i, 30, 30, this); 
			 System.out.println("mouse entered");
			 
			 

			
		}


		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("Exited");
			
		}
		
	
	public static void main(String[] args) {
		

		
		new mouseQ();
		
		
		
	}

}



