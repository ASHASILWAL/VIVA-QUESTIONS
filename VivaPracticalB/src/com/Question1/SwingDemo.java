package com.Question1;

	import java.awt.Color;
	import java.awt.FlowLayout;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;

	public class SwingDemo extends MouseAdapter {
	 JFrame f;
	 JLabel l1, l2, l3, l4;
	 JTextField t1,t2, t3;
	 JButton b;
	 
	 SwingDemo(){
	 f = new JFrame();
	 l1 = new JLabel("Enter Principle");
	 t1 = new JTextField(10);
	 
	 l2 = new JLabel("Enter Time");
	 t2 = new JTextField(10);
	 
	 l3 = new JLabel("Enter Rate");
	 t3 = new JTextField(10);
	 b = new JButton("Find Simple Interest");
	 
	 l4 = new JLabel("Result");
	 
	 f.add(l1);
	 f.add(t1);
	 f.add(l2);
	 f.add(t2);
	 f.add(l3);
	 f.add(t3);
	 f.add(b);
	 b.addMouseListener(this);
	 f.add(l4);
	 f.setLayout(new FlowLayout());
	 f.setSize(500,500);
	 f.setVisible(true);
	 
	 
	 }

	 public void mousePressed(MouseEvent e){
	 try{
	  float x, y, z, result;
	  x = Float.parseFloat(t1.getText());
	  y = Float.parseFloat((t2.getText()));
	  z = Float.parseFloat((t3.getText()));
	  result = (x*y*z)/100;
	  l4.setText(result + "");
	  l4.setForeground(Color.GREEN);
	 }
	 catch(Exception ex){
	 System.out.println(ex.getMessage());
	 }
	 
	 }
	 
	 public static void main(String[] args){
	 new SwingDemo();
	 }



	}

