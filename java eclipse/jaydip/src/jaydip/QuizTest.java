package jaydip;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JOptionPane;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Lenovo
 */
public class QuizTest extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext,btnResult;
    ButtonGroup bg;
    Label l1 , l2 , l3  ;
	TextField t1 , t2 , t3 ;
	Button b1 ;
    Connection con ;
	ResultSet rs ;
    PreparedStatement stat ;
    int count = 0, current = 0, x = 1, y = 1,now =0;
    int m[] = new int[10];
    
    QuizTest(String s){
    	 super(s);
    	
    	
    	
       
         label = new JLabel();
            add(label);
            bg = new ButtonGroup();
            for (int i=0; i<5; i++){
                radioButtons[i] = new JRadioButton();
                add(radioButtons[i]);
                bg.add(radioButtons[i]);
            }
              btnNext = new JButton("Next");
            btnResult = new JButton("Result");
            btnResult.setVisible(false);
            btnResult.addActionListener(this);
            btnNext.addActionListener(this);
            add(btnNext);
            add(btnResult);
            setData();
            label.setBounds(30,40,450,20);
            radioButtons[0].setBounds(50,80,450,20);
            radioButtons[1].setBounds(50,110,200,20);
            radioButtons[2].setBounds(50,140,200,20);
            radioButtons[3].setBounds(50,170,200,20);
            btnNext.setBounds(100,240,100,30);
            btnResult.setBounds(270,240,100,30);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);
            setLocation(250,100);
            setVisible(true);
            setSize(600,350);
    
    }
    
void jdbc_insert(){
		
		setLayout(new FlowLayout());
		setSize(350,350);
		setVisible(true);
		l1 = new Label("stu_ID");
		l2 = new Label("sty_Name");
		l3 = new Label("stu_marks");
		t1 = new TextField(10);
		t2 = new TextField(15);
		t3 = new TextField(10);
		b1 = new Button("INSERT");
		b1.addActionListener(this);
		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);
		

		}
            void setData(){
            radioButtons[4].setSelected(true);
            if (current==0){
            	
                label.setText("Q1 : What is the size of boolean Variable? ");
                radioButtons[0].setText("8 bit");
                radioButtons[1].setText("16 bit");
                radioButtons[2].setText("32 bit");
                radioButtons[3].setText("not known");
               
            }
            if (current==1){
                label.setText("Q2 : what is the default value of long variable ? ");
                radioButtons[0].setText("0");
                radioButtons[1].setText("0.0");
                radioButtons[2].setText("0L");
                radioButtons[3].setText("not known");
               
            }
              if (current==2){
                label.setText("Q3 : what is the default value of long variable ? ");
                radioButtons[0].setText("true");
                radioButtons[1].setText("false");
                radioButtons[2].setText("null");
                radioButtons[3].setText("not defined");
               
            }
             if (current==3){
                label.setText("Q4 : What kind of varibles a class can consists of? ");
                radioButtons[0].setText("class varibles, instance varibles");
                radioButtons[1].setText("class varibles,local variables, instance varibles");
                radioButtons[2].setText("class varibles");
                radioButtons[3].setText("class varibles,local variables");
               
            }
              if (current==4){
                label.setText("Q5 : what is function overloading ");
                radioButtons[0].setText("method with same name but different parameters.");
                radioButtons[1].setText("method with same name but different return types.");
                radioButtons[2].setText("method with same name, same parameter type but different parameter names");
                radioButtons[3].setText("None of the above");
               
            }
               if (current==5){
                label.setText("Q6 :what is serialization  ");
                radioButtons[0].setText("serialization is a process of writting the state of an objects to another objets.");
                radioButtons[1].setText("serialization is a process of writting the state of an object  to a byte stream.");
                radioButtons[2].setText("Both of the above");
                radioButtons[3].setText("None of the above");
               
            }
                if (current==6){
                label.setText("Q7 : Which of the following is a thread safe ");
                radioButtons[0].setText("StringBuilder");
                radioButtons[1].setText("StringBuffer");
                radioButtons[2].setText("Both of the above");
                radioButtons[3].setText("None of the above");
               
            }
                 if (current==7){
                label.setText("Q8 : What is the size of boolean variable? ");
                radioButtons[0].setText("8 bit");
                radioButtons[1].setText("16 bit");
                radioButtons[2].setText("32 bit");
                radioButtons[3].setText("not precisely defined");
               
            }
                if (current==8){
                label.setText("Q9 : Which is the first language for Andriod Development ");
                radioButtons[0].setText("Java");
                radioButtons[1].setText("Kotlin");
                radioButtons[2].setText("C++");
                radioButtons[3].setText("JavaScript");
               
            } 
                 if (current==9){
                label.setText("Q10 : Number of primitive data types in java are ");
                radioButtons[0].setText("6");
                radioButtons[1].setText("7");
                radioButtons[2].setText("9");
                radioButtons[3].setText("8");
               
            }
                label.setBounds(30,40,450,20);
        int i;
        int j;
                 for(i=0, j=0; i<=90; i+=30,j++){
                radioButtons[j].setBounds(50,80+i,200,20);
                
            }
                 
                 
                 
                 
        }
             boolean checkAns(){
            if(current==0){
                return (radioButtons[1].isSelected());
            }
             if(current==1){
                return (radioButtons[2].isSelected());
            }
             if(current==2){
                return (radioButtons[1].isSelected());
            }
             if(current==3){
                return (radioButtons[1].isSelected());
            }
              if(current==4){
                return (radioButtons[0].isSelected());
            }
             if(current==5){
                return (radioButtons[1].isSelected());
            }
             if(current==6){
                return (radioButtons[1].isSelected());
            }
             if(current==7){
                return (radioButtons[1].isSelected());
            }
             if(current==8){
                return (radioButtons[1].isSelected());
            }
             if(current==9){
                return (radioButtons[3].isSelected());
            }
            
            
            
            
            return false;
        }
    
                 
     public static void main (String[] args){
    	 
    	 
    	 QuizTest obj = new QuizTest ("Simple Quiz APP");
    	 
          
      }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btnNext ){
                if(checkAns())
                    count = count +1;
                current++;
                setData();
                if(current==9){
                    btnNext.setEnabled(false);
                    btnResult.setVisible(true);
                    btnResult.setText("Result");   
                    
                }
            }
            if(e.getActionCommand().equals("Result")){
                if(checkAns())
                 count = count+1; 
                current++;
               JOptionPane.showMessageDialog(this ,"correct answer are "+count);
               System.exit(0);
            
            
    }
            if(e.getSource()==b1) {
    			Integer i =Integer.parseInt(t1.getText());
    			count = Integer.parseInt(t3.getText()) ;//text1.setText(rs.getString("FirstName"));
    			String n = t2.getText() ;
           
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
				stat = con.prepareStatement("insert into student (id,name,marks) values(?,?,?)");
				
				
				stat.setInt(1,i);
				stat.setString(2,n);
				stat.setInt(3, count);
				stat.executeUpdate();
				
				con.close();
				
				
			}
			catch(Exception e2) {
				System.out.println(e2);
			}
    

  
    }
}
}
