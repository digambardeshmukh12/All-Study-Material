package AWT;
import java.awt.*;
import java.applet.*;
public class demo extends Applet {
	public void paint(Graphics g) {
		String s = "Hello";
		g.drawString(s, 30, 60);
	}

}
