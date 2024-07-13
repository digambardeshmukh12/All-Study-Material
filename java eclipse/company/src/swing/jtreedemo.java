package swing;
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class jtreedemo extends JFrame {
	
	jtreedemo(){
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
		DefaultMutableTreeNode color  = new DefaultMutableTreeNode("color");
		DefaultMutableTreeNode color1 = new DefaultMutableTreeNode("red");
		DefaultMutableTreeNode color2 = new DefaultMutableTreeNode("blue");
		DefaultMutableTreeNode color3 = new DefaultMutableTreeNode("gray");
		DefaultMutableTreeNode color4 = new DefaultMutableTreeNode("black");
		
		color.add(color1);
		color.add(color2);
		color.add(color3);
		color.add(color4);
		
		JTree  t = new JTree(color);
		add(t);
		
		
		
	}

	public static void main(String[] args) {
		
		new jtreedemo();
		
	}

}
