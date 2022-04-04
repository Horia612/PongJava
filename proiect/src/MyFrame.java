import java.awt.*;


import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JButton button2;
	JLabel label;
	
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("point.png");
		ImageIcon icon2 = new ImageIcon("face.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);
		button.setText("Play Pong!");
		
		button2 = new JButton();
		button2.setBounds(100, 200, 250, 100);
		button2.addActionListener(this);
		button2.setText("Tutorial");
		
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-15);
		button.setForeground(Color.black);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		button2.setFocusable(false);
		button2.setIcon(icon);
		button2.setHorizontalTextPosition(JButton.CENTER);
		button2.setVerticalTextPosition(JButton.BOTTOM);
		button2.setFont(new Font("Comic Sans",Font.BOLD,25));
		button2.setIconTextGap(-15);
		button2.setForeground(Color.black);
		button2.setBackground(Color.lightGray);
		button2.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Menu");
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(button2);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			//TODO
			GameFrame frame = new GameFrame();
			//System.out.println("poo");
			//button.setEnabled(false);
			label.setVisible(true);
		}
		else if(e.getSource()==button2) {
			//System.out.println("poo");
			new MyFrame2();
			//button2.setEnabled(false);
			label.setVisible(true);
		}
	}
}