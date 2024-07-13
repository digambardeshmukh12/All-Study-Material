package com.company;
import java.awt.*;
import java.awt.event.*;
public class mouse extends Frame implements MouseListener {

    mouse(){
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);

        addWindowListener(

                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    } } );

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
        Image i = t.getImage("C:\\Users\\91930\\OneDrive\\Pictures\\Screenshots\\1.png");
        Graphics g=getGraphics();
        g.drawImage( i, 30, 30, this);
        System.out.println("mouse entered");


    }


    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exited");

    }


    public static void main(String[] args) {


        System.out.println("Clicked");
        new mouse();
    }


}
