package AWT;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ShapeMotionApplet extends Applet implements Runnable {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Thread animationThread;

    public void init() {
        x = 100;  // Initial x position
        y = 100;  // Initial y position
        dx = 2;   // Change in x position per frame
        dy = 2;   // Change in y position per frame
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
            // Update the position of the shape
            x += dx;
            y += dy;

            // Check if the shape hits the boundaries of the applet
            if (x < 0 || x + 50 > getWidth()) {
                dx = -dx;  // Reverse the x direction
            }
            if (y < 0 || y + 50 > getHeight()) {
                dy = -dy;  // Reverse the y direction
            }

            repaint();  // Trigger a repaint of the applet

            try {
                Thread.sleep(10);  // Delay between frames (adjust as needed)
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public void paint(Graphics g) {
        // Clear the applet
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw the shape at the current position
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 50);
    }
}
