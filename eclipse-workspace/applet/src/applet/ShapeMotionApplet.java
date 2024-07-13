package applet;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ShapeMotionApplet extends Applet implements Runnable {
     int x;
     int y;
     int dx;
     int dy;
     Thread animationThread;

    public void init() {
        x = 100;  
        y = 100;  
        dx = 2;   
        dy = 2;  
    }

    public void start() {
        if (animationThread == null) {
            animationThread = new Thread(this);
            animationThread.start();
        }
    }

    public void stop() {
        if (animationThread != null) {
            animationThread.interrupt();
            animationThread = null;
        }
    }

    public void run() {
    	
        while (true) {
            
            x += dx;
            y += dy;

           
            if (x < 0 || x + 50 > getWidth()) {
                dx = -dx;  
            }
            if (y < 0 || y + 50 > getHeight()) {
                dy = -dy;  
            }

            repaint();

            try {
                Thread.sleep(10);  
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public void paint(Graphics g) {
      
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 50);
    }
}
