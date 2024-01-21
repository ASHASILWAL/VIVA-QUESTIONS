package com.demo;

	import java.awt.Color;
	import java.awt.FlowLayout;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;

	public class test extends MouseAdapter {
	 JFrame frame;
	 JLabel label1, label2, label3, label4;
	 JTextField text1,text2, text3;
	 JButton button;
	 
	 test(){
	 frame = new JFrame();
	 label1 = new JLabel("Length : ");
	 text1 = new JTextField(10);
	 
	 label2 = new JLabel("Breadth : ");
	 text2 = new JTextField(10);
	 

	 button = new JButton("Area and Perimeter");
	 label3 = new JLabel("Perimeter");
	 label4 = new JLabel("Area");
	 
	 frame.add(label1);
	 frame.add(text1);
	 frame.add(label2);
	 frame.add(text2);

	 frame.add(button);
	 button.addMouseListener(this);
	 frame.add(label3);
	 frame.add(label4);
	 frame.setLayout(new FlowLayout());
	 frame.setSize(500,500);
	 frame.setVisible(true);
	 
	 
	 }

	 public void mousePressed(MouseEvent e){
	 try{
	  float a, b,  perimeter, area;
	  a = Float.parseFloat(text1.getText());
	  b = Float.parseFloat((text2.getText()));

	  perimeter = 2*(a+b);
	  area = (a*b);
	  label3.setText(perimeter + "");
	  label4.setText(area + "");

	 }
	 catch(Exception ex){
	 System.out.println(ex.getMessage());
	 }
	 
	 }
	 
	 public static void main(String[] args){
	 new test();
	 }



	}

