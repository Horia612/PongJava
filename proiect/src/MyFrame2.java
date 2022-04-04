import java.awt.*;


import java.awt.event.*;
import javax.swing.*;

public class MyFrame2 extends JFrame{

	JLabel label2 = new JLabel("Hello there players!");
	JLabel label3 = new JLabel("Welcome to Pong! The rules are really simple!");
	JLabel label4 = new JLabel("1)You control the red paddle with the \"wasd\" keys!");
	JLabel label5 = new JLabel("2)You control the blue paddle with the \"^<v>\" arrows!");
	JLabel label6 = new JLabel("3)You must not let the ball pas your paddle!");
	JLabel label7 = new JLabel("4)Earn score by launching the ball into enemy borders!");
	
	MyFrame2(){
		
		ImageIcon icon = new ImageIcon("point.png");
		ImageIcon icon2 = new ImageIcon("face.png");
		
		  label2.setBounds(0,0,300,50);
		  label2.setFont(new Font(null,Font.PLAIN,18));
		  
		  label3.setBounds(0,0,400,100);
		  label3.setFont(new Font(null,Font.PLAIN,16));
		  
		  label4.setBounds(0,0,400,150);
		  label4.setFont(new Font(null,Font.PLAIN,16));
		  
		  label5.setBounds(0,0,400,200);
		  label5.setFont(new Font(null,Font.PLAIN,16));
		  
		  label6.setBounds(0,0,400,250);
		  label6.setFont(new Font(null,Font.PLAIN,16));
		  
		  label7.setBounds(0,0,400,300);
		  label7.setFont(new Font(null,Font.PLAIN,16));
		
		  this.setTitle("Tutorial");
		  this.add(label2);
		  this.add(label3);
		  this.add(label4);
		  this.add(label5);
		  this.add(label6);
		  this.add(label7);
		  
		  //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setSize(420,420);
		  this.setLayout(null);
		  this.setVisible(true);
	}

	//@Override
}